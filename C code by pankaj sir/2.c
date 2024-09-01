// input purchase amount and calculate pa according to following:

#include <stdio.h>
int main()
{
    float PA, D, P;
    printf("Enter purchase amount:");
    scanf("%f", &PA);
    if (PA >= 15000)
    {
        D = PA * 40 / 100;
    }
    else if (PA >= 10000)
    {
        D = PA * 30 / 100;
    }
    else
    {
        D = PA * 20 / 100;
    }
    P = PA - D;
    printf("%.2f", P);
}