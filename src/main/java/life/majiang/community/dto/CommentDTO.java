package life.majiang.community.dto;

import lombok.Data;

/**
 * @author zxh
 * @version 1.0
 * @date 2020/4/2 18:05
 */
@Data
public class CommentDTO {
    private Long parentId;
    private String content;
    private Integer type;
}
