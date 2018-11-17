package mytatis.study;

import java.util.Date;

import org.apache.ibatis.session.SqlSession;

import mytatis.enum2.Sex;
import mytatis.mapper.UserMapper;
import mytatis.pojo.User;
import mytatis.util.SqlSessionFactoryUtil;

public class Chapter3Main {
	public static void main(String[] args) {
		SqlSession session = null;
		try{
		session = SqlSessionFactoryUtil.openSqlSession();
		UserMapper userMapper = session.getMapper(UserMapper.class);
		User user = new User();
		user.setId(101L);
		user.setBirthday(new Date());
		user.setCnName("西看看");
		user.setMobile("1212121");
		user.setEmail("654454");
		user.setSex(Sex.MALE);
		user.setNote("ljlj");
		user.setUserName("葫芦娃");
		userMapper.insert(user);
		User user2 = new User();
		user2 = userMapper.getUser(101L);
		System.out.println(user2.getSex());
		session.commit();
		} catch (Exception e) {
			System.err.println(e.getMessage());
			session.rollback();
		} finally {
			if (session != null) {
				session.close();
			}
		}
		
	}
}
