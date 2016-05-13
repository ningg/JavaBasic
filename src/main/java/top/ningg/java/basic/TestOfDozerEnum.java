package top.ningg.java.basic;

import org.dozer.DozerBeanMapper;

import top.ningg.java.model.enums.PartnerSourceEnum;
import top.ningg.java.model.enums.TPartnerSourceEnum;

/**
 * Created by guoning on 16/4/21.
 */
public class TestOfDozerEnum {

    private static final DozerBeanMapper dozerBeanMapper = new DozerBeanMapper();

    public static void main(String[] args) {

        PartnerSourceEnum partnerSourceEnum = PartnerSourceEnum.EAST;
        TPartnerSourceEnum tPartnerSourceEnum = mapSingle(partnerSourceEnum, TPartnerSourceEnum.class);
        System.out.println(tPartnerSourceEnum.getValue());
    }

    public static <E, T> T mapSingle(E sourceObject, Class<T> targetClass) {
        if (null == sourceObject) {
            return null;
        }
        // TODO : 考虑 Enum 是否还有其他处理方式
        // 解决 TEnum 中没有
        if (targetClass.isEnum() && sourceObject instanceof Enum) {
            Enum<?> sourceObjectEnum = (Enum<?>) sourceObject;
            Object[] values = targetClass.getEnumConstants();
            for (Object value : values) {
                Enum<?> valueEnum = (Enum<?>) value;
                if (valueEnum.name() == sourceObjectEnum.name()) {
                    return (T) valueEnum;
                }
            }
        }
        return dozerBeanMapper.map(sourceObject, targetClass);
    }

}
