package mytatis.pojo;

public class Lecture {
    private Integer id;

    private String lectureName;

    private String note;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLectureName() {
        return lectureName;
    }

    public void setLectureName(String lectureName) {
        this.lectureName = lectureName == null ? null : lectureName.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

	@Override
	public String toString() {
		return "Lecture [id=" + id + ", lectureName=" + lectureName + ", note=" + note + "]";
	}
    
}