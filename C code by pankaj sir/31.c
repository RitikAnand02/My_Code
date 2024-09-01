// input  data in array and calculate average of even no.. using arrays..

#include <stdio.h>
#include <math.h>
int main()
{
    int size;
    printf("Enter array size : ");
    scanf("%d", &size);
    float a[size], c = 0, s = 0;
    printf("Enter your no ");
    for (int i = 0; i < size; i++)
    {
        scanf("%f", &a[i]);
    }
    for (int i = 0; i < size; i++)
    {

        if ((int)(fmod(a[i], 2)) == 0)
        {
            c++;
            s = s + a[i];
        }
    }
    printf("Average of even no =%.2f", s / c);
    return 0;
}