//A java program to Merge two arrays

import java.util.Arrays;

public class MergeArr{
    public static void main(String[] args){
        int[] X = {0, 2, 0, 3, 0, 5, 6, 0, 0};
        int[] Y = {1, 8, 9, 10, 15};
        mergeTwoArrays(X, Y);
        System.out.println(Arrays.toString(X));
    }
    public static void mergeTwoArrays(int[] X, int[] Y){
        int m = X.length;
        int n = Y.length;
        int end = m - 1;
        for (int i = m - 1; i >= 0; i--){
            if (X[i] != 0) {
                X[end--]= X[i];
            }
        }
        int i = end + 1; 
        int j = 0;    
        int p = 0;     
        while (i < m && j < n){
            if (X[i] < Y[j]){
                X[p++] = X[i++];
            } else {
                X[p++] = Y[j++];
            }
        }
        while (j < n) {
            X[p++] = Y[j++];
        }
    }
}