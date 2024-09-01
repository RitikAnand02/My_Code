#include <stdio.h>
int main()
{
    float PA, D;
    scanf("%f", &PA);
    if (PA >= 10000)
        D = PA * 20 / 100;
    else
        D = PA * 10 / 100;
    printf("%f", D);
}