// Input a no and prime no...

#include <stdio.h>
int prime(int);
int main()
{
    int n;
    printf("Enter a no ");
    scanf("%d", &n);
    prime(n);
    return 0;
}
int prime(int n)
{
    int i, c = 0;
    for (i = 1; i <= n; i++)
    {
        if (n % i == 0)
            c++;
    }
    if (c == 2)
        printf("Prime");
    else
    {
        printf("Not a Prime");
    }
}