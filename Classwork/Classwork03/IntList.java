/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  IntList.java
 *  Purpose       :  Creates and organizes integer lists using arrays.
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
 *  @version 1.0.0  2018-09-12  James Migdal  Initial writing and release
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

public class IntList implements IntListInterface {
   private int[] theList;
   private int   size;
   private int[] newList;

   private static final int STARTING_SIZE = 19;    // defines starting size; don't worry, we'll deal

   public IntList() {                        // doesn't HAVE to be declared public, but doesn't hurt
      theList = new int[STARTING_SIZE];
      size = 0;
   }

   public int getValueAtIndex( int index ) throws ArrayIndexOutOfBoundsException {
		if( size == 0 ) {
			throw new ArrayIndexOutOfBoundsException( "The list is empty!" );   // maybe not the best...
		} else if( index > size ) {
			throw new ArrayIndexOutOfBoundsException( "The index value is too large" );
		} else if( index < 0 ) {
			throw new ArrayIndexOutOfBoundsException( "The index value is too small");
		} else {
			return theList[index];
		}
	}
   
   public boolean prepend ( int valueToAdd ) {
      if( size >= theList.length ) {
         newList = new int [size + STARTING_SIZE];
         for( int j = 0; j < size; j++ ) {
            newList[j] = theList[j];
         }
         theList = newList;
      }
      
      for( int i = size + 1; i > 0; i-- ) {
         theList[i] = theList[i - 1];
      }
      theList[0] = valueToAdd;
      size++;
      return true;
   }

   public boolean append( int valueToAdd ) {
      if( size < theList.length ) {
			theList[size] = valueToAdd;
            size++;
            return true;
      } else {
			// what should we do here, if there's no room?
      }
      return false;
   }
   
   public boolean checkValue( int index, int value ) {
      if( index < 0 || index >= size ) {
         System.out.println( "Index out of bounds" );
         return false;
      } else if( theList[index] == value ) {
         return true;
      } else {
         return false;
      }
   }

   // we've gotta have this to actually get things to compile
   public boolean insertValueAtIndex( int value, int index ) {
      if( size >= theList.length ) {
         newList = new int [size + STARTING_SIZE];
         for( int j = 0; j < size; j++ ) {
            newList[j] = theList[j];
         }
         theList = newList;
      }

      for( int i = size; i > index; i-- ) {
         theList[i] = theList[i-1];
      }
      theList[index] = value;
      size++;
      return true;
   }

   public int removeValueAtIndex( int index ) throws ArrayIndexOutOfBoundsException {
      int value = theList[index];
      if( size == 0 ) {
			throw new ArrayIndexOutOfBoundsException( "The list is empty!" );   // maybe not the best...
      } else if( index > size ) {
         throw new ArrayIndexOutOfBoundsException( "The index value is too large" );
      } else if( index < 0 ) {
         throw new ArrayIndexOutOfBoundsException( "The index value is too small");
      } else {
			holeFiller( index );
      }
      return value;
   }

   private void holeFiller( int index ) {
      for( int i = index; i < size - 1; i++ ) {
         theList[i] = theList[i+1];
      }
      size--;
   }
   
   private void printList() {
      if( size > 0 ) {
         System.out.print( theList[0] );
      }
      if( size > 1 ) {
         for( int i = 1; i < size; i++ ) {
            System.out.print( ", " + theList[i] );
         }
      }
      System.out.println("");
   }

   public static void main( String[] args ) {
		IntList list = new IntList();
      list.append( 2 );
      list.append( 3 );
      list.append( 5 );
      list.append( 7 );
      System.out.println( list.getValueAtIndex( 3 ) );   // should return the value 7
      list.append( 11 );
      list.append( 13 );
      list.append( 17 );         
      list.append( 19 );
      list.printList();
      list.prepend( 0 );
      list.printList();
      list.insertValueAtIndex( 39, 2 );
      list.printList();
      System.out.println( list.getValueAtIndex( 7 ) );      // should return the value 19
      System.out.println( list.checkValue( 0, 0 ) );

    }
}
