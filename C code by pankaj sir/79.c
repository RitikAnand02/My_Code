// Input radius and height and calculate volume of cylinder...

#include <stdio.h>
float vol(float, float);
int main()
{
    float r, h, v;
    printf("Enter radius and height ");
    scanf("%f%f", &r, &h);
    v = vol(r, h);
    printf("Volume of cylinder=%.2f", v);
    return 0;
}
float vol(float r, float h)
{
    float v;
    v = 3.14 * r * r * h;
    return (v);
}