package life.majiang.community.dto;

import lombok.Data;

/**
 * @author zxh
 * @version 1.0
 * @date 2020/4/14 15:22
 */
@Data
public class NotificationDTO {

    private Long id;

    private Long gmtCreate;

    private Integer status;

    private Long notifier;

    private String notifierName;

    private Long outerId;

    private String outerTitle;

    private String typeName;

    private Integer type;
}
