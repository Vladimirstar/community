package life.majiang.community.dto;

import life.majiang.community.model.User;
import lombok.Data;

/**
 * @author zxh
 * @version 1.0
 * @date 2020/4/9 11:27
 */
@Data
public class CommentDTO {

    private Long id;

    private Long parentId;

    private Integer type;

    private String content;

    private Integer commentator;

    private Long gmtCreate;

    private Long gmtModified;

    private Long likeCount;

    private Long commentCount;

    private User user;
}
