#include<stdio.h>
#include<conio.h>
void main()
{
    int n=1234;
    printf("%d reverse is %d",n,n%10);
    n=n/10;
    printf("%d",n%10);
    n=n/10;
    printf("%d%d",n%10,n/10);
    getch();
}
