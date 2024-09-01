// Input data into 2 matrix and calculate addition of matrix and subtraction of matrix...

#include <stdio.h>
void main()
{
    int a[10][10], b[10][10], add[10][10], sub[10][10], nr, nc, r, c;
    printf("Enter no of rows and columns ");
    scanf("%d %d", &nr, &nc);

    if (nr == nc)

    {
        printf("Enter %d integers\n", nr * nc);
        printf("Enter 1 array elements ");
        for (r = 0; r < nr; r++)
        {
            for (c = 0; c < nc; c++)
            {
                scanf("%d", &a[r][c]);
            }
        }

        printf("Enter 2 array elements ");
        for (r = 0; r < nr; r++)
            for (c = 0; c < nc; c++)
            {
                scanf("%d", &b[r][c]);
            }
        for (r = 0; r < nr; r++)
        {
            for (c = 0; c < nc; c++)
            {
                add[r][c] = a[r][c] + b[r][c];
                sub[r][c] = a[r][c] - b[r][c];
            }
        }
        printf("Additon of matrix\n");
        for (r = 0; r < nr; r++)
        {
            for (c = 0; c < nc; c++)
            {
                printf("%d ", add[r][c]);
            }
            printf("%c", 10);
        }
        printf("Subtraction of matrix\n");
        for (r = 0; r < nr; r++)
        {
            for (c = 0; c < nc; c++)
            {
                printf("%d ", sub[r][c]);
            }
            printf("%c", 10);
        }
    }
    else
        printf("Rows and columns should be same");
}