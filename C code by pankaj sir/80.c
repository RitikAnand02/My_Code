// Input a no and calculate its factor...

#include <stdio.h>
void fact(int);
int main()
{
    int n;
    printf("Enter a no ");
    scanf("%d", &n);
    fact(n);
    return 0;
}
void fact(int n)
{
    int i;
    for (i = 1; i <= n; i++)
    {
        if (n % i == 0)
            printf("%d ", i);
    }
}