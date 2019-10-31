package codility;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Permutations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {		 
		String s = "9999"; 
		List<String> combination =  new ArrayList<String>();
		printPermution(s, "", combination);		
		countValidTime(combination);
	}
	
	// Function to print all the permutations of str 
    static void printPermution(String str, String ans, List<String> combination) 
    { 
  
        // If string is empty 
        if (str.length() == 0) { 
            combination.add(ans);
            return; 
        } 
  
        for (int i = 0; i < str.length(); i++) { 
  
            // ith character of str 
            char ch = str.charAt(i); 
  
            // Rest of the string after excluding  
            // the ith character 
            String ros = str.substring(0, i) +  
                         str.substring(i + 1); 
  
            // Recurvise call 
            printPermution(ros, ans + ch , combination); 
        } 
    } 
    
    static void countValidTime(List<String> combination){
    
    	
    	Set<String> time = new TreeSet<String>();
    	for(String c : combination){
    		int hour = Integer.parseInt(c.substring(0, 2));
    		int min = Integer.parseInt(c.substring(2, 4));
    		
    		if (hour >= 0 && hour <= 24){    		
    			if(min >= 0 && min < 60){
    				time.add(c.substring(0, 2) + ":" + c.substring(2, 4));
    			}
    		}
    	}
    	
    	System.out.println("\nValid Time Format: ");
    	for(String timeStamp : time){
    		System.out.println(timeStamp);
    	}
    	
    	
    	System.out.println("Number of valid hour: "+ time.size());
    	
    }
    
}
