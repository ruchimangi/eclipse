package cashew;

public class four
{
  void meth1()
  {
	  four fobj=new four();
	  fobj.meth5();
	  int a=10;
	  System.out.println(10);
	  System.out.println(54+a);
	  
  }
  void meth2()
  {
	  int a=20;
	  System.out.println(78-a);
  }
  void meth3()
  {
	  int a=30;
	  four fobj=new four();
	  System.out.println(89+1);
	  fobj.meth1();
	  System.out.println(10);
  }
  void meth4()
  {
	  int a=10;
	  System.out.println(39);
	  System.out.println(85);
	  System.out.println(44);
  }
  void meth5()
  {
	  System.out.println(77);
	  four fobj=new four();
	  fobj.meth2();
	  System.out.println(99);
  }
  public static void main(String[] args)
  {
	 System.out.println("start");
	 four fobj=new four();
	 fobj.meth3();
	 System.out.println("end");
	 
	   
  }
}

