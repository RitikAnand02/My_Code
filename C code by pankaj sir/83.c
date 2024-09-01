// s=1+2+3....n

#include <stdio.h>
int sum(int);
int i = 1, s = 0;
int main()
{
    int n;
    printf("Enter a no ");
    scanf("%d", &n);
    sum(n);
    printf("sum=%d", s);
    return 0;
}
int sum(int n)
{
    if (i <= n)
    {
        s += i;
        i++;
        sum(n);
    }
}