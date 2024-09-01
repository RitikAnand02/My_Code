// input purchase amount and calculate discount...

#include <stdio.h>
int main()
{
    float pa, d;
    printf("Enter purchase amount:");
    scanf("%f", &pa);
    if (pa >= 10000)
        d = pa * 20 / 100;
    else
        d = pa * 10 / 100;
    printf("%.2f", d);
}