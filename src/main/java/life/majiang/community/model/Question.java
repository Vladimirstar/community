package life.majiang.community.model;

import lombok.Data;

@Data
public class Question {

    private Integer id;

    private String title;

    private String description;

    private Integer creator;

    private String commentCount;

    private String viewCount;

    private String likeCount;

    private String tag;

    private Long gmtCreate;

    private Long gmtModified;
}
