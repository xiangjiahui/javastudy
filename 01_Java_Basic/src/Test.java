public class Test {

    public static void main(String[] args) {
        String s = "qwertyfg";
        int [] a = {1,0,2,4,7,3,5,6};
        char[] c = new char[a.length];
        for (int i = 0; i < a.length; i++) {
            c[a[i]] = s.charAt(i);
        }
        System.out.println(String.valueOf(c));
    }
}
