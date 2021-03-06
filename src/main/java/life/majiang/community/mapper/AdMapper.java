package life.majiang.community.mapper;

import life.majiang.community.model.Ad;
import life.majiang.community.model.AdExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface AdMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad
     *
     * @mbg.generated Wed Apr 22 16:38:00 CST 2020
     */
    long countByExample(AdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad
     *
     * @mbg.generated Wed Apr 22 16:38:00 CST 2020
     */
    int deleteByExample(AdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad
     *
     * @mbg.generated Wed Apr 22 16:38:00 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad
     *
     * @mbg.generated Wed Apr 22 16:38:00 CST 2020
     */
    int insert(Ad record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad
     *
     * @mbg.generated Wed Apr 22 16:38:00 CST 2020
     */
    int insertSelective(Ad record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad
     *
     * @mbg.generated Wed Apr 22 16:38:00 CST 2020
     */
    List<Ad> selectByExampleWithRowbounds(AdExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad
     *
     * @mbg.generated Wed Apr 22 16:38:00 CST 2020
     */
    List<Ad> selectByExample(AdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad
     *
     * @mbg.generated Wed Apr 22 16:38:00 CST 2020
     */
    Ad selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad
     *
     * @mbg.generated Wed Apr 22 16:38:00 CST 2020
     */
    int updateByExampleSelective(@Param("record") Ad record, @Param("example") AdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad
     *
     * @mbg.generated Wed Apr 22 16:38:00 CST 2020
     */
    int updateByExample(@Param("record") Ad record, @Param("example") AdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad
     *
     * @mbg.generated Wed Apr 22 16:38:00 CST 2020
     */
    int updateByPrimaryKeySelective(Ad record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad
     *
     * @mbg.generated Wed Apr 22 16:38:00 CST 2020
     */
    int updateByPrimaryKey(Ad record);
}