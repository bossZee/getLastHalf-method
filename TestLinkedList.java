package mylinkedlist;

/**
 *
 * @author Zinhle
 */
public class TestLinkedList {

    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<Integer>();
        
        System.out.println("Call on empty list \nContents of list: "+list);
        System.out.println("Add objects");
        list.append(new Integer(5));
        list.append(new Integer(9));
        list.prepend(new Integer(4));
        list.prepend(new Integer(0));
        System.out.println("Contents of list: "+list);
        System.out.println("Clear List");
        list.clear();
        System.out.println("Contents of list: "+list);
        
        
        System.out.println("\nCreating new list");
        list.append(new Integer(5));
        list.append(new Integer(9));
        list.append(new Integer(4));
        list.append(new Integer(0));
        list.append(new Integer(12));
        list.append(new Integer(1));
        list.append(new Integer(25));
        list.append(new Integer(7));
        System.out.println("Contents of list: "+list);
        System.out.println("\nGetting second half of List");
        list.getLastHalf();
        System.out.println("Contents of list: "+list);
        
        System.out.println("\nDelete an object");
        list.delete(new Integer(0));
        System.out.println("Contents of list: "+list);
        
    }
    
}
