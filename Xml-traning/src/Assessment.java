import java.io.Serializable;

public class Assessment implements Serializable
{
    private Course _course;
    private Student _student;
    private Integer _score;

    public Assessment(Course course, Student student, Integer score) {
        _course = course;
        _student = student;
        _score = score;
    }

    public Course getCourse() {
        return _course;
    }

    public Student getStudent() {
        return _student;
    }

    public void set_score(Integer _score) {
        this._score = _score;
    }

    public Integer get_score() {
        return _score;
    }
}
