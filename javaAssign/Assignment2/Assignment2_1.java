import java.util.Arrays;

public class Assignment2_1 {
    public static void main(String[] args) {
        int[] A = {1, 3, 5, 7};
        int[] B = {2, 4, 6, 8};
        
        int[] C = mergeSortedArrays(A, B);
        
        System.out.println("Merged array: " + Arrays.toString(C));
    }
    
    public static int[] mergeSortedArrays(int[] A, int[] B) {
        int lenA = A.length;
        int lenB = B.length;
        
        int[] C = new int[lenA + lenB];
        
        int i = 0, j = 0, k = 0;
        
        while (i < lenA && j < lenB) {
            if (A[i] < B[j]) {
                C[k++] = A[i++];
            } else {
                C[k++] = B[j++];
            }
        }
        
        while (i < lenA) {
            C[k++] = A[i++];
        }
        
        while (j < lenB) {
            C[k++] = B[j++];
        }
        
        return C;
    }
}
