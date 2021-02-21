#include<stdio.h>
int main()
{
    int i,j,k,l,a,num,ar[6][6],S,H[16],c=0,g;
    for(i=0;i<6;i++)
    {
        for(j=0;j<6;j++)
        {
            scanf("%d",&num);
            ar[i][j]=num;
        }
    }
    for(k=0;k<4;k++)
    {
        for(l=0;l<4;l++)
        {

         S=ar[k][l]+ar[k][l+1]+ar[k][l+2]+ar[k+1][l+1]+ar[k+2][l]+ar[k+2][l+1]+
           ar[k+2][l+2];
         H[c]=S;
         c++;
         
        }
        

    }

          for (g=0;g<16;g++)
       {

           if(H[0]<H[g])
           {
               H[0]=H[g];
           }
       }
           printf("%d",H[0]);

           return 0;
}
