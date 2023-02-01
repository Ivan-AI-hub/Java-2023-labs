import java.util.ArrayList;
import java.util.Date;

public class Notepad
{
    public class Note
    {
        private String _text;
        private Date _date;

        public Note(String text, Date date) {
            _text = text;
            _date = date;
        }

        public void setText(String _text) {
            this._text = _text;
        }

        public String getText() {
            return _text;
        }

        public void setDate(Date _date) {
            this._date = _date;
        }

        public Date getDate() {
            return _date;
        }
    }

    private ArrayList<Note> _notes;

    public  Notepad()
    {
        _notes = new ArrayList<>();
    }

    public ArrayList<Note> getNotes() {
        return _notes;
    }
}
