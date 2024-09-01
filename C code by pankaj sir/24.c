/* 
    1
   12
  123
 1234
12345
*/

#include <stdio.h>
int main()
{
    int nr;
    printf("Enter number of row : ");
    scanf("%d", &nr);

    for (int i = 1; i <= nr; i++)
    {
        for (int k = nr; k > i; k--)
        {
            printf(" ");
        }
        for (int j = 1; j <= i; j++)
        {
            printf("%d", j);
        }
        printf("\n");
    }
}