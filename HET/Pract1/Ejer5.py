import base64
f = open("cod.out","r")
aux = base64.b64decode(f.read())
print(aux)