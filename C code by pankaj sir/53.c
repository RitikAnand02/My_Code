// Input 10 strings and print only those strings which are start from a...

#include <stdio.h>
int main()
{
    char name[10][30];
    printf("Enter 10 names ");
    for (int i = 0; i < 10; i++)
    {
        scanf("%s", name[i]);
    }
    printf("*********************** Output *******************************\n\n");
    for (int i = 0; i <= 9; i++)
    {
        if (name[i][0] == 'a' || name[i][0] == 'A')
            printf("%s\n", name[i]);
    }
    return 0;
}