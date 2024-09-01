#include <stdio.h>
int main()
{
    int a, n;
    scanf("%d", &n);
    for (a = 2; a <= n; a = a + 2)
    {
        printf(" %d", a);
    }
}