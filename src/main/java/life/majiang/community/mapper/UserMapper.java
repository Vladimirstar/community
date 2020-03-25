package life.majiang.community.mapper;

import life.majiang.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author zxh
 */
@Mapper
public interface UserMapper {

    /**
     * 插入用户信息
     *
     * @param user
     */
    @Insert("insert into user(name,account_id,token,gmt_create,gmt_modified) values (#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified})")
    void insert(User user);

    /**
     * 通过token查询用户信息
     *
     * @param token
     * @return User实体
     */
    @Select("select * from user where token = #{token}")
    User findByToken(@Param("token") String token);
}
