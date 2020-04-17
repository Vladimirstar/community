package life.majiang.community.mapper;

import life.majiang.community.dto.QuestionQueryDTO;
import life.majiang.community.model.Question;

import java.util.List;

public interface QuestionExtMapper {

    /**
     * 增加阅读数
     *
     * @param record
     * @return
     */
    int incView(Question record);

    /**
     * 增加评论数
     *
     * @param record
     * @return
     */
    int incCommentCount(Question record);

    /**
     * 查询相关问题
     *
     * @param question
     * @return
     */
    List<Question> selectRelate(Question question);

    /**
     * 搜索问题的总数
     *
     * @param questionQueryDTO
     * @return
     */
    Integer countBySearch(QuestionQueryDTO questionQueryDTO);

    /**
     * 查询相关关键字问题
     *
     * @param questionQueryDTO
     * @return
     */
    List<Question> selectBySearch(QuestionQueryDTO questionQueryDTO);
}