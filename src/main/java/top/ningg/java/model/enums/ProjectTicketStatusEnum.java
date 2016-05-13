package top.ningg.java.model.enums;

public enum ProjectTicketStatusEnum {

    // 预售
    PRESELL("预售"),
    // 出票中
    SELLING("出票中"),
    // 即将开售
    UPCOMING_SELL("即将开售");

    private final String desc;
    private final int ordinal;

    ProjectTicketStatusEnum(String desc) {
        this.desc = desc;
        this.ordinal = this.ordinal();
    }

    public String getDesc() {
        return desc;
    }

    public int getOrdinal() {
        return ordinal;
    }
}
