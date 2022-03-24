from collections import defaultdict

class StronglyConnectedComponents:
    graph = defaultdict(list)

    def scc(self, students: int, knows: [[int]]) -> [[int]]:
        used = [False] * students
        order = []
        self.form_graph(knows)
        for i in range(students):
            if not used[i]:
                self.dfs(self.graph, used, order, i)
        
        reverse_Graph = []
        for i in range(students):
            temp = []
            for j in self.graph[i]:
                temp.append(j)
            reverse_Graph.append(temp)
        
        components = []
        used = [False] * students

        for v in order:
            if not used[v]:
                component = []
                self.dfs(reverse_Graph, used, component, v)
                components.append(component)
        return components

    def form_graph(self, knows):
        for u, v in knows:
            self.graph[u].append(v)

    def dfs(self, graph, used, res, v):
        used[v] = True
        for k in graph[v]:
            if not used[k]:
                self.dfs(graph, used, res, k)
        res.append(v)