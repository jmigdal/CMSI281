/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  Queue.java
 *  Purpose       :  Creates the Queue data structure.
 *  Author        :  Kathryn Cole, James Migdal
 *  Date          :  2018-10-15
 *  Description   :  See purpose
 *  Notes         :  None
 *  Warnings      :  None
 *  Exceptions    :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
class Queue
{
   private int maxSize;
   private long[] queArray;
   private int front;
   private int rear;
   private int nItems;
//--------------------------------------------------------------
   public Queue(int s) // constructor  
   {
      maxSize = s;
      queArray = new long[maxSize];
      front = 0;
      rear = -1;
      nItems = 0;
   }
//--------------------------------------------------------------
   public void insert(long j) // put item at rear of queue
   {
      if(rear == maxSize-1) // deal with wraparound
         rear = -1;
      queArray[++rear] = j; // increment rear and insert
      nItems++; // one more item
   }
//--------------------------------------------------------------
   public long remove() // take item from front of queue
   {
      long temp = queArray[front++]; // get value and incr front
      if(front == maxSize) // deal with wraparound
         front = 0;
      nItems--; // one less item
      return temp;
   }
//--------------------------------------------------------------
   public long peekFront() // peek at front of queue
   {
      return queArray[front];
   }
//--------------------------------------------------------------
   public boolean isEmpty() // true if queue is empty
   {
      return (nItems==0);
   }
//--------------------------------------------------------------
   public boolean isFull() // true if queue is full
   {
      return (nItems==maxSize);
   }
//--------------------------------------------------------------
   public int size() // number of items in queue
   {
      return nItems;
   }
//--------------------------------------------------------------
   public void displayQueue() 
   {
      if( rear > front ) {
         for( int i = front; i <= rear; i++ ) {
            System.out.print( queArray[i] + " " );
         }
      } else {
         for( int j = front; j < maxSize; j++ ) {
            System.out.print( queArray[j] + " " );
         }
         for( int k = 0; k <= rear; k++ ) {
            System.out.print( queArray[k] + " " );
         }
      }
      System.out.println( "" );
   }
} // end class Queue
////////////////////////////////////////////////////////////////
class QueueApp
{
   public static void main(String[] args)
   {
      Queue theQueue = new Queue(5); // queue holds 5 items
      theQueue.insert(10); // insert 4 items
      theQueue.insert(20);
      theQueue.insert(30);
      theQueue.insert(40);
      theQueue.insert(50);
      theQueue.displayQueue();   //*****
      theQueue.remove();
      theQueue.remove();
      theQueue.insert(60);
      theQueue.insert(70);
      theQueue.displayQueue();   //*****
   } // end main()
} // end class QueueApp
