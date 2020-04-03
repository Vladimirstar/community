package life.majiang.community.mapper;

import life.majiang.community.model.Question;

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
}