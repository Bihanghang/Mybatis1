package mytatis.mapper;

import mytatis.pojo.StudentSelfcard;

public interface StudentSelfcardMapper {

	StudentSelfcard findStudentSelfcardByStudentId(int studentId);
}