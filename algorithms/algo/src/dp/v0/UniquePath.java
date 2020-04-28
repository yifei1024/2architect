package dp.v0;

/**
 * @author yifei
 */
public class UniquePath {

    /**
     * dp(m,n) = dp(m-1,n)+ dp(m,n-1)
     */
    public static void main(String[] args) {
        System.out.println(uniquePaths(7, 3));
    }

    public static int uniquePaths(int m, int n) {
        // 初始化
        if (m == 1) return 1;

        if (n == 1) return 1;

        return uniquePaths(m - 1, n) + uniquePaths(m, n - 1);
    }
}
