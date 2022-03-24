class TopologicalSort:
    def topoSort(self, pre_requisites: [[int]], total_courses: int) -> [int]:
        pre_req_dict = {}
        result = []

        # Create a dictiory with course as the key with a list of its pre-requisites as the value
        for courses in pre_requisites:
            pre_course, new_course = courses[0], courses[1]
            if new_course not in pre_req_dict.keys():
                pre_req_dict[new_course] = [pre_course]
            else:
                pre_req_dict[new_course].append(pre_course)

        # Copy all the course that does not have any pre-requisites
        for course in pre_requisites:
            if course[0] not in pre_req_dict.keys() and course[0] not in result:
                result.append(course[0])

        # Copy the remaning courses if their pre-requisites are already in the result list
        while len(pre_req_dict) > 0:
            courses_to_be_deleted = []
            for course, pre_reqs in pre_req_dict.items():
                if(all(x in result for x in pre_reqs)) and course not in result:
                    result.append(course)
                    courses_to_be_deleted.append(course)
            for course in courses_to_be_deleted:
                del pre_req_dict[course]

        return result