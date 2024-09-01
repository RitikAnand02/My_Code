// Input data into 4 by 4 matrix and print sum f the both diagonal respectively...

#include <stdio.h>
int main()
{
    int a[4][4], i, j, s1 = 0, s2 = 0;
    for (i = 0; i < 4; i++)
    {
        for (j = 0; j < 4; j++)
            scanf("%d", &a[i][j]);
    }
    for (i = 0; i < 4; i++)
    {
        for (j = 0; j < 4; j++)
        {
            if (i == j)
                s1 += a[i][j];
            if ((i + j) == 3)
                s2 += a[i][j];
        }
    }
    printf("%d %d", s1, s2);
}
