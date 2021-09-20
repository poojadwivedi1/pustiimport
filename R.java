 class First50Palindrome
 {
	 public static void main(String [] args)
	 { 
		int count=0;
		  for(int i=101;true;i++)
		  {
		  int rev=0;
		  // q is quotient...q/10 will give next remainder...
			for(int q=i;q>0;q=q/10)
			{	
			
				rev=rev*10+(q%10);		
			
			}
			if(i==rev){
				System.out.println("Palindrome values are"+i);
				count++;
				if(count==50)
					break;
			}
		  }
	 }
 }

 