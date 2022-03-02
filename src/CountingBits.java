public class CountingBits {
    public int[] countBits(int n) {
        if(n==0) return new int[]{0};
        int[] dp = new int[n+1];
        dp[1]=1;
        int twoPow = 2;
        for(int i=2;i<=n;i++){
            // int k = (int)(Math.log(i)/Math.log(2));
            // int msb = (1 << k);
            // dp[i] = 1+dp[i-msb];
            int res = i & (i-1);
            if(res == 0) // Is Power of two
            {
                dp[i] =1;
                twoPow = i;
            }
            dp[i] = 1+ dp[i-twoPow];
        }
        return dp;
    }
}
