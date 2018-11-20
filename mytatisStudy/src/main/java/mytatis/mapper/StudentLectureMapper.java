package mytatis.mapper;

import mytatis.pojo.StudentLecture;

public interface StudentLectureMapper {
    StudentLecture findStudentLectureByStuId(int id);
}