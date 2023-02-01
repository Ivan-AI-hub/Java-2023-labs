import java.io.Serializable;

public class Student implements Serializable
{
    private String _name;

    public Student(String name)
    {
        _name = name;
    }
    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }
}
