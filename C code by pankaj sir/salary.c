#include <stdio.h>
#include <conio.h>
void main()
{
    float bs, ta, da, gs;
    scanf("%f", &bs);
    if (bs >= 10000)
    {
        ta = (bs * 10) / 100;
        da = (bs * 5) / 100;
        gs = bs + ta + da;
        printf("gross salary=%f", gs);
    }
    else if (bs >= 8000 && bs < 10000)
    {
        ta = (bs * 9) / 100;
        da = (bs * 4) / 100;
        gs = bs + ta + da;
        printf("gross salary=%f", gs);
    }
    else
    {
        ta = (bs * 8) / 100;
        da = (bs * 3) / 100;
        gs = bs + ta + da;
        printf("gross salary=%f", gs);
    }
    getch();
}