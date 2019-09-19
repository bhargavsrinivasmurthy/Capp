package bs;

public class Java2 {


 public static void main(String[] args) {
	 // TODO Auto-generated method stub
	 
	 int x,y,i;
	 x=10;y=20;
	 
	 if(x>y)
		 System.out.println("x>y");
	 else 
		 System.out.println("x<y");
	 System.out.println(" for loop ");
	 for(i=0;i<x;i++)
		 System.out.println(" "+i);
	 i=0;
	 System.out.println("while loop");
	 while(i<x) {
		 System.out.println(" "+i );
		 i++;
	    }
	i=0;
	System.out.println("do while ");
	do
	{
		 System.out.println(" "+i);
		 i++;
	}
	while(i<x);
	{
		System.out.println(" "+i);
		i++;
	}while(i<x);
	System.out.println("switch case");
	switch(x)
	{
	case 10:System.out.println(" 10 ");break;
	
	}
	
	try
	{
		System.out.println(" inside try");
		x=1/0;
		
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
  }	
 
}

