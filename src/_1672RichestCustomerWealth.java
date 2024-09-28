// 1672.最富有客户的资产
// 给你一个 mxn 的整数网格 accounts，其中 accounts[i][j] 是第 i 位客户在第 j 家银行托管的资产数量。返回最富有客户所拥有的资产总量 。
// 客户的资产总量就是他们在各家银行托管的资产数量之和。最富有客户就是资产总量最大的客户。
// 示例：
// 输入：accounts = [[1,5],[7,3],[3,5]]
// 输出：10
// 解释：
// 第 1 位客户的资产总量 = 6
// 第 2 位客户的资产总量 = 10
// 第 3 位客户的资产总量 = 8
// 第 2 位客户是最富有的，资产总量是 10
public class _1672RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1, 5}, {7, 3}, {3, 5}};
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        int maxSum = 0;
        int ros = accounts.length;// 行
        int col = accounts[0].length;// 列
        int[] arr = new int[ros];
        for (int i = 0; i < ros; i++) {
            for (int j = 0; j < col; j++) {
                arr[i] = arr[i] + accounts[i][j];
                if (arr[i] > maxSum) {
                    maxSum = arr[i];
                }
            }
        }
        return maxSum;
    }
}