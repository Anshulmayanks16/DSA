import java.sql.SQLOutput;
import java.util.*;

class my {
 public static void main (String args[]){
     LinkedList <String> list  = new LinkedList<String>();
     list.addFirst("a");
     list.addFirst("is");
     System.out.println(list);


     list.addFirst("this");
     list.addLast("list");
     System.out.println(list);
     System.out.println(list.size());
     for(int i = 0; i<list.size();i++){
         System.out.println(list.get(i)+ "_>");
     }
     System.out.println("null");
     list.remove(3);
    System.out.println(list);
 }
}
