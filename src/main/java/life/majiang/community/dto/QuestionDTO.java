package life.majiang.community.dto;

import life.majiang.community.model.User;
import lombok.Data;

/**
 * 问题数据DTO
 */
@Data
public class QuestionDTO {

    private Integer id;

    private String title;

    private String description;

    private Integer creator;

    private Integer commentCount;

    private Integer viewCount;

    private Integer likeCount;

    private String tag;

    private Long gmtCreate;

    private Long gmtModified;

    private User user;
}
