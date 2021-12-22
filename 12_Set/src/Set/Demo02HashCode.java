package Set;
/*
哈希值：是一个十进制的整数，由系统随机给出(就是对象的地址值，是一个逻辑地址，是模拟出来得到地址，不是数据实际存储的物理地址)
在Object类中有一个方法可以获取对象的哈希值：
                    int hashCode()返回改对象的哈希码值
                    hashCode方法的源码：
                        public native int hashCode();
                    native:代表改方法调用的是本地操作系统的方法
 */
public class Demo02HashCode {
    public static void main(String[] args) {
        Person p1 = new Person();
        int i = p1.hashCode();
        System.out.println(i);//2129789493

        Person p2 = new Person();
        int i1 = p2.hashCode();
        System.out.println(i1);//668386784

        /*
                toString方法的源码：
                        return getClass().getName() + "@" + Integer.toHexString(hashCode())
         */
        System.out.println(p1);//com.xjh.day06.Set.Person@7ef20235
        System.out.println(p2);//com.xjh.day06.Set.Person@27d6c5e


        /*
                String类的哈希值：
                        String类重写Object类的toString方法
         */
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1.hashCode());//96354
        System.out.println(s2.hashCode());//96354

        System.out.println("重地".hashCode());//1179395
        System.out.println("通话".hashCode());//1179395
    }
}
