public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
/*
        int temp = a;
        a = b;
        b = temp;

 */     swap(a, b);

        String name = "kunal";
        ChangeName(name);
        System.out.println(a + " " + b);
    }

    static void ChangeName(String naam) {
        naam = "Rahul"; // creating a new object
    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
