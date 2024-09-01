// input 10 data in array and count negative data only.. using arrays..

#include <stdio.h>
int main()
{
    int a[10], i, c = 0;
    printf("Enter your no ");
    for (i = 0; i < 10; i++)
        scanf("%d", &a[i]);
    for (i = 0; i <= 9; i++)
    {
        if (a[i] < 0)
            c++;
    }
    printf("count negative=%d", c);
    return 0;
}