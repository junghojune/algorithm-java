package studyDataStructure.hashtablle;

public class myOpenHashing {
    //  대표적인 chaning 기법 연습
    public Slot[] hashtable;

    public myOpenHashing(Integer size) {
        this.hashtable = new Slot[size];
    }

    public class Slot {
        String key;
        String value;
        Slot next;

        Slot(String key, String value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    public int hashFunc(String key) {
        return (int) (key.charAt(0)) % this.hashtable.length;
    }

    public boolean saveData(String key, String value) {
        Integer address = this.hashFunc(key);
        if (this.hashtable[address] != null) {
            Slot findSlot = this.hashtable[address];
            Slot prevSlot = this.hashtable[address];
            while (findSlot != null) {
                if (findSlot.key == key) {
                    findSlot.value = value;
                    return true;
                } else {
                    prevSlot = findSlot;
                    findSlot = findSlot.next;
                }
            }
            prevSlot.next = new Slot(key, value);
        } else {
            this.hashtable[address] = new Slot(key, value);
        }

        return true;
    }

    public String getData(String key) {
        Integer address = this.hashFunc(key);
        if (this.hashtable[address] != null) {
            Slot findSlot = this.hashtable[address];
            while(findSlot != null){
                if(findSlot.key != null){
                    return findSlot.value;
                }else{
                    findSlot= findSlot.next;
                }
            }
            return null;
        } else {
            return null;
        }
    }
}
