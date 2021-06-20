/* Compile code without optimization option */
#include <stdio.h>
volatile int global = 10;
int globalNormal = 11;

int main(void)
{
    volatile int local = 20;
    volatile int localNormal = 22;
  
    printf("Direccion global volatile: %p \n", &global);
    printf("Direccion global normal: %p \n", &globalNormal);
  
    printf("Direccion local : %p \n", &local);
    printf("Direccion local : %p \n", &localNormal);
    
    int array[5];
    for (int i = 0; i < 5; i++)
    {
        array[i] = i;
        //printf("Direccion contador : %p \n", &i);
        printf("Direccion array : %p \n", &array[i]);
    }


    return 0;
}