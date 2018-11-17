package mytatis.mapper;

import mytatis.pojo.User;

public interface UserMapper {
	public User getUser(long id);
	public int insert(User user);
}
