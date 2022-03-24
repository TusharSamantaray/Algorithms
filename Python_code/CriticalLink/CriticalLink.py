from collections import defaultdict

class CriticalLink:
    def criticalLink(self, n : int, links : [[int]]) -> int:
        self.g = defaultdict(list)
        for k, v in links:
            self.g[k].append(v)
            self.g[v].append(k)

        self.res = []
        self.visited = set()
        self.low = {}

        self.dfs(0, -1, 0)
        return len(self.res)

    def dfs(self, id, prevNode, node):
        self.visited.add(node)
        self.low[node] = id

        for n in self.g[node]:
            if n == prevNode:
                continue
            if n not in self.visited:
                self.dfs(id+1, node, n)
            
            self.low[node] = min(self.low[node], self.low[n])
            if id < self.low[n]:
                self.res.append([node, n])