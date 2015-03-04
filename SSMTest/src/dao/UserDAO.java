package dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import entity.User;

public interface UserDAO {
	@Select("select * from [User] where name=#{name} and pass=#{pass}")
	public User selectByNameAndPass(@Param("name")String name, @Param("pass")String pass);
	
	@Insert("insert into [User] values(#{name}, #{pass})")
	public int insert(User user);
	
	@Update("update [User] set pass=#{newPass} where id=#{id} and pass=#{oldPass}")
	public int updatePass(@Param("id")int id, @Param("oldPass")String oldPass, @Param("newPass")String newPass);
}
