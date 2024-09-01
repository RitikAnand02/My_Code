// Factorial of n term...

#include <stdio.h>
int fact(int);
int main()
{
    int n, s;
    printf("Enter a no ");
    scanf("%d", &n);
    s = fact(n);
    printf("Total Sum=%d", s);
    return 0;
}
int fact(int n)
{
    int i, s = 1;
    for (i = 1; i <= n; i++)
    {
        s *= i;
    }
    return (s);
}