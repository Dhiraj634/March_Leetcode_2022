public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int ps = 0, pt = 0;
        while(pt < t.length() && ps < s.length()){
            if(s.charAt(ps) == t.charAt(pt)){
                ps++;
            }
            pt++;
        }
         return ps == s.length();

    }
}
