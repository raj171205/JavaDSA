class Solution {
    public char findTheDifference(String s, String t) {
        int m = s.length();
        int n = t.length();
        int sumOfs = 0;
        int sumOft = 0;

        for(int i=0;i<m;i++){
            char ch = s.charAt(i);
            int val = ch - 'a' + 1;
            sumOfs +=val;
        }

        for(int j=0;j<n;j++){
            char che = t.charAt(j);
            int vale = che - 'a' + 1;
            sumOft +=vale;
        }

        int res = sumOft - sumOfs;

        char chr = (char)('a' + res - 1);

        return chr;
    }
}