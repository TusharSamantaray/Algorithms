class MajorityElement:
    def majority(self, A):
        majorityCount = {}

        for number in A:
            if number not in majorityCount.keys():
                majorityCount[number] = 1
            else:
                majorityCount[number] += 1

        for element, count in majorityCount.items():
            if count > len(A)/2:
                return element       
        return -1