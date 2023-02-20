import java.util.Scanner;
class R
{
public static void main(String[] arg )
{
Scanner sc= new Scanner (System.in);
String items; int i ;
String[] per_item = new String[5];
int price[]=new int[5];
int qua[]=new int[5];
int exp[]=new int[5];

for(i=0; i<=2; i++)
{
System.out.print("enter  element" );
per_item[i] = sc.nextLine();
}
for(i=0; i<=2; i++)
{

System.out.print("price ");
price[i] = sc.nextInt();
}
for(i=0; i<=2; i++){


System.out.print("quantity of item");
qua[i] =sc.nextInt();
}

for(i=0; i<=2; i++)
{
System.out.print("exp date");
exp[i] =sc.nextInt();
}

for(i=0; i<=2; i++)
{
System.out.print("------------------------------------------------------------");
System.out.println("items are" + per_item[i]); 

System.out.println(" quality " + qua[i]);  
System.out.println("  price "+ price[i]); 
System.out.println(" expriry data " + exp[i]);
}
for(i=0; i<=2; i++)
{
if((exp[i]>=10)&&(exp[i]<=15))
{

System.out.print("sale early" );
}
else
{

System.out.print("store");
}
}

}
}
























