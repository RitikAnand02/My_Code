// input two no 1st is greater than second then cal sub otherwise add.

#include <stdio.h>
int main()
{
    int n1, n2, a;
    scanf("%d%d", &n1, &n2);
    if (n1 > n2)
    {
        a = n1 - n2;
    }
    if (n1 < n2)
    {
        a = n1 + n2;
    }
    printf("%d", a);
}