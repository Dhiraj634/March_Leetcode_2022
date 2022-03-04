import java.util.HashMap;

public class Champagne_Tower {
    HashMap<Integer,Double> map = new HashMap<>();
    public double champagneTower(int poured, int query_row, int query_glass) {
        int n = (query_row * (query_row+1)) / 2 + query_glass;
        get(query_row, poured, n);
        return map.get(n) >=1 ? 1 : map.get(n);
    }
    private double get(int row, int poured, int n){
        if(row == 0){
            map.put(0,poured*1.0);
            return poured*1.0 >=1 ? ((poured * 1.0) - 1.0)/2 : 0;
        }
        if(map.containsKey(n)) return map.get(n) >=1 ? (map.get(n) -1 )/2 : 0;
        int prev1 = n - row;
        int prev2 = n-row-1;
        int col = n - (row * (row+1))/2;
        if(col == row){
            double ans = get(row -1, poured, prev2);
            map.put(n,ans);
            return ans >=1 ? (ans - 1)/2 : 0;
        }else if(col == 0){
            double ans = get(row -1, poured, prev1);
            map.put(n,ans);
            return ans >=1 ? (ans - 1)/2 : 0;
        }
        else{
            double ans2 = get(row -1, poured, prev2);
            double ans1 = get(row -1, poured, prev1);
            map.put(n,ans1 + ans2);
            return (ans1 + ans2) >=1 ? ((ans1 + ans2) - 1)/2 : 0;
        }
    }
}
