/*
ABCDE
ABCD
ABC
AB
A
*/

#include <stdio.h>

int main()
{
    char letter;
    int i, j;

    for (i = 5; i >= 1; i--)
    {
        letter = 'A';
        for (j = 1; j <= i; j++)
        {
            printf("%c", letter);
            letter++;
        }
        printf("\n");
    }

    return 0;
}
