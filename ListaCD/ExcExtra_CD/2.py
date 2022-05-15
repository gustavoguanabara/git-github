from itertools import chain 

lista = [{"V":"S001"}, {"V": "S002"}, {"VI": "S001"}, {"VI": "S005"}, {"VII":"S005"}, {"V":"S009"},{"VIII":"S007"}]

print("Lista: " + str(lista)) 
lista2 = list(set(chain.from_iterable(sub.values() for sub in lista))) 
      
print("\nSaída: " +str(lista2)) 