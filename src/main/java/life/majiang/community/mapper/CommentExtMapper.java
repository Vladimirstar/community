package life.majiang.community.mapper;

import life.majiang.community.model.Comment;

public interface CommentExtMapper {
    /**
     * 增加评论数
     *
     * @param comment
     * @return
     */
    int incCommentCount(Comment comment);
}