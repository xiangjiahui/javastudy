import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*
java.util.Properties集合 extends Hashtable<K,V> implements Map<K,V>
Properties类表示了一个持久的属性集。Properties可保存在流中或从流中加载
Properties集合是一个唯一和IO流相结合的集合
        可以使用Properties集合中的方法store,把集合中临时数据,持久化写入到硬盘中存储
        可以使用Properties集合中的方法load,把硬盘中保存的文件(键值对)，读取到集合中使用
属性列表中每个键及其对应值都是一个字符串。
        Properties集合是一个双列集合，key和value默认都是字符串
 */
public class Demo01Properties {
    public static void main(String[] args) throws IOException {
//        demo01();
//        demo02();
        demo03();
    }

    /*
    使用Properties集合存储数据，遍历取出Properties集合中的数据
    Properties集合是一个双列集合，key和value默认都是字符串
    Properties集合有一些操作字符串的特有方法
        Object setProperty(String key, String value)调用 Hashtable 的方法 put
        String getProperty(String key)通过key值找到value值，此方法相当于Map集合中的get(key)方法
        Set<String> stringPropertyNames()返回此属性列表中的键集，其中该键及其对应值是字符串。
                                          此方法相当于调用Map集合中的keySet方法
     */
    private static void demo01() {
        Properties prop = new Properties();
        prop.setProperty("赵丽颖","165");
        prop.setProperty("古力娜扎","168");
        prop.setProperty("迪丽热巴","160");

        Set<String> set = prop.stringPropertyNames();

        for (String key : set) {
            String value = prop.getProperty(key);
            System.out.println(key+"-->"+value);
        }
    }

    /*
    可以使用Properties集合中的方法store,把集合中临时数据,持久化写入到硬盘中存储
    void store(Writer writer, String comments)
    void store(OutputStream out, String comments)
    参数：comments 注释，用来解释说明保存的文件是做什么的
     */
    private static void demo02() throws IOException {
        Properties prop = new Properties();
        prop.setProperty("赵丽颖","165");
        prop.setProperty("古力娜扎","168");
        prop.setProperty("迪丽热巴","160");

        FileWriter fw = new FileWriter("E:\\Study\\21_Properties\\Properties.txt");

        prop.store(fw,"save date");

        fw.close();
    }

    /*
    可以使用Properties集合中的方法load,把硬盘中保存的文件(键值对)，读取到集合中使用
     void load(InputStream inStream)
     void load(Reader reader)
     使用步骤：
            1.创建Properties集合对象
            2.使用Properties集合中的方法load读取保存键值对的文件
            3.遍历Properties集合
     注意事项：
            1.存储键值对的文件中，键与值的默认连接符号可以使用=，空格(或是其它符号)
            2.存储键值对的文件中，可以使用#进行注释，被注释的键值对不会在再读取
            3.存储键值对的文件中，键与值默认都是字符串，不用再加引号
     */
    private static void demo03() throws IOException {
        Properties prop = new Properties();
        prop.load(new FileReader("E:\\Study\\21_Properties\\Properties.txt"));

        Set<String> set = prop.stringPropertyNames();

        for(String key : set){
            String value = prop.getProperty(key);
            System.out.println(key+"="+value);
        }
    }
}
