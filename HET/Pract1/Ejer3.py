import socket as s
host = "www.upv.es"
puerto = 80
sock = s.socket()
sock.connect((host,puerto))
request = "GET / HTTP/1.1\r\nHost:%s\r\n\r\n" % host
sock.send(request.encode())
while True:
    respuesta = sock.recv(4096)
    if ( len(respuesta) < 1 ): 
        break
    print(respuesta)
sock.close()


