// input value of year and print leap year or not using nested if ()....

#include <stdio.h>
int main()
{
    int y;
    printf("Enter value of year:");
    scanf("%d", &y);
    if (y % 100 == 0)
    {
        if (y % 400 == 0)
            printf("leap year");
        else
            printf("not");
    }
    else
    {
        if (y % 4 == 0)
            printf("leap year");
        else
            printf("not");
    }
}