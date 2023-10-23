import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {
//        fun(67);
//        fun("Hello World");
        int ans = sum(3, 4, 10);
        System.out.println(ans);
        demo(2, 3, 4, 5);
        demo("hello", "world");
    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
    static void fun(int a) {
        System.out.println("first one");
        System.out.println(a);
    }

    static int sum(int a, int b){
        return a + b;
    }

    static int sum(int a, int b, int c){
        return a + b + c;
    }

    static void fun(String name){
        System.out.println("second one");
        System.out.println(name);
    }
}
