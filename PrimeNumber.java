/* Number is prime or not*/
class PrimeNumber
{
public static void main(String [] args)
	{
	int number=1;
	boolean flag=false;
	for(int i=2;i<=number/2; i++)
		{
		if(number%i==0)
			{
			flag=true;
			break;
			}
		}
	if(flag==false && number !=1)
	{
		System.out.println(number +"is a Prime number");
	}
	else
	{
	System.out.println(number +"is not a Prime number");
	}
	}
}
