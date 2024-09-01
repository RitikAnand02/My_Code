// input marks of three subjects of a student. calculate average and print result. accrording to following:

#include <stdio.h>
int main()
{
    float a, b, c, Avg;
    printf("Enter marks of 3 sub:");
    scanf("%f%f%f", &a, &b, &c);
    Avg = (a + b + c) / 3;
    if (Avg >= 75)
    {
        printf("Distincttion");
    }
    else if (Avg >= 50)
    {
        printf("good");
    }
    else
        printf("fail");
}