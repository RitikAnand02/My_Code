// input a string and count its no of word...

#include <stdio.h>
int main()
{
    int i, tw = 1;
    char str[30];
    printf("Enter a sentence ");
    gets(str);
    for (i = 0; str[i] != '\0'; i++)
    {
        if ((str[i] == ' '))
        {
            tw++;
        }
    }
    printf("total word=%d", tw);
    return 0;
}