package codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;


public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A = {2,1,3,5,4};
		int[] B = {1,4,-1,3,2};
		
		Test1 t = new Test1();
//		int x = t.frog(B);
//		t.printWithoutLoop(0);
//		System.out.println("ans : "+x);		
		
//		int[] a = {0,2,3,4,10,40,44};
//		int bs = t.binarySearch(a, 0, 6, 11);
//		System.out.println("bs: "+bs);
		
		 int s[] =  {10, 12, 20}; 
		 int f[] =  {20, 25, 30}; 
		 int n = s.length; 
		         
//		    printMaxActivities(s, f, n); 
		    
		    
		    Set<Integer> a = new HashSet<Integer>(); 
		    
	        a.addAll(Arrays.asList(new Integer[] {1, 3, 2, 4,5})); 
	        for(Integer  sd: a){
	        	System.out.println("sd: "+sd);
	        }
	      
	        ArrayList<String> 
            arrlist = new ArrayList<String>(); 

        // adding element to arrlist 
        arrlist.add("A"); 
        arrlist.add("B"); 
        arrlist.add("C"); 
        arrlist.add("D"); 
        ListIterator<String> et =  arrlist.listIterator();
        
	        
	        Iterator<Integer> it = a.iterator();
	        while (it.hasNext()){
	        	System.out.println("it: "+it.next());
	        }
	        
	      
//	        Set<Integer> b = new HashSet<Integer>(); 
//	        b.addAll(Arrays.asList(new Integer[] {6,5,8,7})); 
//	        
//	        Set<Integer> union = new HashSet<Integer>(b); 
//	        union.addAll(a); 
//	        System.out.print("Union of the two Set"); 
//	        System.out.println(union); 
//	        
//	        
//	        // To find intersection 
//	        Set<Integer> intersection = new HashSet<Integer>(a);
//	        intersection.retainAll(b);
//	        System.out.print("Intersection of the two Set"); 
//	        System.out.println(intersection); 
//	        
//	     // To find the symmetric difference 
//	        Set<Integer> difference = new HashSet<Integer>(b); 
//	        difference.removeAll(a);
//	        System.out.print("Difference of the two Set"); 
//	        System.out.println(difference); 


	        
	        
	        ArrayList<String> al = new ArrayList<String>(); 
	        al.add("Geeks For Geeks"); 
	        al.add("Friends"); 
	        al.add("Dear"); 
	        al.add("Is"); 
	        al.add("Superb"); 
	        Collections.sort(al);
	        Collections.sort(al, Collections.reverseOrder());
	        
	        Integer [] arr = {45,12,85,32,89,39,69,44,42,1,6,8};
	        Arrays.sort(arr);
	        Arrays.sort(arr, Collections.reverseOrder());
	   	 System.out.println("arr: ");
	        for(Integer i:arr){
	        	 System.out.println(i);
	        }
	       
	        
	}
	
	

	 
	
	 public static void printMaxActivities(int s[], int f[], int n) 
	    { 
	    int i, j; 
	       
	    System.out.print("Following activities are selected : n "); 
	       
	    // The first activity always gets selected 
	    i = 0; 
	    System.out.print(i+": "); 
	       
	    // Consider rest of the activities 
	    for (j = 1; j < n; j++) 
	    { 
	         // If this activity has start time greater than or 
	         // equal to the finish time of previously selected 
	         // activity, then select it 
	         if (s[j] >= f[i]) 
	         { 
	              System.out.print(j+" "); 
	              i = j; 
	          } 
	     } 
	    } 
	 
	 
	public int binarySearch(int a[], int left, int right, int x){
		
		if(right >= left){
			int mid = left + (right-left) /2;
			if(a[mid]==x){
				return a[mid];
			}else if(a[mid] > x){
				return binarySearch(a, left, right-1, x);
			}else{
				return binarySearch(a, mid+1, right, x);
			}					
		}else{
			return -1;
		}
	}
	
	public int solution(int[] A) {
        // write your code in Java SE 8
	    Set<Integer> testedSet = new TreeSet<Integer>();
	    Set<Integer> perfectSet = new TreeSet<Integer>();
	    
	    for(int i=0; i<A.length; i++) {
	      testedSet.add(A[i]);   //convert array to set to get rid of duplicates, order int's
	      perfectSet.add(i+1);  //create perfect set so can find missing int
	    }
	    
	    List<Integer> d = new ArrayList<Integer>();
	    
	    
	    Iterator<Integer> it = perfectSet.iterator();
	    while (it.hasNext()) {
	    	  int y = it.next();
			   if(!testedSet.contains(y)) {
				   System.out.println("1st: "+y);
			          return y;
			   }
		}
	    	 
	    if(perfectSet.size() == testedSet.size()) {
	    	System.out.println("returning perfectSet: "+ (perfectSet.size() + 1));
	      return perfectSet.size() + 1;  //e.g. {1, 2, 3} should return 4
	      
	    }
	    System.out.println("returning 1");
	    return 1; 
    }
	
	public int bulb(int[] A){
		 int ctr = 0; 
		 int len = A.length;
		 int[] b = Arrays.copyOf(A, A.length);
		 int[] onOff= new int[len];
		 Arrays.sort(b);

		 //init bulb to off mode
		 for(int i=0; i<len;i++){
			 onOff[i] = 0;  
		 }

		 for(int i=0; i<len; i++){
			 System.out.println("a[i]: "+A[i]);
			 int index = Arrays.binarySearch(b, A[i]);
			 onOff[index] = 1;
			 
			 System.out.println("onOff: "+Arrays.toString(onOff));	 
			 boolean t = true;
			 for(int j=0; j<index; j++){
				 if(onOff[j] == 0 ){
					 t = false;
					 break;
				 }
			 }
			 
			 if(t){
				 ctr++;
				 System.out.println("ctr++: "+ctr);
			 }		
		 }
		 System.out.println("ctr: "+ctr);
		 return ctr;
	}
	
	public int frog(int[] arr){

		int ctr=0;

		if(arr.length > 0){
			int indexVal = 0;	

			while (indexVal != -1){				
				ctr++;
				indexVal = arr[indexVal]; 				
			}
		}
		
		return ctr;
	}
	
	//recursive call method without loop
	public  void printWithoutLoop(int ctr){

		if(ctr <= 10){
			System.out.println("ctr: "+ctr);
			printWithoutLoop(ctr + 1);
		}
		
		List<String> x = new ArrayList<String>();

		
		
	}


	private Object toArray(List<String> x) {
		// TODO Auto-generated method stub
		return null;
	}

}
