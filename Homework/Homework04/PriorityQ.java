/** 
 * A class to implement a priority queue using a max heap.
 * @date November 26, 2018
 * @author Kathryn Cole and James Migdal
 */

class PriorityQ {
    private int maxSize;
    private Heap heapy;

    public PriorityQ( int s ) {
        maxSize = s;
        heapy = new Heap( maxSize );
    }

    public void insert( long item ) {
        heapy.insert( (int)item );
    }

    public long remove() {
        return heapy.remove().getKey();
    }

    public long peekMax() {
        return heapy.getMax();
    }

    public boolean isEmpty() {
        return heapy.isEmpty();
    }

    public boolean isFull() {
        return heapy.isFull();
    }

    public static void main( String[] args ) {
        PriorityQ pq = new PriorityQ(5);
        pq.insert(30);
        pq.insert(50);
        pq.insert(10);
        pq.insert(40);
        pq.insert(20);
        System.out.println( pq.peekMax() );
        pq.remove();
        System.out.println( pq.peekMax() );
        pq.insert(600000);

        while( !pq.isEmpty() ) {
            long item = pq.remove();
            System.out.print( item + " " );
        }

        PriorityQ qp = new PriorityQ(5);
        qp.insert(1);
        qp.insert(78);
        qp.insert(66);
        System.out.print( "\n" );
        while( !qp.isEmpty() ) {
            long item = qp.remove();
            System.out.print( item + " " );
        }
    }
}