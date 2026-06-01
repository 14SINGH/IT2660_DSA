import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Iterator;

// Lab 2 - Lists, Stacks, and Queues
// Your Name: 
// Notes: The instructions are found in comments through the code starting with "Step n"
//        Please leave the comments and add your code just after the comment.
//        Use the examples in the book to complete the lab.

class Main {
  public static void main(String[] args) {
    Lab2 lab = new Lab2();
    // Comment/Uncomment the following 3 method calls as you work on each method.
    // No code should be added to the main method. All of your code will go into the methods in Lab2.
    lab.linkedList();
    lab.queue();
    lab.stack();
  }
}

class Lab2 {
  public void linkedList() {
    // 1. Create a LinkedList<String> object called progLanguages

    // 2. Add elements to progLanguages: "Java", "Python", "JavaScript", "C++"

    // 3. Remove the element "C++" from the list using .remove()

    // 4. Add an element "HTML" at index 2.

    // 5. Iterate over progLanguages and use println() to output each element. You must create an Iterator<string> and use hasNext(), and next() similar to the example in our book.
    
  }
  
  public void queue() {
    // 6. Create a Queue<String> called q

    // 7. Add 5 first names to q.

    // 8. Uncomment the following line
    //System.out.println("Elements of queue: " + q);

    // 9. Remove the head of the queue and assign it to a String variable removedElement.
    //    Display the value of "Removed element: " + removedElement

    // 10. View the head of the queue using peek(). Output it's value.

    // 11. Using for(String element : q), output all of the values in the queue

    
  }

  public void stack() {
    // 12. Create a Stack<String> called bookStack

    // 13. Push the following book titles onto bookStack: "Clean Code", "Design Patterns", "Pragmatic Programmer"

    // 14. pop() 1 book off the stack. Display it's value

    // 15. Use the peek() method to view the top book on the stack

    // 16. push() "Web DB Technologies" onto the stack

    // 17. Use the peek() method to view the top book on the stack

    // 18. Search for "Design Patterns" in the stack. Display the results of the search.

    // 19. Call empty(). Output the results

    // 20. Print the titles of all of the books on the stack
    
  }

  
}