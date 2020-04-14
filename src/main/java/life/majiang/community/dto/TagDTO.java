package life.majiang.community.dto;

import lombok.Data;

import java.util.List;

/**
 * @author zxh
 * @version 1.0
 * @date 2020/4/13 17:46
 */
@Data
public class TagDTO {
    private String categoryName;
    private List<String> tags;
}
