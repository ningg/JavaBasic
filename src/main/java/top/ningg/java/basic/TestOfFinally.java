package top.ningg.java.basic;

public class TestOfFinally {

    public static void main(String[] args) {

        int result = getValueOfI();
        System.out.println(result);
        result = getValueOfIWithFinallyReturn();
        System.out.println(result);

    }

    public static int getValueOfI() {
        int i = 0;
        try {
            i = 1;
            return i;
        } finally {
            i++;
        }
    }

    public static int getValueOfIWithFinallyReturn() {
        int i = 0;
        try {
            i = 1;
            return i;
        } finally {
            i++;
            return i;
        }
    }
}
