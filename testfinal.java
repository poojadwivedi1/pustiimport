class testfinal
{
final public void m1()
{
System.out.println("final m1 running from parent");
}
final void m2()
{
System.out.println("final m2 running from parent");
}

final protected void m3()
{
System.out.println("final m3 running from parent");
}
final private void m4()
{
	System.out.println("final m4 running from parent");
}
public static void main(String [] args)
{
testfinal t=new testfinal();
//testfinal ts=new testfinal();
//testfinal tf=new testfinal();
t.m1();
t.m2();
t.m3();
}
}