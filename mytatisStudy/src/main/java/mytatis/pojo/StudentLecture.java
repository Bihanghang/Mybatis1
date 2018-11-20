package mytatis.pojo;

import java.math.BigDecimal;

public class StudentLecture {
    private Integer id;

    private Integer studentId;

    private Lecture lecture;

    private BigDecimal grade;

    private String note;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Lecture getLecture() {
		return lecture;
	}

	public void setLecture(Lecture lecture) {
		this.lecture = lecture;
	}

	public BigDecimal getGrade() {
        return grade;
    }

    public void setGrade(BigDecimal grade) {
        this.grade = grade;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

	@Override
	public String toString() {
		return "StudentLecture [id=" + id + ", studentId=" + studentId + ", lecture=" + lecture + ", grade=" + grade
				+ ", note=" + note + "]";
	}
    
}