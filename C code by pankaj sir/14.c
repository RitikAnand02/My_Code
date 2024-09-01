// 1,2,3...n,n-1,n-2...3,2,1... using for loop...

#include <stdio.h>
int main()
{
    int n, i;
    printf("Enter a no ");
    scanf("%d", &n);
    for (i = 1; i <= n; i++)
        printf("%d", i);
    for (i = n - 1; i >= 1; i--)
        printf("%d ", i);
}