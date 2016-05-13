package top.ningg.java.model.enums;

/**
 * 条目的促销折扣状态。注意区分于促销标签的状态 PromotionStatusEnum
 * Created by gaoxiaoyu on 16/1/21.
 */
public enum PromotionStatusEnum {
    NORMAL("普通条目"),
    PROMOTION("折扣条目");

    private final String desc;
    private final int ordinal;

    PromotionStatusEnum(String desc) {
        this.desc = desc;
        this.ordinal = ordinal();
    }

    public String getDesc(){
        return desc;
    }
    public int getOrdinal(){
        return ordinal;
    }
}
