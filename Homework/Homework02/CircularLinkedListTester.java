public class CircularLinkedListTester {
   public static void main( String [] args ) {
      CircularLinkedList circle = new CircularLinkedList();
      circle.insert( 23 );
      circle.insert( 24 );
      circle.insert( 25 );
      circle.insert( 26 );
      
         CircularLinkedList.Iterator myIt = circle.getIteratorAt( 0 );
         myIt.next();
         
         System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 23    Show full circle
         myIt.next();
         System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 24
         myIt.next();
         System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 25
         myIt.next();
         System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 26
         myIt.next();
         System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 23
         myIt.next();
         System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 24
         myIt.next();
         System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 25
         myIt.next();
         System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 26
         
         circle.remove();
         myIt.next();
         System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 23    Show a removed value
         myIt.next();
         System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 24
         myIt.next();
         System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 25
         circle.remove();
         myIt.next();
         System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 23
      
   }
}