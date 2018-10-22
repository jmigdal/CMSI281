/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  Josephus.java
 *  Purpose       :  Program to simulate and solve the Josephus problem
 *  Author        :  Kathryn Cole, James Migdal
 *  Date          :  2018-10-21
 *  Description   :  See purpose
 *  Notes         :  None
 *  Warnings      :  None
 *  Exceptions    :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

public class Josephus {
   
   public Josephus() {
   }
   
   //given a group size, count, and start position will print deaths and the winner
   public void runProblem( int size, int count, int start) {            
      CircularLinkedList jose = new CircularLinkedList();               //create circle                 
      for( int i = 1; i <= size; i++ ) {
         jose.insert(i);
      }
      
      while( jose.getSize() > 1 ) {                                                                          
         for( int j = 0; j < count + 1; j++ ) {                         //find each death and print dead
            jose.step();
         }
         CircularLinkedList.Iterator myIt = jose.getIteratorAt( 0 );
         System.out.print( myIt.getCurrentInt() + " " );
         jose.remove();
      }
      CircularLinkedList.Iterator myIt = jose.getIteratorAt( 0 );       //print last alive as the winner
      System.out.println( "| Winner is " + myIt.getCurrentInt() );
   }
   
   public void solveProblem( int size, int place ) {
      boolean found = false;
      int count = 1;
      
      while( found == false ) {                                         //test count lengths until desired outcome is found
         CircularLinkedList jose = new CircularLinkedList();            //create circle  
         for( int i = 1; i <= size; i++ ) {
            jose.insert(i);
         }
      
         while( jose.getSize() > 1 ) {                                  //go through all deaths until a winner is found
            for( int j = 0; j < count + 1; j++ ) {
               jose.step();
            }
            jose.remove();
         }
         
         CircularLinkedList.Iterator myIt = jose.getIteratorAt( 0 );
         if( myIt.getCurrentInt() == place ) {                          //check if winner matches who winner should be
            System.out.println( "Count should be " + count );           //    if yes, set found flag true, print correct count 
            found = true;
         }
         count++;
      }
   }

      
      
   
   public static void main( String[]args ) {
      Josephus death = new Josephus();
      death.runProblem( 7, 2, 1 );        //7 people, count of 2, start at 1:    Winner is 4
      death.solveProblem( 7, 4 );         //7 people, position 4 should live:    Count should be 2
      
      death.runProblem( 20, 2, 1 );       //20 people, count of 2, start at 1:   Winner is 20
      death.solveProblem( 20, 20 );       //20 people, position 20 should live:  Count should be 2
      
      death.runProblem( 99, 17, 1 );      //99 people, count of 17, start at 1:  Winner is 92
      death.solveProblem( 99, 92 );       //99 people, position 92 should live:  Count should be 17
   }
}