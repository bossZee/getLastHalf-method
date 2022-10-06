package mylinkedlist;

/**
 *
 * @author Zinhle
 */
public class MyLinkedList<E>  {
  private Node<E> head, tail;
 
  public MyLinkedList() {
     head = null;
	 tail = null;
  }

  /** Return the head element in the list */
  public E getFirst() {
    if (head == null) {
      return null;
    }
    else {
      return head.element;
    }
  }

  /** Return the last element in the list */
  public E getLast() {
    if (head==null) {
      return null;
    }
    else {
      return tail.element;
    }
  }

  /** Add an element to the beginning of the list */
  public void prepend(E e) {
    Node<E> newNode = new Node<>(e); // Create a new node
    newNode.next = head; // link the new node with the head
    head = newNode; // head points to the new node
   
    if (tail == null) // the new node is the only node in list
      tail = head;
  }

  /** Add an element to the end of the list */
  public void append(E item) {
    
	Node<E> newNode = new Node<>(item); // Create a new for element e

    if (head == null) {
      head = tail = newNode; // The new node is the only node in list
    }
    else {
      tail.next = newNode; // Link the new with the last node
      tail = newNode; // tail now points to the last node
    }
  }

  
  /** Remove the head node and
   *  return the object that is contained in the removed node. */
  public E removeFirst() {
    if (head == null) {
      return null;
    }
    else {
      E temp = head.element;
      head = head.next;
      if (head == null) {
        tail = null;
      }
      return temp;
    }
  }

public boolean delete(E item)
   {
	   Node<E> ptr = head;
	   Node<E> prvPtr = null;
	   while (ptr!= null&& ((Comparable)ptr.element).compareTo(item)!= 0)
	   {
		   prvPtr=ptr;
		   ptr=ptr.next;
	   }
	   if (ptr == null)//item not found
		   return false;
	   if (ptr==head) // item is first element
		   head= head.next;
	   else // general case
		   prvPtr.next=ptr.next;
	   if (ptr==tail)// last element
		   tail=prvPtr;
	   return true;
   }

  public void getLastHalf(){
      int count=0;
      
      if(head==null) return;
      
      else{
          while(head!=null){
              count++;
          }
      }
      int mid=count/2;
      if(mid %2 !=0){
          mid+=1;
      }
      for(int i=mid;i<=count;i++){
          System.out.println(head.element);
      };
  }

 
  public String toString() {
    String result = "[";

    Node<E> ptr = head;
    for (ptr= head;ptr!=null; ptr=ptr.next) 
	{
		 result = result +  ptr.element.toString();     
		 if (ptr.next != null)
             result = result + ","; // add commas but not to the final 1   
	}
    result += "]"; // Insert the closing ] in the string
    return result;
  }


  public void clear() {
     head = tail = null;
  }


  private static class Node<E> {
    E element;
    Node<E> next;

    public Node(E element) {
      this.element = element;
	  next = null;
    }
  }
   
} // end myLinkedList class

/*Node ptr1=head;
      Node ptr2=head;
      Node temp;
      
      if(head==null){
          return;
      }
      
      while(ptr1.next!=head && ptr1.next.next!=head){
          ptr1=ptr1.next.next;
          ptr2=ptr2.next;
      }
      
      if(ptr1.next.next==head){
          ptr1=ptr1.next;
      }
      
      head1=head;
      
      if(head.next!=head){
          head2=ptr2.next;
      }
      
      ptr1.next=ptr2.next;
      
      temp=head2;
      if(head2!=null){
          while(temp!=head2){
              System.out.print(temp.element+" ");
              temp=temp.next;
          }
      }
      */