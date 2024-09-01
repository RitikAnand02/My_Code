#include <stdio.h>
#include <conio.h>
void main()
{
    float a, b, c, avg;
    scanf("%f%f%f", &a, &b, &c);
    avg = (a + b + c) / 3;
    if (avg >= 75)
    {
        printf("distinction");
    }
    else if (avg >= 50)
    {
        printf("good");
    }
    else
    {
        printf("fail");
    }
    getch();
}
