import datetime

class Scheduling:
    def convert(A): 
        for i in range(0, len(A)):
            if A[i][0] > A[i][1]:
                A[i][1] = A[i][0] + A[i][1]
        return A

    def schedule(self, A : [[int]]) -> int:
        A = Scheduling.convert(A)
        A = sorted(A, key=lambda x: x[1])

        last_job_end_time = A[0][1]
        number_of_jobs = 1

        for i in range(1, len(A)):
            if A[i][0] >= last_job_end_time:
                number_of_jobs += 1
                last_job_end_time = A[i][1]
        
        return number_of_jobs
