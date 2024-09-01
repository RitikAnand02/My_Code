// Input 10 name and suffix or prefix mr...

#include <stdio.h>
#include <string.h>
int main()
{
    char s1[10][100], s2[100];
    int i;
    printf("Enter 10 string ");
    for (i = 0; i < 10; i++)
        gets(s1[i]);
    puts("Name");
    puts("------------------------------------------------------");
    for (i = 0; i < 10; i++)
    {
        strcpy(s2, "Mr.");
        strcat(s2, s1[i]);
        strcpy(s1[i], s2);
    }
    for (i = 0; i < 10; i++)
    {
        printf("%s\n", s1[i]);
    }

    return 0;
}