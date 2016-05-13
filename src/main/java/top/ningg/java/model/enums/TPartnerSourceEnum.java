package top.ningg.java.model.enums;

public enum TPartnerSourceEnum implements org.apache.thrift.TEnum {
    YONGLE(0),
    SELF(1),
    MAHUA(2),
    JUOOO(3),
    YOUYANCHU(4),
    JUOOOS(5),
    EAST(6);

    private final int value;

    private TPartnerSourceEnum(int value) {
        this.value = value;
    }

    /**
     * Get the integer value of this enum value, as defined in the Thrift IDL.
     */
    public int getValue() {
        return value;
    }

    /**
     * Find a the enum type by its integer value, as defined in the Thrift IDL.
     * @return null if the value is not found.
     */
    public static TPartnerSourceEnum findByValue(int value) {
        switch (value) {
            case 0:
                return YONGLE;
            case 1:
                return SELF;
            case 2:
                return MAHUA;
            case 3:
                return JUOOO;
            case 4:
                return YOUYANCHU;
            case 5:
                return JUOOOS;
            case 6:
                return EAST;
            default:
                return null;
        }
    }
}