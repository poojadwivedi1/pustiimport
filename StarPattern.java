/*:\D-drive\pooja_java>java StarPattern
   *
  *  *
 *    *
  *  * 
   *       */

class StarPattern
{
public static void main(String [] args)
{
int row=5;
//int count=5;
for(int i=1;i<=row;i++)
{
for(int j=1;j<=((2*row)-1);j++)
{
	if((j>=(row(-(i-j)) && (j<=(row +(i-j))))))
	{
	
		
System.out.print("*");
} 
else
{
	System.out.print(" ");
}
System.out.println();

}
}
}
}