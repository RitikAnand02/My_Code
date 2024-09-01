// input three no and calculate greatest using nested if ()...

#include <stdio.h>
int main()
{
    int n1, n2, n3;
    printf("Enter 3 no:");
    scanf("%d%d%d", &n1, &n2, &n3);
    if (n1 >= n2)
    {
        if (n1 >= n3)
        {
            printf("n1 is greatest");
        }
        else
        {
            printf("n3 is greatest");
        }
    }
    else
    {
        if (n2 >= n3)
        {
            printf("n2 is greatest:");
        }
        else
        {
            printf("n3 is greatest");
        }
    }
}