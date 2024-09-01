// Print all prime no from 1 to 100....

#include <stdio.h>
void prime();
int main()
{
    prime();
    return 0;
}
void prime()
{

    printf("My prime numbers are : ");
    for (int i = 2; i <= 100; i++)
    {
        int flag = 1;
        for (int j = 2; j <= i / 2; j++)
        {
            if (i % j == 0)
            {
                flag = 0;
                break;
            }
        }
        if (flag)
        {
            printf("%d ", i);
        }
    }
}