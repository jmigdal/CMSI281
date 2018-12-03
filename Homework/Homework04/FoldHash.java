/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  FoldHash.java
 *  Purpose       :  Program to implement a linear probe hash table to store integers that implements digit-folding.
 *  Author        :  Kathryn Cole, James Migdal
 *  Date          :  2018-11-22
 *  Description   :  See purpose
 *  Notes         :  None
 *  Warnings      :  None
 *  Exceptions    :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
public class FoldHash {

   private int [] hashTable;
   private int arraySize;

   public FoldHash( int size ) {
      arraySize = size;
      hashTable = new int[1000];
   }
   
   public int hash( int i ) {
      int fold = i%100 + (int)(i/100)%100 + (int)(i/10000);
      return fold % arraySize;
   }
   
   public void insert( int i ) {
      int index = hash(i);
      if( index >= hashTable.length ) {
         index = hashTable.length - 50;
      }
      
      while( hashTable[index] != 0 ) {
         index++;
      }
      
      hashTable[index] = i;
   }
   
   public int find( int i ) {
      int index = hash(i);
      if( index >= hashTable.length ) {
         index = hashTable.length - 50;
      }
      
      while( !(hashTable[index] == i) && hashTable[index] != 0 ) {
         index++;
      }
      if( hashTable[index] == 0 ) {
         return -1;
      } else {
         return index;
      }
   }
   
   public static void main( String [] args ) {
      FoldHash myHash = new FoldHash( 1000 );
      myHash.insert(101010);                             //Prove hash works correctly
      System.out.println( myHash.find(101010) );         //30
      myHash.insert(151617);
      System.out.println( myHash.find(151617) );         //48
      myHash.insert(161517);                             //Prove collision is handled
      System.out.println( myHash.find(161517) );         //49
      myHash.insert(9999999);                            //Prove large integers are handled
      System.out.println( myHash.find(9999999) );        //197
   }
}