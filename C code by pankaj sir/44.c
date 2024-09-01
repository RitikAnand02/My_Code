// input strings and count its length...

#include <stdio.h>
int main()
{
    int i, c = 0;
    char name[30];
    printf("Enter a sentence ");
    gets(name);
    for (i = 0; name[i] != '\0'; i++)
    {
        c++;
    }
    printf("count length=%d", c);
    return 0;
}