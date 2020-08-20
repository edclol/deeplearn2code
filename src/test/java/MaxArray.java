import java.util.Scanner;

public class MaxArray {

    public static void main(String[] args) {

        System.out.println("请输入几个数并用空格隔开：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n);
        String nextLine = sc.next();
        String[] arr = nextLine.split(" ");
        int[] b = new int[arr.length];
        for (int j = 0; j < b.length; j++) {
            b[j] = Integer.parseInt(arr[j]);
            System.out.println(b[j] + " ");
        }

        int result = maxSubArray(b);
        System.out.println("最大子段和为：" + result);

    }



    public static int maxSubArray(int[] nums) {
        int res = nums[0];
        for(int i = 1; i < nums.length; i++) {
            nums[i] += Math.max(nums[i - 1], 0);
            res = Math.max(res, nums[i]);
        }
        return res;
    }

//    public static int maxSubArray(int[] nums) {
//        // 参数校验
//        if (nums == null || nums.length < 1) {
//            throw new IllegalArgumentException("Array must contain an element");
//        }
//
//        // 记录最大的子数组和，开始时是最小的整数
//        int max = Integer.MIN_VALUE;
//        // 当前的和
//        int curMax = 0;
//        // 数组遍历
//        for (int i : nums) {
//            // 如果当前和小于等于0，就重新设置当前和
//            if (curMax <= 0) {
//                curMax = i;
//            }
//            // 如果当前和大于0，累加当前和
//            else {
//                curMax += i;
//            }
//
//            // 更新记录到的最在的子数组和
//            if (max < curMax) {
//                max = curMax;
//            }
//        }
//
//
//        return max;
//
//
//    }
}