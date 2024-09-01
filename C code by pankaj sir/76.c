// Input a no check whether it is palidrome or not...

#include <stdio.h>
int pali(int);
int main()
{
    int n;
    printf("Enter a no ");
    scanf("%d", &n);
    pali(n);
    return 0;
}
int pali(int n)
{
    int m, r = 0, n1;
    n1 = n;
    while (n > 0)
    {
        m = n % 10;
        r = r * 10 + m;
        n = n / 10;
    }
    if (n1 == r)
    {
        printf("Palidrome");
    }
    else
    {
        printf("Not palidrome");
    }
}