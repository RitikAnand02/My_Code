// input data in arrays and find particular data... using arrays..

#include <stdio.h>
int main()
{
    int size;
    printf("Enter array size ");
    scanf("%d", &size);
    int a[size], n, f = 0, i;
    printf("Enter your no ");
    for (i = 0; i < size; i++)
        scanf("%d", &a[i]);
    printf("Enter no to search ");
    scanf("%d", &n);
    for (i = 0; i < size; i++)
    {
        if (a[i] == n)
            f++;
    }
    if (f > 0)
    {
        printf("found");
    }
    else
    {
        printf("not found");
    }
    return 0;
}