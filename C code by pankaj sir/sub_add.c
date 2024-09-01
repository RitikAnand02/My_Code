//input two no if 1st is greater than second then calculate subtraction otherwise addition...

#include<stdio.h>
int main()
{
    int n1,n2,a;
    printf("Enter 2 no:");
    scanf("%d%d",&n1,&n2);
    if(n1>n2)
    {
        a=n1-n2;
    }
    else{
        a=n1+n2;
    }
    printf("%d",a);

}
