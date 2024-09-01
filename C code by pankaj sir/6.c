// input marks of three subjec print pass if every subject is greater than 50 otherwise fail...

#include <stdio.h>
int main()
{
    int a, b, c;
    printf("Enter no of 3 subs:");
    scanf("%d%d%d", &a, &b, &c);
    if (a > 50)
    {
        if (b > 50)
        {
            if (c > 50)
            {
                printf("Pass");
            }
            else
            {
                printf("fail");
            }
        }
        else
        {
            printf("fail");
        }
        
    }
    else
        {
            printf("fail");
        }
}