// n,n-1,....,1...

#include <stdio.h>
int series(int);
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
    if (n >= 1)
    {
        printf("%d ", n);
        n--;
        series(n);
    }
}