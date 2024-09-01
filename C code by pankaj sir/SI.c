#include<stdio.h>
int main()
{
    float P,T,R,Q;
    printf("principal:");
    scanf("%f",&P);
    printf("time:");
    scanf("%f",&T);
    printf("rate:");
    scanf("%f",&R);
    Q=(P*R*T)/100;
    printf("%f",Q);
}