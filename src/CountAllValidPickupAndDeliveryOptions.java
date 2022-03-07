public class CountAllValidPickupAndDeliveryOptions {
    public int countOrders(int n) {
        int N = (int)Math.pow(10,9)+7;
        long prev = 1;
        long ans = 1L;
        for(int i=2;i<=n;i++){
            int num = 2 * (i-1) + 1;
            ans = (num*(num+1)*prev)/2;
            ans%=N;
            prev = ans;
        }
        return (int)ans;
    }
}
