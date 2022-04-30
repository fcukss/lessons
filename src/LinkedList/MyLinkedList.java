package LinkedList;

import java.util.Arrays;

public class MyLinkedList {
    private Node head;
    private int size;

    public void add(int value){
        //если это первое добавление в список
        if (head==null) {
                this.head = new Node(value);
        } else{
            Node temp = head;

            while (temp.getNext() != null){
                temp = temp.getNext();

                // проходим по списку и
            }
            temp.setNext(new Node(value));

        }

        size++;
    }

    public int get(int index){
        int currentIndex = 0;
        Node temp = head;
        while (temp != null){
            if(currentIndex == index){
                return temp.getValue();
            } else {
                temp = temp.getNext();
                currentIndex++;
            }
        }
        // достаем значение из листа под индексом
        throw new IllegalArgumentException();
    }

    public void remove(int index){
        if (index == 0){
            head = head.getNext();
            size--;
            return;
        }

        int currentIndex = 0;
        Node temp = head;
        while (temp != null){
            if(currentIndex == index - 1){
                temp.setNext(temp.getNext().getNext());
                size--;
                return;
// [1]-> [2] -> [3] ->null
                // находимя на узле 1 и удалемя узел 2 и дальше ссілаемся а узел 3, и
                // и узел 3 становится вместо узла 2
                //[1] -> [3] ->null
            } else {
                temp = temp.getNext();
                currentIndex++;
            }
        }
    }

    public String toString(){
        int[] result = new int[size];

        int idx = 0;
        Node temp = head;

        while(temp !=null){
            result[idx++] = temp.getValue(); //инкрементируем счетчик индекс
             temp = temp.getNext();
        }

        return Arrays.toString(result);
    }


    private static class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
