// input no and store all even into another array and print them...

#include <stdio.h>
int main()
{
    int size;
    printf("Enter array size ");
    scanf("%d", &size);
    int a[size], n, i, j = 0;
    printf("Enter your no ");
    for (i = 0; i < size; i++)
        scanf("%d", &a[i]);
    int b[100];
    for (i = 0; i < size; i++)
    {
        if (a[i] % 2 == 0)
        {
            b[j] = a[i];
            j++;
        }
    }
    for (i = 0; i < j; i++)
        printf("even =%d\n", b[i]);
}

// method -2

#include <stdio.h>
int main()
{

    int size1;
    printf("Enter array size ");
    scanf("%d", &size1);
    int a[size1], ec = 0;

    printf("Enter your no ");
    for (int i = 0; i < size1; i++)
    {
        scanf("%d", &a[i]);
        if (a[i] % 2 == 0)
        {
            ec++;
        }
    }

    int eArr[ec], j = 0;

    for (int i = 0; i < size1; i++)
    {
        if (a[i] % 2 == 0)
        {
            eArr[j] = a[i];
            printf("even =%d ", eArr[j]);
            j++;
        }
    }
}