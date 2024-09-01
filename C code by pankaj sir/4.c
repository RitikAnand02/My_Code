// input value of electricity unit and calculate electricity bill. according to following:

#include <stdio.h>
int main()
{
    float unit, bill;
    printf("Enter the unit:");
    scanf("%f", &unit);
    if (unit <= 200)
    {
        bill = 500;
    }
    else if (unit > 200 && unit <= 500)
    {
        bill = unit * 8;
    }
    else
    {
        bill = unit * 10;
    }
    printf("%.2f", bill);
}