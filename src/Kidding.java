import java.util.*;
public class Kidding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kid1,kid2,kid3;	
     Scanner s=new Scanner(System.in);
     kid1=s.nextInt();
     kid2=s.nextInt();
     kid3=s.nextInt();
     
     if(kid1+kid2+kid3==180)
     {
    	if(kid1==kid2&& kid2==kid3&& kid1==kid3)
    	{
    		System.out.println("prize 3");
    	}
    	else if(kid1==90|| kid2==90 || kid3==90)
    	{
    		System.out.println("prize 2");
    	}
    	else {
    		System.out.println("prize 1");
    	}
     }
    	else {
    		System.out.println("no prize");
    	}
     
     
	}

}
