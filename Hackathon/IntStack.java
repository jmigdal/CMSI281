public class IntStack {
	
   IntLinkedList myStack = new IntLinkedList();
	
   public void push ( int i ) {
      myStack.prepend(i);
   }
   
   public void pop () {
      myStack.removeAt(0);
   }
      
   public int peek () {
      if( myStack.getSize() == 0 ) {
         return 0;
      }
      IntLinkedList.Iterator myIt = myStack.getIteratorAt( 0 );
      return myIt.getCurrentInt();
   }
   
   public int peekAt( int index ) {
      if( index > myStack.getSize() - 1 ) {
         return 0;
      }
      IntLinkedList.Iterator myIt = myStack.getIteratorAt( index );
      return myIt.getCurrentInt();
   }
   
   public static void main ( String [] args ) {
      IntStack stack = new IntStack();
      stack.push(0);
      System.out.println(stack.peek());
      stack.push(1);
      System.out.println(stack.peek());
      stack.push(2);
      System.out.println(stack.peek());
      stack.push(3);
      System.out.println(stack.peek());
      stack.push(4);
      System.out.println(stack.peek());
      
      stack.pop();
      System.out.println(stack.peek());
   }      
}
