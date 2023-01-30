import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        ArrayList<Teacher> teachers = GetTeachers(5);
        ArrayList<Student> students = GetStudents(5);
        ArrayList<HeadOfDepartment> heads = GetHeadOfDepartments(5);

        for(int i = 0; i < 3; i++)
        {
            teachers.get(i).Add();
            students.get(i).Add();
            heads.get(i).Add();
        }

        var persons = Person.ShowFromStatic();
        for (var person : persons)
        {
            System.out.println("Name: " + person.GetName());
        }
    }
    private static ArrayList<Teacher> GetTeachers(int count)
    {
        ArrayList<Teacher> teachers = new ArrayList<>();
        for (int i = 0; i < count; i++)
        {
            teachers.add(new Teacher("teacher"+i));
        }
        return  teachers;
    }
    private static ArrayList<Student> GetStudents(int count)
    {
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < count; i++)
        {
            students.add(new Student("student"+i));
        }
        return  students;
    }
    private static ArrayList<HeadOfDepartment> GetHeadOfDepartments(int count)
    {
        ArrayList<HeadOfDepartment> heads = new ArrayList<>();
        for (int i = 0; i < count; i++)
        {
            heads.add(new HeadOfDepartment("head"+i));
        }
        return  heads;
    }

}