import socket
import re

# Define socket host and port
HOST = '127.0.0.1'
PORT = 8089
data = ''
mensaje = "Buenos dias "
with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as s:
    s.bind((HOST, PORT))
    s.listen(1)
    conn, addr = s.accept()
    with conn:
        print('Connected by', addr)
        while True:
            respuesta = conn.recv(1024)
            data += str(respuesta)
            if ( len(respuesta) < 1 ): 
                break
            print(data)
            print("\n\n")

            m = re.search('User-Agent: .*',data)
            rCabecera = m.group()
            userAgent = rCabecera[rCabecera.find(':')+2:rCabecera.find('/r')]           
            mensaje += userAgent

            m = re.search('Host: .*',data)
            rCabecera = m.group()
            url = rCabecera[rCabecera.find(':')+2:rCabecera.find('/r')]
            mensaje += url

            conn.sendall(mensaje.encode())

s.close()