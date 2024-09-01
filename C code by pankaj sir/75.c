// Input value for meter and convert it into centimeter and kilometer...

#include <stdio.h>
int convert(int);
int main()
{
    int m;
    printf("Enter meter ");
    scanf("%d", &m);
    convert(m);
    return 0;
}
int convert(int m)
{
    int km, cm;
    cm = m * 100;
    km = m / 1000;
    printf("centimeter=%d\nkilometer=%d", cm, km);
}