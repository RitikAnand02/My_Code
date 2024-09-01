// using pointers input 10 number and caluclate sum of even numbers...

#include <stdio.h>
int main()
{
    int a[10], *p, i, s = 0;
    p = a;
    printf("Enter 10 no ");
    for (i = 0; i < 10; i++)
        scanf("%d", (p + i));
    for (i = 0; i < 10; i++)
    {
        if (*(p + i) % 2 == 0)
            s = s + *(p + i);
    }
    printf("sum of even no =%d", s);
    return 0;
}