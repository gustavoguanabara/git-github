sequencia =  str(input('Digite uma frase/palavra: ')).strip().upper()
caracteres = sequencia.split()
tudo = ''.join(caracteres)
inverso = tudo[::-1]
print('Entrada: {} \nInverso: {}'.format(tudo, inverso))
if inverso == tudo:
    print('\nA frase/palavra inserida é um palíndromo!')
else:
    print('\nA frase/palavra inserida não é um palíndromo.')
