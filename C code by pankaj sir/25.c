/*
 A        
 A B      
 A B C    
 A B C D  
 A B C D E
*/

#include <stdio.h>
int main()
{
    int nr;
    printf("Enter number of row : ");
    scanf("%d", &nr);

    for (int i = 1; i <= nr; i++)
    {

        for (int j = 1; j <= i; j++)
        {
            printf("%2c", j + 64);
        }
        printf("\n");
    }
}