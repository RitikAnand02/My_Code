// Loop control statement using for().....

// 1^2,2^2,......n^2

#include <stdio.h>

int main()
{
    int n ,i;
    printf("Enter a no ");
    scanf("%d", &n);
    for (i = 1; i <= n; i++)
    {
        printf("%d\n", i*i);
    }
    return 0;
}