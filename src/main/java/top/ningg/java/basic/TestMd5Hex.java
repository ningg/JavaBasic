package top.ningg.java.basic;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * Created by guoning on 16/2/25.
 */
public class TestMd5Hex {

    public static final String UUID1 = "CADD359096F14C93F44BF0DE200CB0EFF9FF05449BDE441D6BFFA09AB233E154";
    public static final String UUID2 = "390EA692905932B912245F1179B1A2392AC5635C88992B324696B3D1ED19D7BE";
    public static final String UUID3 = "DB6544A33F1AB590DD9B262810B89ACE14CFE1B92A231C13742F576E71DCD3DB";
    public static final String UUID4 = "7042C726C474D2D415EB6D8B0F4DA424B001338B386DE607B97567CCC75F1FE5";
    public static final String UUID5 = "E8C4C14E03CB3CD45F5996CB78D23D00FA286715A7CE401A152ADB63D5A0625C";
    public static final String UUID6 = "ED987E9185F98D60653E8E585D5903B487006499B156C13C3CD3D23011311843";

    public static void main(String[] args) {

        isUseRecoSort(UUID1);
        isUseRecoSort(UUID2);
        isUseRecoSort(UUID3);
        isUseRecoSort(UUID4);
        isUseRecoSort(UUID5);
        isUseRecoSort(UUID6);

    }

    private static boolean isUseRecoSort(String uuid) {
        System.out.println("uuid:" + uuid);
        String md5Hex = DigestUtils.md5Hex(uuid);
        System.out.println("md5Hex:" + uuid.hashCode());
        int result = Integer.valueOf(md5Hex.charAt(0)) % 16;
        System.out.println("result:" + result);
        System.out.println("---------");
        return result < 2;
    }
}
