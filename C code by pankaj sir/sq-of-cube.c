#include <stdio.h>
int main()
{
    float a, b, c;
    scanf("%f", &a);
    b = a * a * a;
    printf("cube of no =%f", b);
    c = b * a * a * a;
    printf("square of cube =%f", c);
    return 0;
}