// 1342.将数字变成 0 的操作次数
// 给你一个非负整数 num，请你返回将它变成 0 所需要的步数。如果当前数字是偶数，你需要把它除以 2；否则，减去 1。
public class _1342NumberOfStepsToReduceANumberToZero {
    public static void main(String[] args) {
        int num = 14;
        System.out.println(numberOfSteps(num));
    }

    public static int numberOfSteps(int num) {
        int n = 0;
        for (int i = 1; ; i++) {
            if (num % 2 != 0) {
                num = num - 1;
            } else if (num == 0) {
                break;
            } else {
                num = num / 2;
            }
            n++;
        }
        return n;
    }
}