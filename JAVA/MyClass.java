//Implementation of queue using two stacks 
/*Operations Performed
1. add elements in queue which is using addqueue method
2.delete elements from queue which is using deletequeue() method
*/
import java.util.*;

public class MyClass
{
    static class Queue
    {
        static Stack < Integer > p1 = new Stack < Integer > ();
        static Stack < Integer > p2 = new Stack < Integer > ();

        static void addqueue (int a)
        {
            // Move all elements from p1 to p2
            while (!p1.isEmpty ())
            {
                p2.push (p1.pop ());

            }


            p1.push (a);


            while (!p2.isEmpty ())
            {
                p1.push (p2.pop ());

            }
        }

        // Dequeue an item from the queue
        static int deletequeue ()
        {
            //  first stack is empty
            if (p1.isEmpty ())
            {
                System.out.println ("empty queue");

            }

            // Return top of p1
            int a = p1.peek ();
            p1.pop ();
            return a;
        }
    }


    public static void main (String[]args)
    {
        Queue queue = new Queue ();
        queue.addqueue (2);
        queue.addqueue (4);
        queue.addqueue (6);
        queue.addqueue (8);


        System.out.println (queue.deletequeue ());
        System.out.println (queue.deletequeue ());
        System.out.println (queue.deletequeue ());
        System.out.println (queue.deletequeue ());
        // here after execution of this line the code will pop up the EmptyStackException as there are no elts in the queue
        System.out.println (queue.deletequeue ());
    }
}
