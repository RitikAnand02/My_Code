// store and print it...

#include <stdio.h>
int main()
{
    int a[3][3], i, j;
    for (i = 0; i < 3; i++)
    {
        for (j = 0; j < 3; j++)
        {
            if (i == 1 || j == 1)
                a[i][j] = 1;
            else
                a[i][j] = 0;
        }
    }
    for (i = 0; i < 3; i++)
    {
        for (j = 0; j < 3; j++)
            printf("%d ", a[i][j]);
        printf("\n");
    }
    return 0;
}