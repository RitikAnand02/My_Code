// Factorial of n...

#include <stdio.h>
int fact(int);
int main()
{
    int n, s;
    printf("Enter a no ");
    scanf("%d", &n);
    s = fact(n);
    printf("factorial=%d", s);
    return 0;
}
int fact(int n)
{
    if (n == 1)
        return (1);
    else
        return (n * fact(n - 1));
}