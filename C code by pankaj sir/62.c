// using pointer input to 2 no and calculate sum.... using double pointer..

#include <stdio.h>
int main()
{
    int a, b, *p, *q, **p1, **q1;
    p = &a;
    q = &b;
    p1 = &p;
    q1 = &q;
    scanf("%d%d", *p1, *q1);
    printf("%d", **p1 + **q1);
    return 0;
}