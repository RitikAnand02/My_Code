// Loop control statement using for().....

// x^2,x^2/2^2,x^2/3^2.....x^2/n^2

#include <stdio.h>

int main()
{
    float n, i, x;

    printf("Enter value for x and n ");
    scanf("%f%f", &x, &n);
    for (i = 1; i <= n; i++)
    {
        printf("%.2f\n", x * x / i * i);
    }
    return 0;
}