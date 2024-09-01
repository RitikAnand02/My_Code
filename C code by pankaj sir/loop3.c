// n,n-1,...,3,2,1

#include <stdio.h>
void main()
{
    int i,n;
    scanf("%d",&n);
    for (i = n; i >= 1; i--)
    {
        printf("%d", i);
    }
}
