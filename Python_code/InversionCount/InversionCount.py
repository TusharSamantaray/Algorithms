class InversionCount:
    def count(self, nums: [int]) -> [int]:
        def merge(A, temp, p, q, r):
            for i in range(p, r):
                temp[i] = A[i]

            i, j = p, q + 1
            for k in range(p, r):
                if i > q:
                    A[k] = temp[j]
                    j += 1
                elif j > r - 1:
                    inversion_count[temp[i][0]] += k - i
                    A[k] = temp[i]
                    i += 1
                elif temp[j][1] < temp[i][1]:
                    A[k] = temp[j]
                    j += 1
                else:
                    inversion_count[temp[i][0]] += k - i
                    A[k] = temp[i]
                    i += 1

        def sort(A, temp, p, r):
            if p < r - 1:
                q = p + (r - 1 - p) // 2
                sort(A, temp, p, q + 1)
                sort(A, temp, q + 1, r)
                merge(A, temp, p, q, r)
            return

        inversion_count = [0] * len(nums)
        A = list(enumerate(nums))
        temp = [0] * len(A)
        sort(A, temp, 0, len(A))
        return inversion_count

