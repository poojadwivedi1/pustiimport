/* Number is strong number or not?*/

class StrongNumberRecursion
{
	public static void main(String [] args)
	{
	int num=145;
	int sum=0;
	StrongNumberRecursion st=new StrongNumberRecursion();
	sum=st.strong(num,0);

		if(sum==num)
		{
			System.out.println(num + " is strong");
		}
		else
		{
			System.out.println(num + " is not strong");
		}

	}
	public int strong(int num, int sum)
	{
		
		if (num!=0)
		{
		int fact=num%10;
		sum +=fact;
		num/=10;
		return strong(num/=10,sum);
		}
		return 0;
		
	}
}

