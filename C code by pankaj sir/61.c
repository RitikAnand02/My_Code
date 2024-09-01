// write a program for the following array...

#include <stdio.h>
int main()
{
    int *p[4], a[1], b[2], c[3], d[4];
    p[0] = a;
    p[1] = b;
    p[2] = c;
    p[3] = d;
    printf("Enter a no ");
    for (int i = 0; i < 4; i++)
    {
        for (int j = 0; j <= i; j++)
        {
            scanf("%d", &p[i][j]);
        }
    }
    for (int i = 0; i < 4; i++)
    {
        for (int j = 0; j <= i; j++)
        {
            printf("%3d", p[i][j]);
        }
        printf("\n");
    }

    return 0;
}