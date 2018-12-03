/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  StringHash.java
 *  Purpose       :  Program to implement a linear probe hash table to store strings for lowercase letters.
 *  Author        :  Kathryn Cole, James Migdal
 *  Date          :  2018-11-22
 *  Description   :  See purpose
 *  Notes         :  None
 *  Warnings      :  None
 *  Exceptions    :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
public class StringHash {
	
   private String[] hashTable;
   
   public StringHash() {
      hashTable = new String[500];
   }
   
   public int hash( String s ) {
      int num = 0;
      for( int x = 0; x < s.length(); x++ ){
         num += Character.getNumericValue(s.charAt(x)) - 9;
      }
      return num;
   }
   
   public void insert( String s ) {
      int index = hash(s);
      if( index >= hashTable.length ) {
         index = hashTable.length - 50;
      }
      
      while( hashTable[index] != null ) {
         index++;
      }
      
      hashTable[index] = s;
   }
   
   public int find( String s ) {
      int index = hash(s);
      if( index >= hashTable.length ) {
         index = hashTable.length - 50;
      }
      
      while( hashTable[index].equals(s) == false && hashTable[index] != null ) {
         index++;
      }
      if( hashTable[index] == null ) {
         return -1;
      } else {
         return index;
      }
   }
    
   public static void main( String [] args ){
      StringHash myHash = new StringHash();
      myHash.insert("a");                             //Prove hash works correctly
      System.out.println( myHash.find("a") );         //1
      myHash.insert("james");                
      System.out.println( myHash.find("james") );     //48
      myHash.insert("majes");                         //Show that collisions are handled
      System.out.println( myHash.find("majes") );     //49
      myHash.insert("zzzzzzzzzzzzzzzzzzzzzzzzz");     //Show that large strings are handled
      System.out.println( myHash.find("zzzzzzzzzzzzzzzzzzzzzzzzz") ); //450
   }
   
}     