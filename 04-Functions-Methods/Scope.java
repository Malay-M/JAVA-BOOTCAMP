public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //Block of code
        {
//            int a = 78; // already initialised outside the block in the same method, hence you cannot initialise again
            a = 100; // reassign the original reference to some other value
            System.out.println(a);
            int c = 99; // block scope
            // values initialised in this block, will remain in block
        }
        System.out.println(a);
//        System.out.println(c); // cannot use outside the block

        for(int i = 1; i <= 2; i++){
            System.out.println("hello");
        }
//        System.out.println(i); // we cannot print i outside the loop because we cannot use any variable that initialised in any block(here, for loop) of code
    }

    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
        // we can 0nly access the variables that are declared in side the function scope
    }
}
