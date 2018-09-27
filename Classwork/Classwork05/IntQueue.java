 /** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  IntQueue.java
 *  Purpose       :  Uses IntLinkedList.java to create a queue
 *  Author        :  James Migdal
 *  Date          :  2018-09-26
 *  Description   :  See purpose
 *  Notes         :  None
 *  Warnings      :  None
 *  Exceptions    :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  Revision Histor
 *  ---------------
 *            Rev      Date     Modified by:  Reason for change/modification
 *           -----  ----------  ------------  -----------------------------------------------------------
 *  @version 1.0.0  2018-09-26  James Migdal  Initial writing and release
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
import java.lang.*; 
 
public class IntQueue {

   IntLinkedList myQueue;

   IntQueue() {
      myQueue = new IntLinkedList();         // constructor
   }

   public void enqueue( int itemToPush ) {      //adds items to the queue
      myQueue.prepend( itemToPush );
   }

   public int peek() throws IllegalArgumentException {
      if ( myQueue.getSize() == 0 ) {
         throw new IllegalArgumentException("Queue is empty");
      } else {
         return myQueue.getIteratorAt( myQueue.getSize() - 1 ).getCurrentInt();     // we use the iterator
      }
   }

   public void dequeue() throws IllegalArgumentException {                         //removes items from the queue
      System.out.println( "size is: " + myQueue.getSize() );
      if ( myQueue.getSize() == 1 ) {
         myQueue = new IntLinkedList();
      } else if ( myQueue.getSize() == 0 ) {
         throw new IllegalArgumentException("Nothing to dequeue");
      } else {
         myQueue.removeAt( myQueue.getSize() - 1 );
      }
   }
}