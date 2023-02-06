import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import javax.xml.transform.TransformerException;
import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws ParserConfigurationException, TransformerException, IOException, SAXException {
        ArrayList<Teacher> teachers = GetTeachers(5);
        ArrayList<Student> students = GetStudents(50);
        ArrayList<Course> courses = GetCourses(teachers, students);
        ArrayList<Assessment> assessments = GetAssessments(courses);

        MyXmlParser.write(assessments);

        ArrayList<Assessment> readedAssessments = MyXmlParser.read();
        for(var ass : readedAssessments)
        {
            System.out.printf("Student: %s \t Course: %s \t Score: %d \n", ass.getStudent().getName(), ass.getCourse().getName(), ass.get_score());
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

    private static ArrayList<Course> GetCourses(ArrayList<Teacher> teachers, ArrayList<Student> students)
    {
        ArrayList<Course> courses = new ArrayList<>();
        int z = 0;
        for(var teacher : teachers)
        {
            var course = new Course("course"+z, teacher);
            for(int i = z*5; i < z*5 + 5; i++)
            {
                course.Students.add(students.get(i));
            }
            courses.add(course);
            z++;
        }
        return  courses;
    }
    private static ArrayList<Assessment> GetAssessments(ArrayList<Course> courses)
    {
        ArrayList<Assessment> assessments = new ArrayList<>();
        Random rn = new Random();
        for(var course : courses)
        {
            for (var student : course.Students)
            {
                var ass = new Assessment(course, student, rn.nextInt(0, 9));
                assessments.add(ass);
            }
        }
        return  assessments;
    }
}