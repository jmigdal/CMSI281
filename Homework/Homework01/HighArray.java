/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  HighArray.java
 *  Purpose       :  Creates an array of longs with options to organize
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

public class HighArray
{
   private long [] a;
   private int nElems;
   
   public HighArray( int max ) {
      a = new long[max];
      nElems = 0;
   }
   
   public boolean find( long searchKey ) {      //returns true if the value given to find is found
      int j;
      for( j = 0; j < nElems; j++ ) {
         if( a[j] == searchKey )
            break;
      }
      if( j == nElems )
         return false;
      else
         return true;
   }
   
   public long getMax() {                       //returns the max value of the array
      if( nElems == 0 ) {
         return -1;
      } else {
         long max = a[0];
         for( int j = 0; j < nElems; j++ ) {
            if( a[j] > max )
               max = a[j];
         }
         return max;
      }
   }
   
   public void insert( long value ) {           //inserts a given value at the end of the array
      a[nElems] = value;
      nElems++;
   }
   
   public boolean delete( long value ) {        //deletes one of a given value from anywhere in the array
      int j;
      for( j = 0; j < nElems; j++ ) {
         if( value == a[j] )
            break;
      }
      if( j == nElems )
         return false;
      else {
         for( int k = j; k < nElems; k++ ) {
            a[k] = a[k+1];
         }
         nElems--;
         return true;
      }
   }
   
   public void noDups() {                       //deletes all duplicates of any value in the array
      long same;
      for( int i = 0; i < nElems; i++ ) {
         same = a[i];
         for( int j = i + 1; j < nElems; j++ ) {
            if( a[j] == same )
               delete( same );
         }
         
         if( a[i] != same ) {
            i--;
         }
      }
   }
         
   
   public void display() {                      //neatly shows all values in the array
      for( int j = 0; j < nElems; j++ ) {
         System.out.print( a[j] + " " );
      }
      System.out.println("");
   }
}
      