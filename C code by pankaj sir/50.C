// convert into title case...

#include <stdio.h>
int main()
{
    char name[30];
    int i;
    printf("Enter a string ");
    gets(name);
    if (name[0] >= 'a' && name[0] <= 'z')
    {
        name[0] = name[0] - 32;
    }

    for (i = 1; name[i] != '\0'; i++)
    {
        if (name[i] == ' ')
        {
            if (name[i + 1] >= 'a' && name[i + 1] <= 'z')
            {
                name[i + 1] = name[i + 1] - 32;
                i++;
            }
        }
        else if (name[i] >= 'A' && name[i] <= 'Z')
        {
            name[i] = name[i] + 32;
        }
    }

    printf("%s", name);
    return 0;
}