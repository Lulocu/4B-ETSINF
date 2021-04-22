#include <stdio.h>
#include <unistd.h>

void pila4()
{
    

}
void pila3()
{
    pila4();

}
void pila2()
{
    pila3();

}
void pila1()
{
    pila2();

}

void main(int argc, char *argv[])
{
    printf("%d", getpid());
    
    
    pila1();
}