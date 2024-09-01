// Calculate sum of all no from 1 to 100 which are divisible by 7 and 3...

#include <stdio.h>
int sum();
int main()
{
    int s;
    s = sum();
    printf("Sum=%d", s);
    return 0;
}
int sum()
{
    int i, s = 0;
    for (i = 1; i <= 100; i++)
    {
        if (i % 3 == 0 && i % 7 == 0)
            s += i;
    }
    return (s);
}