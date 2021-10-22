package studyDataStructure.linkedList;

import javax.xml.soap.Node;

public class SingleLinkedList<T> {
    // node 연습하기

    public Node head = null;

    public class Node<T>{
        T data;
        Node<T> next = null;

        public Node(T data){
            this.data = data;
        }
    }

    public void addNode(T data){
        if(head == null){
            head = new Node<T>(data);
        } else {
            Node<T> node = this.head;
            while(node.next != null){
                node = node.next;
            }
            node.next = new Node<T>(data);
        }
    }

    public void printAll(){
        if (head != null) {

            Node<T> node = this.head;
            System.out.println(node.data);
            while(node.next != null){
                node = node.next;
                System.out.println(node.data);
            }
        }
    }

    public Node<T> search(T data){
        if(this.head == null){
            return null;
        }else {
            Node<T> node = this.head;
            while(node != null){
                if(node.data == data){
                    return node;
                }else{
                    node = node.next;
                }
            }
            return null;
        }
    }
    public void addNodeInside(T data, T isData){
        Node<T> searchNode = this.search(isData);

        if(searchNode == null){
            this.addNode(data);
        }else{
            Node<T> nextNode = searchNode.next;
            searchNode.next = new Node<T>(data);
            searchNode.next.next = nextNode;

        }
    }
    public static void main(String[] args) {
        SingleLinkedList<Integer> myLinkedList = new SingleLinkedList<Integer>();
        myLinkedList.addNode(1);
        myLinkedList.addNode(2);
        myLinkedList.addNode(3);
        myLinkedList.addNode(4);

        System.out.println(myLinkedList.head.data);
        System.out.println(myLinkedList.head.next.data);

        myLinkedList.addNodeInside(5,1);
        myLinkedList.printAll();


    }

}
