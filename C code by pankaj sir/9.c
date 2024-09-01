// Loop control statement using for().....

// n,n-1,....3,2,1

#include <stdio.h>

int main()
{
    int a, n;
    printf("Enter a no ");
    scanf("%d", &n);
    for (a = n; a >= 1; a--)
    {
        printf("%d\n", a);
    }
    return 0;
}