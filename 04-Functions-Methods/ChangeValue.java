import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        // creating an array

        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums){
        nums[0] = 99; // if you make a change to the object via this reference variable, same object will be changed
    }
}
