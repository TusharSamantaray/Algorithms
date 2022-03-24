class FamilyForest:
    families = {}
    rank = {}

    def make_family(self, s: str) -> None:
        self.families[s] = s
        self.rank[s] = 0

    def union(self, s: str, t: str) -> str:
        if self.rank[self.families[s]] > self.rank[self.families[t]]:
            self.families[t] = s
            return s
        elif self.rank[self.families[t]] > self.rank[self.families[s]]:
            self.families[s] = t
            return t
        else:
            self.families[t] = s
            self.rank[s] += 1
            return s 

    def find(self, s: str) -> str:
        if self.families[s] == s:
            return s
        else:
            res = self.find(self.families[s])
            self.families[s]= res
            return res