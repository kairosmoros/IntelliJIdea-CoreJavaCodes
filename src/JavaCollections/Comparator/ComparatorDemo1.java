package JavaCollections.Comparator;
//Compare Students based on their age.
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Compare Student objects based on Age:
class Student
{
    int rollno;
    int age;
    String name;
    Student(int rollno,String name, int age)
    {
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }
}
// AgeComparator.java: We need to implement the Comparator interface and override the compare method to compare two
// objects and then decide to sort.
class AgeComparator implements Comparator
{
    public int compare(Object o1, Object o2)
            /*
Concept         	        Meaning
Object	                    Can hold any data type or object ✔️
Why use it?	                Generic/Universal use cases like sorting or storing
What’s required?	        ✅ Typecasting back to original class if you want to access specific methods/fields
             */
    {
        Student s1=(Student) o1;//This is typecasting
        Student s2=(Student) o2;//This is typecasting

        /* Because your Comparator is using raw type (no generics):
class AgeComparator implements Comparator
So o1 and o2 are treated as Object types, and you must cast them to Student to access age or rollno or name.
➡️ If you used generics, like this:
class AgeComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.age, s2.age);


          Integer.compare(int x, int y)
Returns:
0 → if x == y
Negative (e.g., -1) → if x < y
Positive (e.g., 1) → if x > y

    }
}
Then no typecasting is needed.
*/

        if(s1.age>s2.age)
            return 1;
        else
            return -1;
        /*
         just swap 1 and -1 you'll get data in descending order of their age
             if(s1.age>s2.age)
            return -1;
        else
            return 1;
         */
    }
}
public class ComparatorDemo1
{
    public static void main(String[] args) {
        List<Student> list= new ArrayList<>();
        list.add(new Student(101,"Prashant Yadav" , 21));
        list.add(new Student(102, "Ratan Shukla" ,20));
        list.add(new Student(103, "Prabhat Singh Sekhawat" , 24));
        System.out.println("Sort by age");
        Collections.sort(list,new AgeComparator());//alternate method of it is :
        // AgeComparator comparator = new AgeComparator(); Collections.sort(list, comparator)

        /*
        What does new AgeComparator() does and Why we have used it:
        You have a box of students 🧑‍🎓🧑‍🎓🧑‍🎓.
        When you write:
Collections.sort(list, new AgeComparator());
You are still creating an object, and Java is calling its method — just not you.

Java is doing this behind the scenes:

AgeComparator comparator = new AgeComparator();
comparator.compare(student1, student2);
You didn’t call the compare() method — Java did while sorting. That’s why you don’t see it being called, but it is being used.

You tell Java:

"Hey Java, please sort these students."

Java replies:

"Okay, I’ll help! But how do you want them sorted? By name? By roll number? By age?"

You respond:

"I want them sorted by age."

Java says:

"Cool. Can you give me a helper who knows how to compare two students by age?"

You say:

"Yes, here's a helper I just created: new AgeComparator()"

📦 So What is new AgeComparator()?
It’s just you creating an object of a class that knows:

"How to compare one student with another based on age."

This helper object (which implements Comparator) will now be used again and again inside Java’s sort function */



        /*Java’s Collections.sort(list, comparator) method automatically performs sorting.
Under the hood, Java uses a sorting algorithm (usually TimSort, which is a hybrid of MergeSort and InsertionSort). This algorithm decides how many times and which elements to compare.
All you do is:
Implement Comparator and define how to compare two objects.
Java will:
Take pairs of elements (behind the scenes).
Call your compare(o1, o2) method as needed.
Rearrange the list based on return values (-1, 0, 1).
🔁 Example Behind-the-Scenes Flow
Let's say your list has 3 students:
Student A (age 21)
Student B (age 20)
Student C (age 24)
The sorting algorithm might:
Compare A and B → calls compare(A, B) → returns 1 (A is older) → swap.
Compare A and C → calls compare(A, C) → returns -1 (A is younger) → no swap.
Compare B and C → calls compare(B, C) → returns -1 (B is younger) → no swap.
➡️ This flow is managed automatically. You don’t write loops or condition checks yourself — just the comparison logic.
 */

        System.out.println("After Sort: ");
        for(Student st:list)
        {
            System.out.println(st.rollno+ " , " +st.name+ " , " +st.age);
        }
    }

}
