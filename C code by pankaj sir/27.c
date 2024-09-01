// print all numbers from 1 to 100 which are not divisible by 3 and 7. using continue statement...

#include <stdio.h>
int main()
{
    int i;
    for (i = 1; i <= 100; i++)
    {
        if (i % 3 == 0 && i % 7 == 0)
        {
            continue;
        }
        printf("%d\n", i);
    }
}