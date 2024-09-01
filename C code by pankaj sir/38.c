// input data in 4 by 4 and calculate the sum of third row only...

#include <stdio.h>
int main()
{
    int a[4][4], i, j, s = 0;
    for (i = 0; i < 4; i++)
    {
        for (j = 0; j < 4; j++)
        {
            scanf("%d", &a[i][j]);
        }
    }

    for (j = 0; j < 4; j++)
    {

        s = s + a[2][j];
    }
    printf("sum=%d", s);

    return 0;
}