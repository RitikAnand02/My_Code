// input no in one array and another array and calculate sum of both into 3rd array...

#include <stdio.h>
int main()
{
    int size1, size2;
    printf("Enter array size1 "); 
    scanf("%d", &size1);
    int a[size1];
    for (int i = 0; i < size1; i++)
        scanf("%d", &a[i]);
    printf("Enter array size2 ");
    scanf("%d", &size2);

    int b[size2];
    for (int i = 0; i < size2; i++)
        scanf("%d", &b[i]);
    int size3 = size1 < size2 ? size2 : size1;
    int c[size3];
    for (int i = 0; i < (size1 < size2 ? size1 : size2); i++)
        c[i] = a[i] + b[i];
    for (int i = 0; i < size3; i++)
        printf("sum=%d\n ", c[i]);
}