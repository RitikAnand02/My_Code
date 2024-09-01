// Input a string and convert it into uppercase letter...

#include <stdio.h>
int main()
{
    char name[30];
    int i;
    printf("Enter a string ");
    gets(name);
    for (i = 0; name[i] != '\0'; i++)
    {
        if (name[i] >= 'a' && name[i] <= 'z')
        {
            name[i] = name[i] - 32;
        }
    }
    printf("Uppercase=%s", name);
    return 0;
}