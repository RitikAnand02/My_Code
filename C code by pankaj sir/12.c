// Loop control statement using for().....

// 1/x,3/x,5/x.....x/n

#include <stdio.h>

int main()
{
    float n, i, x;

    printf("Enter value for x and n ");
    scanf("%f%f", &x, &n);
    for (i = 1; i <= n; i += 2)
    {
        printf("%.2f\n", i / x);
    }
    return 0;
}