// input 10 data in array and print all in reverse ... using arrays...

#include <stdio.h>
int main()
{
    int a[10], i;
    printf("Enter your no ");
    for (i = 0; i < 10; i++)
        scanf("%d", &a[i]);
    for (i = 9; i >= 0; i--)
        printf("reverse=%d\n", a[i]);
    return 0;
}