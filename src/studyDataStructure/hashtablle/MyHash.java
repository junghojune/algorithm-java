package studyDataStructure.hashtablle;

public class MyHash {
    public Slot[] hashtable;

    public MyHash(Integer size){
        this.hashtable = new Slot[size];
    }

    public class Slot{
        String value;
        Slot(String value){
            this.value = value;
        }
    }

    public int hashFunc(String key){
        return (int)(key.charAt(0)) % this.hashtable.length;
    }

    public boolean saveData(String key, String value){
        Integer address = this.hashFunc(key);
        if(this.hashtable[address] != null){
            this.hashtable[address].value = value;
        }else {
            this.hashtable[address] =   new Slot(value);
        }

        return true;
    }

    public String getData(String key){
        Integer address = this.hashFunc(key);
        if(this.hashtable[address].value != null){
            return this.hashtable[address].value;
        }else {
            return null;
        }
    }
}
