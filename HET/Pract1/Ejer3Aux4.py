import socket as s
host = "localhost"
puerto = 8089
sock = s.socket()
sock.connect((host,puerto))
request = " GET / HTTP/1.1 /r/nUser-Agent: Wget/1.20.3 (linux-gnu)/r/nAccept: */*/r/nAccept-Encoding: identity/r/nHost: %s:%s/r/nConnection: Keep-Alive/r/n/n" % (host, puerto)
sock.send(request.encode())
while True:
    respuesta = sock.recv(4096)
    if ( len(respuesta) < 1 ): 
        break
    print(respuesta)
sock.close()
