// input a string and count no of character alphabets,vowels,consonant,digit,space and special character...

#include <stdio.h>
int main()
{
    char name[30];
    int i, c = 0, a = 0, v = 0, cs = 0, d = 0, sp = 0, spl = 0;
    printf("Enter a sentence ");
    gets(name);
    for (i = 0; name[i] != '\0'; i++)
    {
        c++;
        if (name[i] >= 'a' && name[i] <= 'z')
        {
            a++;

            if (name[i] == 'a' || name[i] == 'e' || name[i] == 'i' || name[i] == 'o' || name[i] == 'u')
            {
                v++;
            }
            else
                cs++;
        }
        else if (name[i] >= '0' && name[i] <= '9')
            d++;
        else if (name[i] == ' ')
            sp++;
        else
            spl++;
    }
    printf("charcter=%d, alphabet=%d, vowel=%d, consonant=%d, digit=%d, space=%d, special character=%d", c, a, v, cs, d, sp, spl);
    return 0;
}