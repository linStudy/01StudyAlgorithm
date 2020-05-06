import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author: songlin
 * @date: 2020-05-06 16:00
 * @desc:
 */
public class ThreadPoolDemo {
    public static void main(String[] args) throws Exception {
        String  name= "linsong";

        //方式一
        //Class clazz = Class.forName("java.lang.String");

        //方式二
        //Class clazz = String.class;

        //方式三
        //String s = new String();
        //Class clazz = s.getClass();

        //方式四
        ClassLoader classLoader = ThreadPoolDemo.class.getClassLoader();
        Class  clazz = classLoader.loadClass("java.lang.String");

        //调用构造器
        Constructor cons = clazz.getConstructor(String.class);
        //实例化
        Object p = cons.newInstance("sting_num");


        Method len = clazz.getMethod("length");
        Object rs = len.invoke(p);
        System.out.println(rs .toString());
    }
}
