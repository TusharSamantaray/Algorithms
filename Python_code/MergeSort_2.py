import math

class MergeSort:
    def merge(self, A, p, q, r):
        n1 = q - p + 1
        n2 = r - q

        L = [0] * (n1 + 1)
        R = [0] * (n2 + 1)

        for i in range(0, n1):
            L[i] = A[p + i]
        for i in range(0, n2):
            R[i] = A[q + 1 + i]

        L[n1] = R[n2] = math.inf

        i, j, k = 0, 0, p

        while(k < r):
            if L[i] <= R[j]:
                A[k] = L[i]
                i = i+1
            else:
                A[k] = R[j]
                j = j+1
            k = k+1
            
    def sort(self, A, p, r):
        if p < r:
            m = int(p + (r - p)/2)

            self.sort(A, p, m)
            self.sort(A, m+1, r)
            self.merge(A, p, m, r)

# Driver code to test above 
#arr = [12, 11, 13, 5, 6, 7] 
arr = [12, 12, 23, 4 , 6 , 6, 10, -35, 28]
n = len(arr) 
print ("Given array is") 
print(arr)
  
ob = MergeSort()
ob.sort(arr, 0, n)

print(arr)
