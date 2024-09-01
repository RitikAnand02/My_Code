#include <stdio.h>
int main()
{
    float h, b, A;
    printf("Enter height and base:");
    scanf("%f%f", &h, &b);
    if (h > b)
        A = b * h / 2;
    else
        A = b * h;
    printf("%.2f", A);
}