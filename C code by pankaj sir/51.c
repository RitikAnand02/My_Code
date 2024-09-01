/*
ritik
riti 
rit  
ri   
r 
*/

#include <stdio.h>
int main()
{
    char name[30];
    int i, j, c = 0;
    printf("Enter a string ");
    gets(name);
    for (i = 0; name[i] != '\0'; i++)
        c++;
    for (i = c - 1; i >= 0; i--)
    {
        for (j = 0; j <= i; j++)
            printf("%c", name[j]);
        printf("\n");
    }

    return 0;
}