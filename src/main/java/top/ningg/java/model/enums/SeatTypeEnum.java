package top.ningg.java.model.enums;

/**
 * Created by guoning on 16/3/25.
 */
public enum SeatTypeEnum {

    SEAT("座位"), NO_SEAT("过道");

    private final int ordinal;
    // 状态文字描述
    private final String desc;

    SeatTypeEnum(String desc) {
        this.ordinal = this.ordinal();
        this.desc = desc;
    }

    public int getOrdinal() {
        return ordinal;
    }

    public String getDesc() {
        return desc;
    }

}
