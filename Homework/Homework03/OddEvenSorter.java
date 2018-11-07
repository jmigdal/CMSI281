/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  Simon.java
 *  Purpose       :  Program to implement an odd-even sorting algorithm
 *  Author        :  Kathryn Cole, James Migdal
 *  Date          :  2018-11-04
 *  Description   :  See purpose
 *  Notes         :  None
 *  Warnings      :  None
 *  Exceptions    :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

class OddEvenSorter {

    private long[] a;
    private int nElems;

    public OddEvenSorter( int max ) {
        a = new long[ max ];
        nElems = 0; 
    }

    public void insert( long value ) {
        a[ nElems ] = value;
        nElems ++;
    }

    public void display() {
        for( int i = 0; i < nElems; i++ ) {
            System.out.print( a[i] + " " );
        }
        System.out.println( "" );
    }

    public boolean isSorted() {
        for( int i = 0; i < nElems - 1; i ++ ) {
            if( a[i] > a[i + 1] ) {
                return false;
            }
        }
        return true;
    }

    public void swap( int one, int two ) {
        long temp = a[ one ];
        a[ one ] = a[ two ];
        a[ two ] = temp;
    }

    public void oddEvenSort() {
        while( !isSorted() ) {
            for ( int i = 0; i < nElems - 1; i ++ ) {
                if( i % 2 != 0 ) {
                    if( a[i] > a[i + 1] ) {
                        swap( i, i + 1 );
                    }
                }
            }
            for( int i = 0; i < nElems - 1; i ++ ) {
                if( i % 2 == 0 ) {
                    if( a[i] > a[i + 1] ) {
                        swap( i, i + 1 );
                    }
                }
            }
        }
    }

    public static void main( String[] args ) {
        int maxSize = 100; 
        OddEvenSorter arr;
        arr = new OddEvenSorter( maxSize );

        arr.insert(77);       //Test sequence 1
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

        arr.display();        //Display unsorted sequence

        arr.oddEvenSort();

        arr.display();        //Display sorted sequence

        arr.insert(10000);    //Test sequence 2
        arr.insert(40);
        arr.insert(2);
        arr.insert(5);
        arr.insert(40);
        arr.insert(32);
        arr.insert(50);
        arr.insert(33);
        arr.insert(6);
        arr.insert(78);

        arr.display();        //Display unsorted sequence

        arr.oddEvenSort();

        arr.display();        //Display sorted sequence

        OddEvenSorter smallOne;
        smallOne = new OddEvenSorter( maxSize );   //Create an OddEvenSorter of size 100

        smallOne.insert(2);         //insert 2
        smallOne.display();         //show 2
        smallOne.oddEvenSort();     
        smallOne.display();         //show a sorted list for 1 element
        smallOne.insert(1);         //insert a 1
        smallOne.display();         //show 2 1
        smallOne.oddEvenSort();     
        smallOne.display();         //display 1 2
    }
}