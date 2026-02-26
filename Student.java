//Create a class Student with attributes and methods
public class Student
{
    int id;
    String name,course;
    
    void display()
    {
        System.out.println("Student ID:"+id);
        System.out.println("Name:"+name);
        System.out.println("Course"+course);
    }
    public static void main(String[] args)
    {
        Student st = new Student();
        st.id = 101;
        st.name = "Rahul";
        st.course = "CSE General";
        st.display();
    }
}
