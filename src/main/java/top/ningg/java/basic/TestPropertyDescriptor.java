package top.ningg.java.basic;

/**
 * Created by guoning on 16/3/25.
 */
public class TestPropertyDescriptor {

//    public static void main(String[] args) throws IllegalAccessException, IntrospectionException, InvocationTargetException, NoSuchMethodException {
//        Class beanClass = TArea.class;
//
//        // Class beanClass = Project.class;
//        BeanInfo beanInfo = null;
//        try {
//            beanInfo = Introspector.getBeanInfo(beanClass);
//        } catch (IntrospectionException e) {
//        }
//        PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
//        if (descriptors == null) {
//            descriptors = new PropertyDescriptor[0];
//        }
//
//        Method[] methods = beanClass.getMethods();
//        Field[]  fields = beanClass.getFields();
//        for (Field single : fields) {
//            System.out.println(single.getName());
//
//        }
//
//        System.out.println(descriptors);
//
//        testPD();
//    }
//
//    public static void testPD() throws IntrospectionException, InvocationTargetException, IllegalAccessException {
//        Project project = new Project();
//        project.setStatus(1);
//
//        PropertyDescriptor pd = new PropertyDescriptor("status", TProject.class);
//        Method readMethod = pd.getReadMethod();
//        Object result = readMethod.invoke(project);
//        System.out.println(result);
//        Method writeMethod = pd.getWriteMethod();
//        writeMethod.invoke(project, 2);
//        System.out.println(project.getStatus());
//    }
}
