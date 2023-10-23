/*25. Kunal is allowed to go out with his friends only on the
even days of a given month. Write a program to count the number
 of days he can go out in the month of August.*/

public class EvenDays {
    public static void main(String[] args) {
        int days = 31, count = 0;
        for (int i = 1; i <= days; i++)
        {
            if(i % 2 == 0)
                count++;
        }
        System.out.println(count + " time kunal can go out in the month of august");
    }
}
