from collections import Counter

d1 = Counter({'a': 100, 'b': 200, 'c':300})
d2 = Counter({'a': 300, 'b': 200, 'd':400})

soma = d1 + d2
print(soma)