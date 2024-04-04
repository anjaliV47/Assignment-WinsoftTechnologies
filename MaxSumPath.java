//A java program to find maximum sum path

public class MaxSumPath {
    public static void main(String[] args){
        int[] X = { 3, 6, 7, 8, 10, 12, 15, 18, 100 };
        int[] Y = { 1, 2, 3, 5, 7, 9, 10, 11, 15, 16, 18, 25, 50 };
        MaximumSumPath(X,Y);
    }
    public static void MaximumSumPath(int[] X, int[] Y){
        int m = X.length;
        int n = Y.length;
        int i = 0, j = 0;
        int sumOfX = 0, sumOfY = 0;
        int maxSum = 0;

        while (i < m && j < n){
            if (X[i] < Y[j]){
                sumOfX += X[i++];
            }else if (X[i] > Y[j]){
                sumOfY += Y[j++];
            }else { 
                maxSum += Math.max(sumOfX,sumOfY) + X[i];
                sumOfX = 0;
                sumOfY = 0;
                i++;
                j++;
            }
        }
        while (i < m) {
            sumOfX += X[i++];
        }
        while (j < n) {
            sumOfY += Y[j++];
        }
        maxSum += Math.max(sumOfX, sumOfY);
        System.out.println("Maximum sum path:");
        System.out.println("Maximum Sum: " + maxSum);
    }
}

