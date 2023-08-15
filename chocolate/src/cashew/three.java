package cashew;

public class three
{
  void meth1()
  {
	  System.out.println("meth1() called");
	  int a=10;
	  int b=20;
	  System.out.println("a value= "+a);
	  System.out.println("b value= "+b);
	  System.out.println("addition= "+(a+b)); 
  }
  void meth2()
  {
	  System.out.println("java is good");
  }
  public static void main(String[] args)
  {
	  System.out.println("start");
	  three tobj=new three();
	  tobj.meth1();
	  System.out.println("end");
			  
  }
}
