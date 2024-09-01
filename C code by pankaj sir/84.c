// s=1+2+3....n method-2...

#include <stdio.h>
int sum(int);
int main()
{
    int n, s;
    printf("Enter a no ");
    scanf("%d", &n);
    s = sum(n);
    printf("sum=%d", s);
    return 0;
}
int sum(int n)
{
    if (n == 0)
    {
        return 0;
    }
    else
    {
        return (n + sum(n - 1));
    }
}