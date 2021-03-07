package 测试;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] grass = {2,3,4,5,6};
        int[] milk = {2,4,7,9,12};
        System.out.println(MaxMilk(grass,milk));
    }
    public static int MaxMilk (int[] grass, int[] milk) {
        int n = grass.length;
        int[][] x = new int[n][2];
        for(int i = 0;i < n;i++){
            x[i][0] = grass[i];
            x[i][1] = milk[i];
        }
        Arrays.sort(x, (o1,o2) -> o1[0] == o2[0] ? o1[1] - o2[1] :o1[0] - o2[0]);
        int[] dp = new int[n];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = x[i][1];
        }
        for (int i = 1; i < dp.length ; i++) {
            for (int j = 0; j < i ; j++) {
                if(x[j][1] <= x[i][1]){
                    //dp[i]就等于j的奶牛加上自己的奶
                    dp[i] = Math.max(dp[i],dp[j]+x[i][1]);
                }
            }
        }
        int res = 0;
        for (int i = 0; i < dp.length; i++) {
            res = Math.max(res,dp[i]);
        }
        return res;
    }
}
