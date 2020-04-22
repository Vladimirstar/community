package life.majiang.community.dto;

import lombok.Data;

/**
 * @author zxh
 * @version 1.0
 * @date 2020/4/17 9:56
 */
@Data
public class QuestionQueryDTO {
    private String search;
    private String tag;
    private Integer page;
    private Integer size;
}
