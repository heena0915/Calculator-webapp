package calculator;


public class BasicCalc
{
	double a;
	double b;
	double c;
	
	
	public double geta() {  
	    return a;  
	}  
	  
	public void seta(double a) {  
	    this.a = a;  
	}  
	  
	public double getb() {  
	    return b;  
	}  
	  
	public void setb(double b) {  
	    this.b = b;  
	}  
	double add()
	{
		c=a+b;
		return(c);
	}
	
	double subtract()
	{
		c=a-b;
		return(c);
	}
	
    double multiply()
	{
	c=a*b;
	return(c);
	}
	
	double divide()
	{
		c=a/b;
		return(c);
	}
	
}