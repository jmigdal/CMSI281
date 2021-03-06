/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  HighArrayApp.java
 *  Purpose       :  Tests the HighArray.java program
 *  Author        :  James Migdal
 *  Date          :  2018-09-12
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

public class HighArrayApp
{
   public static void main( String[]args ) {
      int maxSize = 100;
      HighArray arr;
      arr = new HighArray( maxSize );
      
      System.out.println( "The max value of the array is: " + arr.getMax() );
      
      arr.insert( 77 );
      arr.insert( 11 );
      arr.insert( 33 );
      arr.insert( 99 );
      arr.insert( 44 );
      arr.insert( 55 );
      arr.insert( 22 );
      arr.insert( 88 );
      arr.insert( 33 );
      arr.insert( 11 );
      arr.insert( 00 );
      arr.insert( 66 );
      arr.insert( 33 );
      
      arr.display();
      System.out.println( "The max value of the array is: " + arr.getMax() );
      
      arr.delete( 99 );
      arr.display();
      System.out.println( "The max value of the array is: " + arr.getMax() );
      
      arr.delete( 88 );
      arr.display();
      System.out.println( "The max value of the array is: " + arr.getMax() );
      
      arr.insert( 99 );
      arr.insert( 88 );
      arr.insert( 111 );
      arr.display();
      System.out.println( "The max value of the array is: " + arr.getMax() );
      
      arr.noDups();
      arr.display();
      
      int searchKey = 35;
      if( arr.find( searchKey ) )
         System.out.println( "Found " + searchKey );
      else
         System.out.println( "Can't find " + searchKey );
      
      arr.delete( 00 );
      arr.delete( 55 );
      arr.delete( 99 );
      
      arr.display();
   }
}