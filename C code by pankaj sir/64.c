// Function...

#include <stdio.h>
int main()
{
    int a, b, c;
    int sum(int, int);
    printf("Enter a , b no ");
    scanf("%d%d", &a, &b);
    c = sum(a, b);
    printf("Sum=%d", c);
    return 0;
}
int sum(int x, int y)
{
    int z;
    z = x + y;
    return (z);
}