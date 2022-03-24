from collections import defaultdict
import heapq as heap

class Dijkstra:

    def shortestDistance(self, edges, vertices):
        if vertices == 0: return []
        graph = defaultdict(list)
        distances = [-1] * vertices

        for u, v, d in edges:
            temp = {}
            temp[v] = d
            graph[u].append(temp)
        visited = set()
        pq = []
        nodeDisntance = defaultdict(lambda: float('inf'))
        nodeDisntance[0] = distances[0] = 0

        if len(edges) == 0: return distances
        heap.heappush(pq, (0, 0))

        while pq:
            _, node = heap.heappop(pq)
            visited.add(node)
            for items in graph[node]:
                for neighbor, distance in items.items():
                    if neighbor is visited: continue

                    newCost = nodeDisntance[node] + distance
                    if nodeDisntance[neighbor] > newCost:
                        nodeDisntance[neighbor] = distances[neighbor] = newCost
                        heap.heappush(pq, (newCost, neighbor))

        return distances