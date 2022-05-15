num = int(input('Digite um número inteiro(acima de duas casas): '))
invertido = str(num)[::-1]

print('Número inserido:  {} \nNúmero invertido: {}'.format(num, invertido))

if (num %2 == 0) and (invertido %2 == 0):
    print('True')
elif (num %2 == 1) and (invertido %2 == 1):
    print('True')
else:
    print('False')


'''a minha lógica era essa.. mas não consegui trocar o Invertido por int'''