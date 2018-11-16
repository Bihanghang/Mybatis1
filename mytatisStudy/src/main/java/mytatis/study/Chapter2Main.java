package mytatis.study;

import org.apache.ibatis.session.SqlSession;

import mytatis.mapper.RoleMapper;
import mytatis.pojo.Role;
import mytatis.util.SqlSessionFactoryUtil;

public class Chapter2Main 
{
    public static void main( String[] args ){
    SqlSession sqlSession = null;
	try {
		sqlSession = SqlSessionFactoryUtil.openSqlSession();
		RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
		Role role = new Role();
		role.setId(101L);
		role.setNote("哈哈哈");
		role.setRoleName("男神");
		roleMapper.insertRole(role);
		sqlSession.commit();
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
