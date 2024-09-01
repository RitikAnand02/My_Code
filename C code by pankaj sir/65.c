// Input radius and calculate area of circle...

#include <stdio.h>
float Area(float);
int main()
{
    float r, a;
    printf("Enter radius ");
    scanf("%f", &r);
    a = Area(r);
    printf("Area of circle=%.2f", a);
    return 0;
}
float Area(float r)
{
    float a;
    a = 3.14f * r * r;
    return (a);
}