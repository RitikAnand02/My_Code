// Write program for addition and multiplication of matrices using pointers...

#include <stdio.h>
int main()
{
    int a[2][2], b[2][2], c[2][2];
    int(*p)[2], (*q)[2], (*r)[2];
    int i, j;
    p = a;
    q = b;
    r = c;
    printf("Enter 10 no ");
    for (i = 0; i < 2; i++)
    {
        for (j = 0; j < 2; j++)
            scanf("%d", *(p + i) + j);
    }
    for (i = 0; i < 2; i++)
    {
        for (j = 0; j < 2; j++)
            scanf("%d", *(q + i) + j);
    }
    for (i = 0; i < 2; i++)
    {
        for (j = 0; j < 2; j++)
        {
            *(*(r + i) + j) = *(*(p + i) + j) + *(*(q + i) + j);
        }
    }
    for (i = 0; i < 2; i++)
    {
        for (j = 0; j < 2; j++)
            printf("%3d", (*(*(r + i) + j)));
        printf("\n");
    }
    return 0;
}