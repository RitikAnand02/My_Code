// input data in arrays and print prime no in them... using arrays..

#include <stdio.h>
int main()
{
    int size;
    printf("Enter array size ");
    scanf("%d", &size);
    int a[size], n, c, i, j;
    printf("Enter your no ");
    for (i = 0; i < size; i++)
        scanf("%d", &a[i]);
    for (j = 0; j < size; j++)
    {
        n = a[j];
        c = 0;
        for (i = 1; i <= n; i++)
        {
            if (n % i == 0)
                c++;
        }
        if (c == 2)
            printf("prime no - %d\n", a[j]);
    }

    return 0;
}