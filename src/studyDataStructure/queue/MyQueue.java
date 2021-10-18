package studyDataStructure.queue;

import java.util.ArrayList;

public class MyQueue<T> {
    // arraylist  이용해서 queue  구조 만들기

    ArrayList<T> data_list = new ArrayList<T>();

    public void enqueqe(T item) {
        data_list.add(item);
    }

    public T dequeue(){
        if(data_list.isEmpty()){
            return  null;
        }

        return data_list.remove(0);
    }

    public static void main(String[] args) {
        MyQueue<Integer> mq = new MyQueue<Integer>();
        mq.enqueqe(1);
        mq.enqueqe(2);
        mq.enqueqe(3);
        mq.enqueqe(4);
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());



    }

}
