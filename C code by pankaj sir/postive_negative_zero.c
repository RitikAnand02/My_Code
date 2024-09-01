#include <stdio.h>
int main()
{
    int a;
    printf("Enter a no:");
    scanf("%d", &a);
    if (a > 0)
    {
        printf("Postive");
    }
    else if (a < 0)
    {
        printf("negative");
    }
    else
        printf("zero");
}