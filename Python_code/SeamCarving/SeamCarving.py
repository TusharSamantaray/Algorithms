class SeamCarving:
    def carve_seam(self, disruption: [[int]]) -> [int]:
        disruption = disruption[::-1]
        table = [disruption.pop(0)]

        for row in disruption:
            curr_table_row = table[len(table) - 1]
            new_table_row = []
            for i in range(len(row)):
                if i == 0:
                    new_table_row.append(min(curr_table_row[i], curr_table_row[i+1]) +  row[i])
                elif i == len(row) - 1:
                    new_table_row.append(min(curr_table_row[i], curr_table_row[i-1]) +  row[i])
                else:
                    new_table_row.append(min(curr_table_row[i], curr_table_row[i-1], curr_table_row[i+1]) + row[i])
            table.append(new_table_row)

        return SeamCarving().find_seam(table[::-1])

    # Construct the smallest path
    def find_seam(self, table):
        curr_row = table.pop(0)
        last_index = curr_row.index(min(curr_row))
        path = [last_index]

        for row in table:
            if last_index == 0:
                if row[last_index] < row[last_index + 1]:
                    path.append(last_index)
                else:
                    path.append(last_index + 1)
            elif last_index == len(row) - 1:
                if row[last_index - 1] < row[last_index]:
                    path.append(last_index - 1)
                else:
                    path.append(last_index)
            else:
                if row[last_index] < row[last_index + 1]:
                    if row[last_index - 1] < row[last_index]:
                        path.append(last_index - 1)
                    else:
                        path.append(last_index)
                else:
                    if row[last_index - 1] < row[last_index + 1]:
                        path.append(last_index - 1)
                    else:
                        path.append(last_index + 1)
            last_index = path[len(path) - 1]
        return path
