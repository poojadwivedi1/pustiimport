
class RecursionArmstrong 
	{
		int count=0;
		int prod=1;
		int sum=0;
		public static void main(String [] args)
		{  
			RecursionArmstrong as=new RecursionArmstrong();
			System.out.println(as.checkarmstrong(153));
		}
	 public boolean checkarmstrong(int num)
		{
			int x=countdigit(num);
			int sum=sumofpower(num,x);
			return sum=num;
		}
		public sumofPower (int num,int count)
		{
			if(num!=0)
			{
				int rem=num%10;
				RecursionArmstrong as=new RecursionArmstrong();
				int p=as.product (rem,count);
				sum=sum+p;
				num=num/10;
		        sumofpower(num,count);
			}
		}
		
				
				return sum;
				
		
			public int countdigit(int num)
			{
				if(num!=0)
				{
					num=num/10;
					count++;
					countdigit(num);
					
				}
				return count++;
			}
			 public int product(int rem ,int count)
			{
				if(count>=1)
				{
					prod=prod * rem;
					count--;
					product(rem,count);
				}
				return prod;
			}
	}
			
			
			
		
	
  