/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;
// executable class
// use problem5.student.Student class to create object of student
import problem3.myqueue.MyPriorityQueue;
import problem3.student.Student;

public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue<Student> myPriorityQueue = new MyPriorityQueue<>();
        myPriorityQueue.add(new Student(1, "gopal"));
        myPriorityQueue.add(new Student(5, "krishna"));
        myPriorityQueue.add(new Student(3, "gopal"));
        myPriorityQueue.add(new Student(2, "raghav"));
        System.out.println("Queue After Arranging according to ROLL NUMBER : ");
        System.out.println(myPriorityQueue);
    }
}
