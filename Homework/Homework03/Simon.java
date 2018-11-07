/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  Simon.java
 *  Purpose       :  Program to simulate the Simon memory game
 *  Author        :  Kathryn Cole, James Migdal
 *  Date          :  2018-11-03
 *  Description   :  See purpose
 *  Notes         :  None
 *  Warnings      :  None
 *  Exceptions    :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

import java.util.Scanner;

public class Simon {
   
   public Simon() {
      
   }
   
   public static void playGame() {
      int round = 1;                                                                            //Initialize variables
      boolean lose = false;
      char color = 'B';
      double random;
      char guess;
      char[] sequence = new char[30];
      Scanner reader = new Scanner(System.in);
      
      System.out.println("Welcome to the Simon game!");                                         //Introduce the game
      System.out.println("Watch the sequence and repeat it back one character at a time.");
      try {
         Thread.sleep(5000);
      } catch (InterruptedException e) { 
         Thread.currentThread().interrupt();
      }
      System.out.print("Ready?... ");
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) { 
         Thread.currentThread().interrupt();
      }
      System.out.println("GO!");
      
      while( !lose ) {                                                     //Run loop until user loses the game
         if( round != 1 ) {
            System.out.println("Good Job! Next Round");
         }
         
         for( int i = 0; i < round; i++ ) {                                //Output the colors one at a time
            random = Math.random()*10;
            
            if( random < 2.5 ) {
               color = 'B';
            } else if( random >= 2.5 && random < 5 ) {
               color = 'Y';
            } else if( random >= 5 && random < 7.5 ) {
               color = 'G';
            } else if( random >= 7.5 && random < 10 ) {
               color = 'R';
            }
            
            sequence[i] = color;                                           //Store the sequence in an array
            try {
               Thread.sleep(1000);
            } catch (InterruptedException e) { 
               Thread.currentThread().interrupt();
            }
            System.out.print( color );
            try {
               Thread.sleep(1500);
            } catch (InterruptedException e) { 
               Thread.currentThread().interrupt();
            }
            System.out.print("\b \b");
            
         }
         
         for( int j = 0; j < round; j++ ) {                                //Loop so that the user repeats back the sequence
            guess = reader.next().charAt(0);                               //    one character at a time. Stop at wrong input.
            
            if( guess != sequence[j] ) {
               System.out.println("Sorry, that is incorrect. Better luck next time.");
               lose = true;
               break;
            }
         }
         
         round++;
      }
   }
   
	public static void main( String[]args ) {
      Simon game = new Simon();
      game.playGame();
	}
	
}
