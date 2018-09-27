 /** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  IntLinkedList.java
 *  Purpose       :  Creates and organizes a linked list
 *  Author        :  James Migdal
 *  Date          :  2018-09-19
 *  Description   :  See purpose
 *  Notes         :  None
 *  Warnings      :  None
 *  Exceptions    :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  Revision Histor
 *  ---------------
 *            Rev      Date     Modified by:  Reason for change/modification
 *           -----  ----------  ------------  -----------------------------------------------------------
 *  @version 1.0.0  2018-09-19  James Migdal  Initial writing and release
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
 
 public class IntLinkedList {

      private Node head;
      private int  size;

      IntLinkedList() {
         head = null;
         size = 0;
      }

      public int getSize() {                                //returns the size of the list
         return size;
      }

      public void prepend( int dataToAdd ) {                //adds data to the beginning of the list
         Node currentHead = head;
         head = new Node( dataToAdd );
         head.next = currentHead;
         size++;
      }
      
      public void insertAt( int dataToAdd, int index ) {    //inserts data at a given index of the list
         Iterator myIt = getIteratorAt( index );
         Node insertNode = new Node( dataToAdd );
         insertNode.next = myIt.currentNode.next;
         myIt.currentNode.next = insertNode;
         size++;
      }
      
      public void removeAt( int index ) {                   //removes the data at a given index of the list
         Iterator firstIt = getIteratorAt( index - 1 );
         Iterator seconIt = getIteratorAt( index + 1 );
         firstIt.currentNode.next = seconIt.currentNode;
         size--;
      }

      private class Node {

         int data;           
         Node next;           

         Node( int d ) {
            data = d;
            next = null;
         }
      }

      public Iterator getIteratorAt( int index ) {
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

         public void next() {                               //moves iterator to the next node in the iterator
            if( currentNode == null ) {
               return;
            } else {
               currentNode = currentNode.next;
            }
         }

         public boolean hasNext() {                         //returns true if there is another node in the iterator
            return ((currentNode != null) && (currentNode.next != null));
         }

         public int getCurrentInt() {                       //returns data from current node of the iterator
            return currentNode.data;
         }

      }
   }
