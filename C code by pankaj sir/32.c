// input  data in arrays and calculate maximum.. using arrays..

#include <stdio.h>
int main()
{
    int size;
    printf("Enter array size ");
    scanf("%d", &size);
    float a[size], m;
    printf("Enter your no ");
    for (int i = 0; i < size; i++)
    {
        scanf("%f", &a[i]);
    }
    m = a[0];
    for (int i = 1; i < size; i++)
    {
        if (m < a[i])
            m = a[i];
    }
    printf("maximun=%.2f", m);

    return 0;
}