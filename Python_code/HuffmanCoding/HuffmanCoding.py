from typing import Any
from collections import deque

class HuffmanCoding:
    class Node(object):
        def __init__(self, value=None):
            self.value = value
            self.left = None
            self.right = None

        def set_value(self, value):
            self.value = value

        def get_value(self):
            return self.value

        def set_left_child(self, left):
            self.left = left

        def set_right_child(self, right):
            self.right = right

        def get_left_child(self):
            return self.left

        def get_right_child(self):
            return self.right

        def has_left_child(self):
            return self.left != None

        def has_right_child(self):
            return self.right != None

        def __repr__(self):
            return f"Node({self.get_value()})"

        def __str__(self):
            return f"Node({self.get_value()})"

    class Tree:
        def __init__(self):
            self.root = None

        def set_root(self, value):
            self.root = HuffmanCoding.Node(value)

        def get_root(self):
            return self.root

        def __repr__(self):
            level = 0
            q = HuffmanCoding.Queue()
            visit_order = list()
            node = self.get_root()
            q.enq((node, level))
            while (len(q) > 0):
                node, level = q.deq()
                if node == None:
                    visit_order.append(("<empty>", level))
                    continue
                visit_order.append((node, level))
                if node.has_left_child():
                    q.enq((node.get_left_child(), level + 1))
                else:
                    q.enq((None, level + 1))

                if node.has_right_child():
                    q.enq((node.get_right_child(), level + 1))
                else:
                    q.enq((None, level + 1))

            s = "Tree\n"
            previous_level = -1
            for i in range(len(visit_order)):
                node, level = visit_order[i]
                if level == previous_level:
                    s += " | " + str(node)
                else:
                    s += "\n" + str(node)
                    previous_level = level

            return s

    class Queue:
        def __init__(self):
            self.q = deque()

        def enq(self, value):
            self.q.appendleft(value)

        def deq(self):
            if len(self.q) > 0:
                return self.q.pop()
            else:
                return None

        def __len__(self):
            return len(self.q)

        def __repr__(self):
            if len(self.q) > 0:
                s = "<enqueue here>\n_________________\n"
                s += "\n_________________\n".join([str(item) for item in self.q])
                s += "\n_________________\n<dequeue here>"
                return s
            else:
                return "<queue is empty>"


    def build(self, text : str) -> Any:
        lst = HuffmanCoding().return_frequency(text)
        nodes_list = []
        for node_value in lst:
            node = HuffmanCoding.Node(node_value)
            nodes_list.append(node)

        while len(nodes_list) != 1:
            first_node = nodes_list.pop()
            second_node = nodes_list.pop()
            val1, char1 = first_node.value
            val2, char2 = second_node.value
            node = HuffmanCoding.Node((val1 + val2, char1 + char2))
            node.set_left_child(second_node)
            node.set_right_child(first_node)
            HuffmanCoding().sort_values(nodes_list, node)

        root = nodes_list[0]
        tree = HuffmanCoding.Tree()
        tree.root = root
        return HuffmanCoding().get_codes(tree.root)
    
    def encode(self, Dic : Any, text : str) -> str:
        if text == '':
            return ''
        codes = ''
        for char in text:
            codes += Dic[char]
        return str(codes)

    def decode(self, Dic : Any, text : str) -> str:
        if text == '':
            return ''
        reversed_dict = {}
        for value, key in Dic.items():
            reversed_dict[key] = value
        start_index = 0
        end_index = 1
        max_index = len(text)
        s = ''

        while start_index != max_index:
            if text[start_index : end_index] in reversed_dict:
                s += reversed_dict[text[start_index : end_index]]
                start_index = end_index
            end_index += 1

        return str(s)

    def get_codes(self, root):
        if root is None:
            return {}
        frequency, characters = root.value
        char_dict = dict([(i, '') for i in list(characters)])

        left_branch = HuffmanCoding().get_codes(root.get_left_child())

        for key, value in left_branch.items():
            char_dict[key] += '0' + left_branch[key]

        right_branch = HuffmanCoding().get_codes(root.get_right_child())

        for key, value in right_branch.items():
            char_dict[key] += '1' + right_branch[key]

        return char_dict

    def return_frequency(self, data):
        # Take a string and determine the relevant frequencies of the characters
        frequency = {}
        for char in data:
            if char in frequency:
                frequency[char] += 1
            else:
                frequency[char] = 1
        lst = [(v, k) for k, v in frequency.items()]
        # Build and sort a list of tuples from lowest to highest frequencies
        lst.sort(reverse=True)
        return lst

    # A helper function to the build_tree()
    def sort_values(self, nodes_list, node):
        node_value, char1 = node.value
        index = 0
        max_index = len(nodes_list)
        while True:
            if index == max_index:
                nodes_list.append(node)
                return
            current_val, char2 = nodes_list[index].value
            if current_val <= node_value:
                nodes_list.insert(index, node)
                return
            index += 1

