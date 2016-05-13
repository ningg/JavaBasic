package top.ningg.java.model.enums;

public enum PartnerSourceEnum {
    YONGLE("永乐票务"), SELF("自主上单"), MAHUA("开心麻花"), JUOOO("聚橙分销"), YOUYANCHU("有演出"), JUOOOS("聚橙5%"), EAST("东方票务");

    private final int ordinal;
    private final String desc;

    PartnerSourceEnum(String desc) {
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
