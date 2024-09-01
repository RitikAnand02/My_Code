// Input a no and calculate sum if its even digit...

#include <stdio.h>
int sum(int);
int main()
{
    int n, s;
    printf("Enter a no ");
    scanf("%d", &n);
    s = sum(n);
    printf("Sum=%d", s);
    return 0;
}
int sum(int n)
{
    int m, s = 0;
    while (n > 0)
    {
        m = n % 10;
        if (m % 2 == 0)
        {
            s += m;
        }
        n = n / 10;
    }
    return (s);
}