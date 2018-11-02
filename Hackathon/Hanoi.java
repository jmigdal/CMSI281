public class Hanoi { 

   IntStack ATower = new IntStack();
   IntStack BTower = new IntStack();
   IntStack CTower = new IntStack();
   
   int size;
   
   public Hanoi( int size ) {
      this.size = size;
      for( int i = size; i > 0; i-- ) {
         CTower.push(i);
      }
   }
   
   public void two() {
      if( ATower.peek() == 1 ) {                //1
         CTower.push(1);
         ATower.pop();       
      } else if ( BTower.peek() == 1 ) {
         ATower.push(1);
         BTower.pop();
      } else if ( CTower.peek() == 1 ) {
         BTower.push(1);
         CTower.pop();
      }
      
      if( ATower.peek() == 2 ) {                //2
         BTower.push(2);
         ATower.pop();       
      } else if ( BTower.peek() == 2 ) {
         CTower.push(2);
         BTower.pop();
      } else if ( CTower.peek() == 2 ) {
         ATower.push(2);
         CTower.pop();
      }
      
      if( ATower.peek() == 1 ) {                //1
         CTower.push(1);
         ATower.pop();       
      } else if ( BTower.peek() == 1 ) {
         ATower.push(1);
         BTower.pop();
      } else if ( CTower.peek() == 1 ) {
         BTower.push(1);
         CTower.pop();
      }
      
   }
   
   public void three() {
      two();
      if( ATower.peek() == 3 ) {                
         CTower.push(3);
         ATower.pop();       
      } else if ( BTower.peek() == 3 ) {
         ATower.push(3);
         BTower.pop();
      } else if ( CTower.peek() == 3 ) {
         BTower.push(3);
         CTower.pop();
      }
      two();
   }
   
   public void four() {
      three();
      if( ATower.peek() == 4 ) {                
         BTower.push(4);
         ATower.pop();       
      } else if ( BTower.peek() == 4 ) {
         CTower.push(4);
         BTower.pop();
      } else if ( CTower.peek() == 4 ) {
         ATower.push(4);
         CTower.pop();
      }
      three();
   }
   
   public void five() {
      four();
      if( ATower.peek() == 5 ) {                
         CTower.push(5);
         ATower.pop();       
      } else if ( BTower.peek() == 5 ) {
         ATower.push(5);
         BTower.pop();
      } else if ( CTower.peek() == 5 ) {
         BTower.push(5);
         CTower.pop();
      }
      four();
   }
   
   public void six() {
      five();
      if( ATower.peek() == 6 ) {                
         BTower.push(6);
         ATower.pop();       
      } else if ( BTower.peek() == 6 ) {
         CTower.push(6);
         BTower.pop();
      } else if ( CTower.peek() == 6 ) {
         ATower.push(6);
         CTower.pop();
      }
      five();
   }
   
   public void seven() {
      six();
      if( ATower.peek() == 7 ) {                
         CTower.push(7);
         ATower.pop();       
      } else if ( BTower.peek() == 7 ) {
         ATower.push(7);
         BTower.pop();
      } else if ( CTower.peek() == 7 ) {
         BTower.push(7);
         CTower.pop();
      }
      six();
   }
   
   public void showState() {
      for( int i = 0; i < this.size; i++ ) {
         System.out.println( ATower.peekAt(i) + "\t" + BTower.peekAt(i) + "\t" + CTower.peekAt(i) );
      }
      System.out.println("");
   }
   
   public static void main ( String [] args ) {
      Hanoi towers = new Hanoi( 7 );
      towers.showState();
      towers.seven();
      towers.showState();
   }
}
   