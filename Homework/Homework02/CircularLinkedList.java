/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  CircularLinkedList.java
 *  Purpose       :  Creates a circular linked list data structure.
 *  Author        :  Kathryn Cole, James Migdal
 *  Date          :  2018-10-15
 *  Description   :  See purpose
 *  Notes         :  None
 *  Warnings      :  None
 *  Exceptions    :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

public class CircularLinkedList {

   private Node head;                        //current head
   private int  size;

   // the constructor
   CircularLinkedList() {
      head = null;
      size = 0;
   }

   public int getSize() {
      return size;
   }

   public void insert( int dataToAdd ) {    //inserts data after location of head
      if ( getSize() == 0 ) {
         Node currentHead = head;
         head = new Node( dataToAdd );
         head.next = currentHead;
         size++;
      } else if ( getSize() == 1 ) {
         Node currentHead = head;
         head = new Node( dataToAdd );
         head.next = currentHead;
         currentHead.next = head;
         size++;
      } else {   
         Node insertNode = new Node( dataToAdd );
         insertNode.next = head.next;
         head.next = insertNode;
         head = insertNode;
         size++;
      }
   }
      
   public void remove() {                             //removes the current node
      for (int i = 0; i < size - 1; i ++) {
         step();
      }
      Node removeNode = head.next;
      head.next = removeNode.next;
      size--;
   }
   
   public void step() {
      head = head.next;
   }

   private class Node {                                  //given Node class

      int data;            
      Node next;           

      // constructor
      Node( int d ) {
         data = d;
         next = null;
      }
   }

   public Iterator getIteratorAt( int index ) {          //given Iterator class
      if( (index > size) || (index < 0) ) {
         throw new IllegalArgumentException();
      }
      Iterator it = new Iterator();
      while( index > 0 ) {
         it.next();
         index--;
      }
      return it;
   }

   public class Iterator {                            
      private Node currentNode;

      Iterator() {
         currentNode = head;
      }

      public void next() {
         if( currentNode == null ) {
            return;
         } else {
            currentNode = currentNode.next;
         }
      }

      public boolean hasNext() {
         return ((currentNode != null) && (currentNode.next != null));
      }

      public int getCurrentInt() {
         return currentNode.data;
      }

   }
}