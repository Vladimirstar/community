package life.majiang.community.dto;

import lombok.Data;
import org.jetbrains.annotations.NotNull;

/**
 * @author zxh
 * @version 1.0
 * @date 2020/4/21 17:25
 */
@Data
public class HotTagDTO implements Comparable {
    private String name;
    private Integer priority;

    @Override
    public int compareTo(@NotNull Object o) {
        return this.getPriority() - ((HotTagDTO) o).getPriority();
    }
}
