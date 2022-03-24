package BinarySearch2D;
public class BinarySearch2D
{
    static int[] search(int[][] M, int q) {
        int[] result = {-1, -1};

        if (M.length == 0) return result;

        int no_of_rows = M.length;
        int no_of_cols = M[0].length;

        int begin = 0;
        int last = no_of_rows*no_of_cols - 1;

        while(begin <= last) {
            int mid = begin + (last - begin)/2;

            //Find the middle element. Mid/no_of_cols gives us the row number of the middle element and mid%no_of_cols gives us the column number of the middle element
            int mid_element = M[mid/no_of_cols][mid%no_of_cols];

            if (mid_element < q) {
                begin = mid + 1;
            } else if (mid_element > q) {
                last = mid - 1;
            } else {
                result[0] = mid/no_of_cols;
                result[1] = mid%no_of_cols;
                return result;
            }
        }
        return result;
    }
}
