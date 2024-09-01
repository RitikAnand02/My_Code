// Input 10 names and print the name which have max length...

#include <stdio.h>
#include <string.h>
int main()
{
    char s[10][100];
    int i, m = 0, f;
    printf("Enter 10 string ");
    for (i = 0; i < 10; i++)
        gets(s[i]);
    m = strlen(s[0]);
    puts("Name have max length");
    puts("------------------------------------------------------");
    for (i = 1; i < 10; i++)
    {
        if (m < strlen(s[i]))
        {
            m = strlen(s[i]);
            f = i;
        }
    }
    printf("lenght=%d name=%s", m, s[f]);

    return 0;
}