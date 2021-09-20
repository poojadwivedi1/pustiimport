/* Number is strong number or not?*/

class StrongNumber
{
public static void main(String [] args)
{
int num=145;
int fact=1;
int sum=0;
while(num!=0)
{
	fact=num%10;
	sum +=fact;
	num/=10;
	if(sum==num)
	{
		System.out.println(num + "is strong");
	}
	else
	{
		System.out.println(num + "is not strong");
	}
}

}
}
