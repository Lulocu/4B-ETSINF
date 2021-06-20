import re
request = " GET / HTTP/1.1 /r/nUser-Agent: Wget/1.20.3 (linux-gnu)/r/nAccept: */*/r/nAccept-Encoding: identity/r/nHost: host:puerto/r/nConnection: Keep-Alive/r/n/n" 
m = re.search('User-Agent: .*',request)
aux = m.group()
aux2 = aux[aux.find(':')+2:aux.find('/r')]
print(aux2)