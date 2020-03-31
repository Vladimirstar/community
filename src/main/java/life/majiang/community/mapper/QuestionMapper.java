package life.majiang.community.mapper;

import life.majiang.community.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface QuestionMapper {

    /**
     * 新增提问
     *
     * @param question
     */
    @Insert("insert into question(title,description,creator,tag,gmt_create,gmt_modified) values (#{title},#{description},#{creator},#{tag},#{gmtCreate},#{gmtModified})")
    void create(Question question);

    /**
     * 分页获取list
     *
     * @param offset
     * @param size
     * @return
     */
    @Select("select * from question limit #{offset},#{size}")
    List<Question> list(@Param("offset") Integer offset, @Param("size") Integer size);

    /**
     * 获取总数
     *
     * @return
     */
    @Select("select count(*) from question")
    Integer count();

    /**
     * 根据用户id分页获取list
     *
     * @param userId
     * @param offset
     * @param size
     * @return
     */
    @Select("select * from question where creator = #{userId} limit #{offset},#{size}")
    List<Question> listByUserId(@Param("userId") Integer userId, @Param("offset") Integer offset, @Param("size") Integer size);

    /**
     * 据用户id分页获取总数
     *
     * @param userId
     * @return
     */
    @Select("select count(*) from question where creator = #{userId}")
    Integer countByUserId(@Param("userId") Integer userId);

    @Select("select count(*) from question where id = #{id}")
    Question getById(@Param("id") Integer id);
}
