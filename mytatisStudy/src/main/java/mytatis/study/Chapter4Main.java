package mytatis.study;

import org.apache.ibatis.session.SqlSession;

import mytatis.mapper.RoleMapper;
import mytatis.mapper.StudentMapper;
import mytatis.pojo.Role;import mytatis.pojo.Student;
import mytatis.util.SqlSessionFactoryUtil;

public class Chapter4Main {
	public static void main(String[] args) {
		SqlSession sqlSession = null;
		try {
			sqlSession = SqlSessionFactoryUtil.openSqlSession();
			StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
			Student student = studentMapper.getStudent(1);
			System.out.println(student.toString());
		} catch (Exception e) {
			System.err.println(e.getMessage());
			sqlSession.rollback();
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}
	}
}
