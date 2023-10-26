import duplicates.ContainsDuplicate;
import palindorm.Palindrom;
import twosum.TwoSum;


public class Main {
    public static void main(String[] args) {
        String input1 = "A man, a plan, a canal: Panama";
        System.out.println(Palindrom.isPalindrome(input1));

        String input2 = "race a car";
        System.out.println(Palindrom.isPalindrome(input2));

        String input3 = " ";
        System.out.println(Palindrom.isPalindrome(input3));




        ContainsDuplicate solution = new ContainsDuplicate();

        int[] nums1 = {1, 2, 3, 1};
        System.out.println(solution.containsDuplicate(nums1));

        int[] nums2 = {1, 2, 3, 4};
        System.out.println(solution.containsDuplicate(nums2));

        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(solution.containsDuplicate(nums3));



        int[] nums4 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = TwoSum.twoSum(nums4, target1);
        System.out.println("Example 1: [" + result1[0] + ", " + result1[1] + "]");

        int[] nums5 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = TwoSum.twoSum(nums5, target2);
        System.out.println("Example 2: [" + result2[0] + ", " + result2[1] + "]");

        int[] nums6 = {3, 3};
        int target3 = 6;
        int[] result3 = TwoSum.twoSum(nums6, target3);
        System.out.println("Example 3: [" + result3[0] + ", " + result3[1] + "]");

    }
}