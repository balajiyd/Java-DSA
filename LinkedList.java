//MAIN CLASS
public class Main {
    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.prepend(5);
        //System.out.println(myLinkedList.removeLast().value);

       // System.out.println(myLinkedList.getHead());
       // System.out.println(myLinkedList.getTail());
        //System.out.println(myLinkedList.getLength());
        //System.out.println(myLinkedList.removeFirst().value);

        //System.out.println(myLinkedList.get(1).value);
        //System.out.println(myLinkedList.set(1,4));
        System.out.println(myLinkedList.insert(4,2));
        //myLinkedList.remove(2);
        myLinkedList.reverse();
        myLinkedList.printList();





    }

}

// LINKED LIST CLASS


    public class LinkedList {
        private Node head;
        private Node tail;
        private int length;
        public class Node {
            int value;
            Node next;
            Node(int value) {
                this.value = value;
            }
        }

        public LinkedList(int value){
            Node newNode = new Node(value);
            head = newNode;
            tail = newNode;
            length = 1;
        }
        public void printList(){
            Node temp = head;
            while(temp != null){
                System.out.println("Value: "+temp.value);
                temp = temp.next;
            }
        }

        public int getLength() {
            System.out.print("Length: ");
            return length;

        }

        public int getHead() {
            System.out.print("Head: ");
            return head.value;
        }
        public int getTail(){
            System.out.print("Tail: ");
            return tail.value;
        }
        public void append(int value){
            Node newNode = new Node(value);
            if(length==0){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                tail = newNode;
            }
            length++;
        }
        public Node removeLast(){
            if(length==0){
                return null;
            }
            Node temp = head;
            Node pre = head;
            while(temp.next!=null){
                pre = temp;
                temp = temp.next;
            }
            tail = pre;
            tail.next = null;
            length--;
            if(length==0){
                head = null;
                tail = null;
            }
            return temp;
        }
        public void prepend(int value){
            Node newNode = new Node(value);
            if(length==0){
                head = newNode;
                tail = newNode;
            }
            if(length>0){
                newNode.next = head;
                head = newNode;
            }
            length++;

        }
        public Node removeFirst(){
            Node temp = head;
            head = head.next;
            temp.next = null;
            length--;
            if(length==0){
                tail = null;
            }
            return temp;
        }
        public Node get(int index){
            if(index<0 || index>=length){
                return null;
            }
            Node temp = head;
            int i=0;
            while(i<index){
                temp = temp.next;
                i++;
            }
            return temp;
        }
        public Boolean set(int index, int value){
            Node temp = get(index);
            if(temp != null){
                temp.value = value;
                return true;
            }
            return false;
        }
        public boolean insert(int index, int value){
            if(index<0 || index>length){return false;}
            if(index==0){
                prepend(value);
                return true;
            }
            if(index==length){
                append(value);
                return true;
            }
            Node newNode = new Node(value);
            Node temp = get(index-1);

            newNode.next = temp.next;
            temp.next = newNode;
            length++;
            return true;

        }
        public Node remove(int index){
            if(index<0||index>=length){
                return null;
            }
            if(index==0){
                return removeFirst();
            }
            if(index==length-1){
                return removeLast();
            }
            Node pre = get(index-1);
            Node temp = pre.next;
            pre.next = temp.next;
            temp.next = null;
            length--;
            return temp;
        }
        public void reverse(){
            Node temp = head;
            head=tail;
            tail = temp;
            Node after = temp.next;
            Node before = null;
            for(int i=0;i<length;i++){
                after = temp.next;
                temp.next = before;
                before = temp;
                temp = after;

            }
        }
    }

