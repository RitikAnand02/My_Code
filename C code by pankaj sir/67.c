// Input principal amount t , r and calculate s.i....

#include <stdio.h>
float SI(float, float, float);
int main()
{
    float p, t, r, s;
    printf("Enter principal amount, time and rate ");
    scanf("%f%f%f", &p, &t, &r);
    s = SI(p, t, r);
    printf("Simple interest=%.2f", s);
    return 0;
}
float SI(float p, float t, float r)
{
    float s;
    s = (p * t * r) / 100;
    return (s);
}