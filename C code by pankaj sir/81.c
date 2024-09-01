// Recursion... 1,2,3...n...

#include <stdio.h>
int series(int);
int i = 1;
int main()
{
    int n;
    printf("Enter a no ");
    scanf("%d", &n);
    series(n);
    return 0;
}
int series(int n)
{
    if (i <= n)
    {
        printf("%d ", i);
        i++;
        series(n);
    }
}