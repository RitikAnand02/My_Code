// Input some data calculate average. input some more data in it again calculate total average . print the difference
// between both average...

#include <stdio.h>
#include <stdlib.h>
int main()
{
    int *p, n1, n2, i, s1 = 0, s2 = 0;
    float avg1, avg2;
    printf("Enter no of data ");
    scanf("%d", &n1);
    p = (int *)malloc(n1 * sizeof(int));
    for (i = 0; i < n1; i++)
        scanf("%d", &p[i]);
    for (i = 0; i < n1; i++)
    {
        s1 += p[i];
    }
    avg1 = (float)s1 / n1;

    printf("Enter no of data to extend ");
    scanf("%d", &n2);
    p = (int *)realloc(p, (n1 + n2) * sizeof(int));
    for (i = n1; i < (n1 + n2); i++)
        scanf("%d", &p[i]);
    for (i = n1; i < (n1 + n2); i++)
    {
        s2 = s2 + p[i];
    }

    avg2 = ((float)(s1 + s2)) / (n1 + n2);
    printf("Final average=%.2f", (avg2 - avg1));
    free(p);

    return 0;
}