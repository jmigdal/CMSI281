/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  CircularStack.java
 *  Purpose       :  Creates a stack using a circularly linked list
 *  Author        :  Kathryn Cole, James Migdal
 *  Date          :  2018-10-15
 *  Description   :  See purpose
 *  Notes         :  None
 *  Warnings      :  None
 *  Exceptions    :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

public class CircularStack {

    CircularLinkedList myStack;

    public CircularStack() {
        myStack = new CircularLinkedList();
    }   

    public void push( int itemToPush ) {                          //pushes item onto the stack
        myStack.insert( itemToPush );
    }

    public int pop() {
        int answer = myStack.getIteratorAt(0).getCurrentInt();    //pops item off the stack and returns its value
        myStack.remove();
        return answer;
    }

    public int peek() {                                           //returns item at the top of the stack
        return myStack.getIteratorAt(0).getCurrentInt();
    }

    public static void main( String[] args ) {
        CircularStack testStack = new CircularStack();
        testStack.push(1);
        System.out.println(testStack.peek()); //1
        testStack.push(2);
        System.out.println(testStack.peek()); //2
        testStack.push(3);
        System.out.println(testStack.peek()); //3
        testStack.push(4);
        System.out.println(testStack.peek()); //4
        System.out.println(testStack.pop()); //4
        System.out.println(testStack.peek()); //3
        testStack.push(5);
        testStack.push(6);
        testStack.push(7);
        System.out.println(testStack.peek()); //7
        testStack.push(8);
        System.out.println(testStack.pop()); //8
        System.out.println(testStack.peek()); //7
        testStack.push(9);
        testStack.push(10);
    }
}