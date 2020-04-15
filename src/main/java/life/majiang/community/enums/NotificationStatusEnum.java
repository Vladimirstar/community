package life.majiang.community.enums;


/**
 * @author zxh
 * @version 1.0
 * @date 2020/4/14 14:42
 */
public enum NotificationStatusEnum {
    UNREAD(0), READ(1);
    private int status;

    public int getStatus() {
        return status;
    }

    NotificationStatusEnum(int status) {
        this.status = status;
    }

}
