/*
1 2 3 4 5
2 3 4 5
3 4 5
4 5
5
*/

#include <stdio.h>
int main()
{
    int col, row;
    for (row = 1; row <= 5; row++)
    {
        for (col = row; col <= 5; col++)
        {
            printf("%d ", col);
        }
        printf("\n");
    }
}