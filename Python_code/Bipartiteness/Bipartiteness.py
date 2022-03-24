from collections import defaultdict, deque
class Bipartiteness:
    def form_graph(self, edges):
        graph = defaultdict(list)
        for u, v in edges:
            graph[u].append(v)
            graph[v].append(u)
        return graph

    def bipartite(self, edges, vertices):
        self.graph = self.form_graph(edges)
        self.level = [-1] * vertices
        for i in range(vertices):
            if self.level[i] == -1 and not self.BFS(i):
                return -1
        return 1
    
    def BFS(self, src): 
        q = []
        q.append(src)
        while q:
            u = q.pop()
            for v in self.graph[u]:
                if self.level[v] == -1:
                    self.level[v] = 1 - self.level[u]
                    q.append(v)
                elif self.level[u] == self.level[v]:
                    return False
        return True