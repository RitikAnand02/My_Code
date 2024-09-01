// Loop control statement using for().....

// 2,4,6,......,n

#include <stdio.h>

int main()
{
    int a, n;
    printf("Enter a no ");
    scanf("%d", &n);
    for (a = 2; a <= n; a += 2)
    {
        printf("%d\n", a);
    }
    return 0;
}