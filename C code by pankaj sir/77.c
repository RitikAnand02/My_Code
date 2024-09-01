/*
1
12
123
1234
12345
*/

#include <stdio.h>
int triangle(int);
int main()
{
    int n;
    printf("Enter a no ");
    scanf("%d", &n);
    triangle(n);
    return 0;
}
int triangle(int n)
{
    int i, j;
    for (i = 1; i <= n; i++)
    {
        for (j = 1; j <= i; j++)
        {
            printf("%d", j);
        }
        printf("\n");
    }
}