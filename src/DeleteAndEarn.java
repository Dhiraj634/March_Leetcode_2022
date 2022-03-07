import java.util.ArrayList;
import java.util.List;

public class DeleteAndEarn {
    public int deleteAndEarn(int[] nums) {
        if(nums.length == 1) return nums[0];
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int num : nums){
//            map.put(num, map.getOrDefault(num,0)+1);
//        }
        int[] fre = new int[10001];
        for(int num : nums){
            fre[num]++;
        }
        List<Integer> arr = new ArrayList<>();
        for(int i=1;i<=1000;i++){
            if(fre[i]!=0){
                arr.add(i);
            }
        }
        // Remember if a num can be taken then all of it's repetition can be taken
        int[][] dp = new int[arr.size()][2];
        dp[0][0] = arr.get(0) * fre[arr.get(0)];
        dp[0][1] = 0;
        for(int i=1;i<arr.size();i++){
            if(fre[arr.get(i)-1] !=0){
                dp[i][0] = arr.get(i) * fre[arr.get(i)] + dp[i-1][1];
            }else{
                dp[i][0] = arr.get(i) * fre[arr.get(i)] + Math.max(dp[i-1][1],dp[i-1][0]);;
            }
            dp[i][1] = Math.max(dp[i-1][1],dp[i-1][0]);
        }
        return Math.max(dp[arr.size()-1][1],dp[arr.size()-1][0]);
    }
}
