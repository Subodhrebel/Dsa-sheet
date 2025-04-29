import java.util.HashSet;

public class Duplicatehashset {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] num1 = {1, 2, 3, 4, 5, 1, 6, 3};
        int[] num2 = {1, 2, 3, 5, 9};

        Duplicatehashset obj = new Duplicatehashset();
        System.out.println(obj.containsDuplicate(num1));  // Output: true
        System.out.println(obj.containsDuplicate(num2));  // Output: false
    }
}
