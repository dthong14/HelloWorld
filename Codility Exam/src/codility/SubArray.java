package codility;

public class SubArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 	int a[] = {  -2, -3,-1 , 10000}; 
        int nLen = a.length; 
        maxSubArraySum(a,  nLen); 

	}
	
	
	 static void maxSubArraySum(int a[], int size) 
	    { 
	        int max_so_far = Integer.MIN_VALUE, 
	        max_ending_here = 0,start = 0, 
	        end = 0, s = 0; 
	  
	        for (int i = 0; i < size; i++)  
	        { 
	            max_ending_here += a[i]; 
	            System.out.println("1max_ending_here: "+max_ending_here);
	            if (max_so_far < max_ending_here)  
	            { 
	                max_so_far = max_ending_here; 
	                System.out.println("max_so_far: " + max_so_far);;
	                start = s; 
	                end = i; 
	            } 
	         
	            if (max_ending_here < 0)  
	            { 
	                max_ending_here = 0; 
	                s = i + 1; 
	            } 
	            System.out.println("max_ending_here: "+max_ending_here);
	            System.out.println("max_so_far: "+max_so_far+ "\n");
	        } 
	        System.out.println("Maximum contiguous sum is " 
	                           + max_so_far); 
	        
	        System.out.println("Starting index " + start); 
	        System.out.println("Ending index " + end); 
	    } 

}
