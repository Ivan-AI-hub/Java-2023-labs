import java.util.*;

public class Course
{
    private String _name;
    private Teacher _teacher;
    public ArrayList<Student> Students;

    public Course(String name, Teacher teacher)
    {
        _name = name;
        _teacher = teacher;
        Students = new ArrayList<Student>();
    }
    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public Teacher get_teacher() {
        return _teacher;
    }
}
