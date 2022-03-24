class MinimumSpanningTree:
    def mst(self, edges: [[int]], vertices: int) -> int:
        i = 0
        e = 0        
        edges = sorted(edges, key=lambda  x:x[2])
        parent = [] 
        rank = [] 
        result = []

        for node in range(vertices):
            parent.append(node)
            rank.append(0)
        
        while e < vertices - 1:
            u, v, w = edges[i]
            i = i + 1
            x = self.find(parent, u)
            y = self.find(parent, v)

            if x != y:
                e = e + 1
                result.append([u, v, w])
                self.union(parent, rank, x, y)
        
        minimumCost = 0
        for u, v, w in result:
            minimumCost += w

        return minimumCost
    
    def union(self, parent, rank, x, y):
        xroot = self.find(parent, x)
        yroot = self.find(parent, y)
 
        if rank[xroot] < rank[yroot]:
            parent[xroot] = yroot
        elif rank[xroot] > rank[yroot]:
            parent[yroot] = xroot
 
        else:
            parent[yroot] = xroot
            rank[xroot] += 1
    
    def find(self, parent, i):
        if parent[i] == i:
            return i
        return self.find(parent, parent[i])
