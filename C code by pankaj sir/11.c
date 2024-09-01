// Loop control statement using for().....

// x,x/2,x/3.....x/n

#include <stdio.h>

int main()
{
    float n, x;
    int i;
    printf("Enter value for x and n ");
    scanf("%f%f", &x, &n);
    for (i = 1; i <= n; i++)
    {
        printf("x/%d\n", i);
    }
    return 0;
}