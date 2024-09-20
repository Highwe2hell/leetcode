// 1480.一维数组的动态和
// 给你一个数组 nums。数组「动态和」的计算公式为：runningSum[i] = sum(nums[0]…nums[i])。
// 请返回 nums 的动态和。
public class _1480RunningSumOf1dArray {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        int[] arr = runningSum(nums);
        for (int i : arr) {
            System.out.print(i + ",");
        }
    }

    public static int[] runningSum(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i + 1; j++) {
                arr[i] = arr[i] + nums[j];
            }
        }
        return arr;
    }
}