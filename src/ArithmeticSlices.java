public class ArithmeticSlices {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length <=2) return 0;
        int diff = -1;
        int ans = 0;
        int count = 0;
        for(int i=0;i<nums.length-1;i++){
            int tempDiff = nums[i]-nums[i+1];
            if(tempDiff != diff){
                diff = tempDiff;
                int n = count +1; // Total Number of element in the array
                ans += (n) <=2 ? 0 : (((n-1)*(n-2))/2 );
                count = 1;
            }else{
                count++;
            }
        }
        int n = count +1; // Total Number of element in the array
        ans += (n) <=2 ? 0 : ((n-1)*(n-2))/2;
        return ans;
    }
}
