import struct
valor = int(input('Inserte un número: '))
try:
    b = struct.pack('b',valor)
    print(f"El número {valor} codificado con 1 byte es: {b}")
except:
    print('El número no es representable con 1 byte.')

try:
    h = struct.pack('h',valor)
    print(f"El número {valor} codificado con 2 bytes es: {h}")
except:
    print('El número no es representable con 2 bytes.')

try:
    i = struct.pack('i',valor)
    print(f"El número {valor} codificado con 4 bytes es: {i}")
except:
    print('El número no es representable con 4 bytes.')

