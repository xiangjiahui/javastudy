package FileFilter;

import java.io.File;

public class Demo02Filter {
    public static void main(String[] args) {
        File file = new File("C:\\Study");
        getALlFile(file);
    }

    public static void getALlFile(File dir){
 /*       File[] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                //过滤规则,pathname是文件夹或者是.java结尾的文件返回true
                return pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".java");
            }
        });*/

/*        File[] files = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                //过滤规则,pathname是文件夹或者是.java结尾的文件返回true
                return new File(dir,name).isDirectory() || name.toLowerCase().endsWith(".java");
            }
        });*/

        File[] files = dir.listFiles((File d, String name)->{
            //过滤规则,pathname是文件夹或者是.java结尾的文件返回true
            return new File(d,name).isDirectory() || name.toLowerCase().endsWith(".java");
        });
        for(File file : files){
            if(file.isDirectory()){
                getALlFile(file);
            }else {
                System.out.println(file);
            }
        }
    }
}
