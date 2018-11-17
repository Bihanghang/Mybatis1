package mytatis.mapper;

import mytatis.pojo.Role;

public interface RoleMapper {
	public Role getRole(Long id);
	public Role findRole(String roleName);
	public int deleteRole(Long id);
	public int insertRole(Role role);
}
