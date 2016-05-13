package top.ningg.java.basic;

/**
 * Created by guoning on 16/4/6.
 */
public class TestOfHashcode {

    private static Double ab_test_reco_percent = 1.00;

    public static void main(String[] args) {
//        String uuid = "A81934F07FA816852CCFE2A3DB0A667B08671F33E9FC15FCA5B779CCBE74EF1D";
//        String uuid = "488AC56D1FD7BC3CBA6DEE0881FF7F8D1992AF4BED48004FFC7310F921187675";
        String uuid = "14DEE0F3059261D2F7D0E5B95CFA2283597636CBA3BF35A7D1FF38105CE0B44A";
        boolean isReco = isUseReco(uuid);
    }

    private static boolean isUseReco(String uuid) {
        int hashCode = uuid.hashCode();
        int result = Math.abs(hashCode) % 100;
        int threshold = (int) (0.20 * 100);
        if (null != ab_test_reco_percent && ab_test_reco_percent <= 1) {
            threshold = (int) (ab_test_reco_percent * 100);
        }
        return result < threshold;
    }
}
