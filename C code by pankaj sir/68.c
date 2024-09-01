// Input three no and calculate greatest...

#include <stdio.h>
int greatest(int, int, int);
int main()
{
    int a, b, c, g;
    printf("Enter 3 no ");
    scanf("%d%d%d", &a, &b, &c);
    g = greatest(a, b, c);
    printf("Greatest=%d", g);
    return 0;
}
int greatest(int a, int b, int c)
{
    if (a > b && a > c)
        return (a);
    else if (b > a && b > c)
        return (b);
    else
        return (c);
}