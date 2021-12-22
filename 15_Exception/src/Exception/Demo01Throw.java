package Exception;

public class Demo01Throw {
    public static void main(String[] args) {
        int[] arr = null;
        int element = getElement(arr, 3);
    }

    public static int getElement(int[] arr,int index){
        if(arr == null){
            throw new NullPointerException("传递的数组的值是null");//throw关键字必须写在方法内部
        }

        if(index < 0 || index >arr.length - 1){
            throw new ArrayIndexOutOfBoundsException("传递的索引超出了数组的使用范围");
        }

        int ele = arr[index];
        return ele;
    }
}
