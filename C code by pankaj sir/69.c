// s=1+2+3+...n....

#include <stdio.h>
int sum(int);
int main()
{
    int n, s;
    printf("Enter a no ");
    scanf("%d", &n);
    s = sum(n);
    printf("Total Sum=%d", s);
    return 0;
}
int sum(int n)
{
    int i, s = 0;
    for (i = 0; i <= n; i++)
    {
        s += i;
    }
    return (s);
}