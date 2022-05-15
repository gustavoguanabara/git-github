import random
import numpy as np

lista1 = np.random.randint(1,26,(25))
lista2=[]

for num in lista1: 
    if num not in lista2: 
        lista2.append(num)
        lista2.sort()

print('\nLista 1: {} \nLista 2: {} '.format(lista1, lista2))
