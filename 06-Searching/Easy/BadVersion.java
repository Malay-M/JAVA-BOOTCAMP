/*3. [First Bad Version](https://leetcode.com/problems/first-bad-version/) */

public class BadVersion {
    
    static int badVersion = 4; 

    public static int firstBadVersion(int n) {
        int low = 1, high = n; 
        
        while (low < high) {   
            int mid = low + (high - low) / 2;
            
            if (isBadVersion(mid)) {  
                high = mid;           
            } else {
                low = mid + 1;       
            }
        }
        
        return low; 
    }

  
    public static boolean isBadVersion(int version) {
        return version >= badVersion;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(firstBadVersion(n)); 
    }
}
