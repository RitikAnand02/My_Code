// Input h and b , calculate area if triangle....

#include <stdio.h>
float Area(float, float);
int main()
{
    float b, h, a;
    printf("Enter base and height ");
    scanf("%f%f", &b, &h);
    a = Area(b, h);
    printf("Area of triangle=%.2f", a);
    return 0;
}
float Area(float b, float h)
{
    float a;
    a = (b * h) / 2;
    return (a);
}