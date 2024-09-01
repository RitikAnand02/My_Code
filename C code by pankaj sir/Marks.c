#include <stdio.h>
int main()
{
    float a, b, c, d;
    scanf("%f%f%f", &a, &b, &c);
    d = (a + b + c) / 3;
    if (d > 60)
    {
        printf("pass");
    }
    if (d <= 60)
    {
        printf("fail");
    }
}
