 /** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  IntQueueTester.java
 *  Purpose       :  Tests the IntQueue.java program
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
public class IntQueueTester {
   
   public static void main( String[]args ) {
      IntQueue myQueue = new IntQueue();
      
      myQueue.enqueue( 1 );
      myQueue.enqueue( 9 );
      myQueue.enqueue( 5 );
      myQueue.enqueue( 3 );
      myQueue.enqueue( 8 );
      myQueue.enqueue( 6 );
      
      System.out.println( myQueue.peek() );     //1
      myQueue.dequeue();
      System.out.println( myQueue.peek() );     //9
      myQueue.dequeue();
      System.out.println( myQueue.peek() );     //5
      myQueue.dequeue();
      System.out.println( myQueue.peek() );     //3
      myQueue.dequeue();
      System.out.println( myQueue.peek() );     //8
      myQueue.dequeue();
      System.out.println( myQueue.peek() );     //6
      myQueue.dequeue();                        //Exception
      
      IntQueue newQueue = new IntQueue();
      System.out.println( newQueue.peek() );     //Exception
   }
   
}