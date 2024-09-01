// Input 10 no and  print maximum...

#include <stdio.h>
int main()
{
    int a[10], *p, i, m;
    p = a;
    printf("Enter 10 no ");
    for (i = 0; i < 10; i++)
        scanf("%d", (p + i));
    m = *p;
    for (i = 1; i < 10; i++)
    {
        if (m < *(p + i))
            m = *(p + i);
    }
    printf("maximum=%d", m);
    return 0;
}