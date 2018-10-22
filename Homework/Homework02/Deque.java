/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  Queue.java
 *  Purpose       :  Creates the Deque data structure.
 *  Author        :  Kathryn Cole, James Migdal
 *  Date          :  2018-10-15
 *  Description   :  See purpose
 *  Notes         :  None
 *  Warnings      :  None
 *  Exceptions    :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
class Deque {
   private int maxSize;
   private long[] queArray;
   private int front;
   private int rear;
   private int nItems;

   public Deque (int s) {
      maxSize = s;
      queArray = new long[maxSize];
      front = 0;
      rear = -1;
      nItems = 0;
   }

   public void insertRight( long j ) {
      if ( rear == maxSize - 1 ) {
         rear = -1;
      }
      queArray[ ++ rear ] = j; // increment rear and insert
      nItems ++; // one more item
   }

   public void insertLeft( long j ) {
      if ( isFull() ) {
         System.out.println( "The deque is full, you can't add anything new" );
      } else {
         for ( int i = nItems; i > 0; i -- ) {
            queArray[i] = queArray[i - 1];
         }
         queArray[0] = j;
         rear ++;
         nItems ++;
      }
   }

   public long removeLeft() {
      long temp = queArray[ front ++ ]; // get value and incr front
      if ( front == maxSize ) { // deal with wraparound
         front = 0;
      }
      nItems--; // one less item
      return temp;
   }

   public long removeRight() {
      long temp = queArray[rear];
      queArray[rear] = 0;
      nItems --;
      return temp;
   }

   public long peekFront() {
      return queArray[front];
   }

   public long peekBack() {
      return queArray[rear];
   }

   public boolean isEmpty() {
      return ( nItems == 0 );
   }

   public boolean isFull() {
      return ( nItems == maxSize );
   }

   public int size() {
      return nItems;
   }
}


class DequeApp {
   public static void main(String[] args)
   {
      Deque theDeque = new Deque(10);
      System.out.println( theDeque.isEmpty() );
      theDeque.insertRight( 32 );
      theDeque.insertLeft( 3 );
      System.out.println( theDeque.peekFront() );
      theDeque.insertRight( 2 );
      System.out.println( theDeque.peekBack() );
      theDeque.insertLeft( 1 );
      theDeque.insertRight( 5 );
      theDeque.insertLeft( 6 );
      theDeque.insertLeft( 7 );
      System.out.println( theDeque.peekFront() );
      theDeque.insertLeft( 8 );
      theDeque.insertLeft( 9 );
      theDeque.insertLeft( 10 );
      System.out.println( theDeque.removeRight() );
      theDeque.insertLeft( 11 );
      theDeque.insertLeft( 13 ); //this should be too many
      while( !theDeque.isEmpty() ) // remove and display
      { // all items
         long n = theDeque.removeLeft(); // (40, 50, 60, 70, 80)
         System.out.print(n);
         System.out.print(" ");
      }
      System.out.println("\nthe end");
   } 
}