import java.io.Serializable;

public class Teacher implements Serializable
{
    private String _name;

    public Teacher(String name)
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
