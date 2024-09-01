// Input string name and print like diagonal...

#include <stdio.h>
int main()
{
    char name[30];
    int i, j;
    printf("Enter your name ");
    gets(name);
    for (i = 0; name[i] != '\0'; i++)
    {
        for (j = 0; j <= i; j++)
            printf("   ");
        printf("%3c\n", name[i]);
    }

    return 0;
}