import java.sql.SQLOutput;

class LL{
    Node head;
    class Node {
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(String data){
        Node newNode = new Node (data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;


    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;

        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;

        }
        currNode.next = newNode;
    }

    public void printlist(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }
    public void deleteFirst(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        head = head.next;
    }
    public void deleteLast(){
        if(head == null){
            System.out.println("This list is empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node SecondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            SecondLast = SecondLast.next;
        }
        SecondLast.next = null;
    }


    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printlist();
        list.addLast("list");
        list.printlist();

        list.deleteFirst();
        list.printlist();

        list.deleteLast();
        list.printlist();
    }
    
    
    
    
}
