// input 10 data in arrays and print the sum of all data... using arrays..

#include <stdio.h>
int main()
{
    int a[10], i, s = 0;
    printf("Enter your no ");
    for (i = 0; i < 10; i++)
        scanf("%d", &a[i]);
    for (i = 0; i <= 9; i++)
        s = s + a[i];
    printf("sum of all data=%d\n", s);
    return 0;
}