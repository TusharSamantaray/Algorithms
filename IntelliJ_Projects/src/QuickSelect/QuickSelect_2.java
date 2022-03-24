package QuickSelect;
import java.util.*;

public class QuickSelect_2
{
    static int select(int arr[], int k) {
        int n1 = arr.length;
        int n2 = ksmall(arr, 0, n1 - 1, k);
        return n2;
    }

    static int medianFunc(int arr[], int i,int n)
    {
        if(i <= n)
            Arrays.sort(arr, i, n);
        else
            Arrays.sort(arr, n, i);
        return arr[i+n/2];
    }

    static int ksmall(int arr[], int l, int r, int k)
    {
        if(k == 0)
            return 0;

        else if (k > 0 && k <= r - l + 1)
        {
            int n = r - l + 1 ;

            int i;

            int []median = new int[(n + 4) / 5];
            for (i = 0; i < n/5; i++)
                median[i] = medianFunc(arr,l + i * 5, 5);

            if (i*5 < n)
            {
                median[i] = medianFunc(arr,l + i * 5, n % 5);
                i++;
            }

            int medOfMed = (i == 1)? median[i - 1]:
                    ksmall(median, 0, i - 1, i / 2);

            int pos = partition(arr, l, r, medOfMed);

            if (pos-l == k - 1)
                return arr[pos+1];
            if (pos-l > k - 1) // If position is more, recur for left
                return ksmall(arr, l, pos - 1, k);

            return ksmall(arr, pos + 1, r, k - pos + l - 1);
        }

        return Integer.MAX_VALUE;
    }

    static int[] swap(int []arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }


    static int partition(int arr[], int l, int r, int x)
    {
        int i;
        for (i = l; i < r; i++)
            if (arr[i] == x)
                break;
        swap(arr, i, r);

        i = l;
        for (int j = l; j <= r - 1; j++)
        {
            if (arr[j] <= x)
            {
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, r);
        return i;
    }

    public static void main(String[] args)
    {
        int arr[] = {12, 3, 5, 7, 4, 19, 26}; //{3,4,5,7,12,19,26}
        int n = arr.length, k = 0;
        System.out.println(ksmall(arr, 0, n - 1, k));
    }
}