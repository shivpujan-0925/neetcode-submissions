class Solution {
    public double myPow(double x, int n) {
        if(n == 0){
            return 1;
        }else if(n > 0){
            return Math.pow(x,n);
        }else{
            double X = 1/x;
            long N = -n;

            return Math.pow(X,N);
        }
    }
}
