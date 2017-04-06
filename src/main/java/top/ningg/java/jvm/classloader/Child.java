package top.ningg.java.jvm.classloader;

/**
 * Created by guoning on 17/4/1.
 */
public class Child extends Parent{

    public static Integer MAX_AGE = 170;

    static{
        System.out.println("Static Code Of Child");
    }
}
