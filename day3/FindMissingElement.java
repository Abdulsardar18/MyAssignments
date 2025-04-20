package week1.day3;

import java.util.Arrays;
public class FindMissingElement {

	public static void main(String[] args) {
		int a[]= {1,4,3,2,8,6,7};
	       
	       Arrays.sort(a);
	       System.out.println(Arrays.toString(a));
	       //[1, 2, 3, 4, 6, 7, 8]
	       for(int i=0;i<a.length;i++)
	       {
	    	   
	    	   if(a[i]+1!=a[i+1])
	    	   {
	    		   System.out.println("The missing number is :"+(a[i]+1));
	    		   break;
	    		   /*
	    		   i=0; 1==2
	    		  i=1, 2==3
	    		  i=2, 3==4
	    		  i=3 4==5
	    		  i=4,6==7
	    		  i=5; 7==8
	    		  i=6,8==9
	    		  */
	    	   }
		}

		
		
	}
	}


