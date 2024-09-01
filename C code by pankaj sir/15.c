// input a number and calculate sum of 1st and last digits... using while loop...

#include <stdio.h>
int main()
{
    int n, n1;
    printf("Enter a no ");
    scanf("%d", &n);
    n1 = n % 10;
    while (n > 9)
    {

        n = n / 10;
    }
    printf("%d", n1 + n);
}