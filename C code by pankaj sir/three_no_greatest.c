//input three no and calculate greatest..

#include <stdio.h>
int main()
{
    int n1, n2, n3;
    printf("Enter 3 no:");
    scanf("%d%d%d", &n1, &n2, &n3);
    if ((n1 > n2) && (n1 > n3))
    {
        printf("N1 is greatest");
    }
    else if((n2 > n3) && (n2 > n1))
       
        {
             printf("N2 is greatest");
        }
           
    else printf("N3 is greatest");
}