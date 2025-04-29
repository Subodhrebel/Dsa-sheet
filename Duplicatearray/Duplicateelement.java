import java.util.Arrays;
public class Duplicateelement {
    public static boolean duplicateSort(int[] nums) {
        Arrays.sort (nums) ;
        for (int i = 1; i<nums.length ; i++) {
            if (nums [i] == nums [i-1] ){
                return true;

            }

        }
    return false;
    }
    public static void main (String [] args){
        int []  nums = {1,2,3,5,6,4,9,8,8,5,3};
        int [] nums1 ={4,5,6,7,8,9};
        System.out.println(duplicateSort(nums));
        System.out.println(duplicateSort(nums1));

    }
}
