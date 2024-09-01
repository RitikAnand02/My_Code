#include <stdio.h>
int main()
{
    int a;
    printf("Enter no: ");
    scanf("%d", &a);
    if (a % 2 == 0)
    {
        printf("even");
    }

    if (a % 2 != 0)

    {
        printf("odd");
    }
    return 0;
}