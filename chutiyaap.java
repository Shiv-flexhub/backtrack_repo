import java.util.*;
class jv
{
public static void main(String[] args)
{
Scanner sc=new Scanner (System.in);
int t,i,nop,noq,b=-1,t1,q,m,k,n,j,a,d,c,e;
t=sc.nextInt();
int marks[]=new int[t];
int total[]=new int[2*t];
for(i=0;i<t;i++)
{ a=d=c=e=-1;
  nop=sc.nextInt();
  noq=sc.nextInt();
  int binary[]=new int[2*noq];
  for(j=0;j<noq;j++)
  { marks[++c]=sc.nextInt();
  }
  for(n=0;n<nop;n++)
  {
    for(k=0;k<noq;k++)
    {
      binary[++a]=sc.nextInt();
    }
  }
   for(m=0;m<nop;m++)
   { t1=0;
    for(q=0;q<noq;q++)
     { if(binary[++d]==1)
        {
          t1=t1+marks[q];
          total[++e]=t1;
         }
      }
     }
 }
for(i=0;i<2*t;i++)
{ 
   System.out.println(total[i]);

}
}
}





