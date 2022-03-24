from collections import defaultdict
class BreadthFirstSearch:
    def breadthFirstSearch(self, edges, vertices):
        if vertices == 0:
            return []
        self.g = defaultdict(list)
        for k, v in edges:
            self.g[k].append(v)
        visited = [False] * vertices
        queue = [0]
        distance = [-1] * vertices
        distance[0] = 0
        visited[0] = True
        while queue:
            u = queue.pop(0)            
            for v in self.g[u]:
                if visited[v] == False:
                    visited[v] = True
                    queue.append(v)
                    distance[v] = distance[u] + 1
        return distance