package mytatis.pojo;

import java.util.List;

public class Student {
    private Integer id;

    private String cnname;

    private Byte sex;

    private StudentSelfcard studentSelfcard;
    
    private List<StudentLecture> studentLecturesList;

    private String note;

	public List<StudentLecture> getStudentLecturesList() {
		return studentLecturesList;
	}

	public void setStudentLecturesList(List<StudentLecture> studentLecturesList) {
		this.studentLecturesList = studentLecturesList;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCnname() {
        return cnname;
    }

    public void setCnname(String cnname) {
        this.cnname = cnname == null ? null : cnname.trim();
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    
    public StudentSelfcard getStudentSelfcard() {
		return studentSelfcard;
	}

	public void setStudentSelfcard(StudentSelfcard studentSelfcard) {
		this.studentSelfcard = studentSelfcard;
	}

	public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

	@Override
	public String toString() {
		return "Student [id=" + id + ", cnname=" + cnname + ", sex=" + sex + ", studentSelfcard=" + studentSelfcard
				+ ", studentLecturesList=" + studentLecturesList + ", note=" + note + "]";
	}

	
    
}