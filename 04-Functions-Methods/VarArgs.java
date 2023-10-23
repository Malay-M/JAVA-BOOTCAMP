import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2, 3, 4, 5, 6, 74, 23, 21);
        multiple(2 , 3, "hello", "World", "java");
    }

    static void multiple(int a, int b, String ...v){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }


    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
