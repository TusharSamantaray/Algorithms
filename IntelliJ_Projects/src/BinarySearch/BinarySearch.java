package BinarySearch;
import static org.junit.Assert.*;


public class BinarySearch {
//    static int search(int A[], int key) {
//        int begin = 0;
//        int last = A.length - 1;
//
//        while (begin <= last) {
//            int mid = (begin + last)/2;
//            if (A[mid] < key){
//                begin = mid + 1;
//            }
//            else if (A[mid] > key){
//                last = mid - 1;
//            }
//            else {
//                return mid;
//            }
//        }
//        return -1;
//    }
    static int search(int A[], int key) {
        int low = 0;
        int high = A.length;
        int mid = 0;
        int result = -1;
        assertTrue(result == -1 || A[result] == key);
        while (low != high && result == -1) {
            mid = (low + high) / 2;
            if (A[mid] < key) {
                low = mid + 1;
            }
            else if (A[mid] > key) {
                high = mid;
            }
            else {
                result = mid;
            }
        }
        assertTrue(result == -1 || A[result] == key);
        return result;
    }
}
