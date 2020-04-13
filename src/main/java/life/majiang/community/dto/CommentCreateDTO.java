package life.majiang.community.dto;

import lombok.Data;

/**
 * @author zxh
 * @version 1.0
 * @date 2020/4/2 18:05
 */
@Data
public class CommentCreateDTO {
    /**
     * 问题或者评论id
     */
    private Long parentId;
    /**
     * 评论内容
     */
    private String content;
    /**
     * 类型：问题1，评论2
     */
    private Integer type;
}
