package studyDataStructure.hashtablle;

public class myCloseHashing {
    public Slot[] hashtable;

    public myCloseHashing(Integer size){
        this.hashtable = new Slot[size];
    }

    public class Slot {
        String key;
        String value;

        Slot(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public int hashFunc(String key){
        return (int)(key.charAt(0)) % this.hashtable.length;
    }

    public boolean saveData(String key, String value){
        Integer address = this.hashFunc(key);
        if(this.hashtable[address] != null){
            if(this.hashtable[address].key == key)  {
                this.hashtable[address].value = value;
                return true;
            }else{
                Integer currAddress = address + 1;
                while(this.hashtable[currAddress] != null){
                    if(this.hashtable[currAddress].key == key){
                        this.hashtable[currAddress].value = value;
                        return true;
                    }else{
                        currAddress++;
                        if(currAddress >= hashtable.length){
                            return false;
                        }
                    }
                }
                this.hashtable[currAddress] = new Slot(key, value);
                return true;
            }
        }else {
            this.hashtable[address] =   new Slot(key, value);
        }

        return true;
    }

    public String getData(String key){
        Integer address = this.hashFunc(key);
        if(this.hashtable[address] != null){
            if(this.hashtable[address].key == key){
                return this.hashtable[address].value;
            }else{
                Integer currAddress = address + 1;
                while(this.hashtable[currAddress] != null){
                    if (this.hashtable[currAddress].key == key) {
                        return this.hashtable[currAddress].value;
                    }else{
                        currAddress++;
                        if(currAddress>=hashtable.length){
                            return null;
                        }
                    }
                }

                return null;
            }
        }else {
            return null;
        }
    }
}
