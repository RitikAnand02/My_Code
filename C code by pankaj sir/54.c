// Input 10 name and find a particular name...

#include <stdio.h>
#include <string.h>
int main()
{
    char s1[10][100], s2[100];
    int i;
    printf("Enter 10 string ");
    for (i = 0; i < 10; i++)
        gets(s1[i]);
    printf("Enter search string ");
    gets(s2);
    puts("Names");
    puts("------------------------------------------------------");
    for (i = 0; i < 10; i++)
    {
        if (strstr(s1[i], s2) != 0)
            puts(s1[i]);
    }
    printf("Not found");

    return 0;
}