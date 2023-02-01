package domain.abstracts;

import java.util.ArrayList;

public abstract class Person
{
    private static ArrayList<Person> _persons;
    protected String _name;
    public Person(String name)
    {
        _persons = new ArrayList<>();
        _name = name;
    }

    public void Add()
    {
        _persons.add(this);
    }

    public String GetName()
    {
        return _name;
    }
    public ArrayList<Person> Show()
    {
        return  _persons;
    }
    public static ArrayList<Person> ShowFromStatic()
    {
        return  _persons;
    }
}
