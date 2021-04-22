#!/bin/bash
while true; do ./servidor.sh | nc -q0 -l 20000 ; done
