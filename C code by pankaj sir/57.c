// Pointers...
// sum of two no using pointers....

#include <stdio.h>
int main()
{
    int a, b, s, *p, *q;
    printf("Enter any two no ");
    scanf("%d%d", &a, &b);
    p = &a;
    q = &b;
    s = *p + *q;
    printf("sum=%d+%d=%d", *p, *q, s);

    return 0;
}