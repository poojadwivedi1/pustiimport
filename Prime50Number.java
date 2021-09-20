/* First 50 Prime Number*/

class Prime50Number
{
	public static void main(String [] args)
	{
	int x=1;
		for(int i=1;i<=550; i++)
		{
			int count=0;
			for(int n=2;n<=i/2;n++)
			{
				if(i%n==0)
				{
				count++;
				break;
				}
			
				
			}
			if(count==0 && i>2)
			{
				System.out.println(x +":"+i + " is prime number ");
				x++;
				if(x==51)
				break;
			}

		}
}
}
