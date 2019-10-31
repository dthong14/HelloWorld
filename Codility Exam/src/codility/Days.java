package codility;

public class Days {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String day = solution("Sat",23);
		System.out.println("day is "+day);
	}

	
    public static String solution(String S, int K) {
        // write your code in Java SE 8
        String[] days =  {"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
        int index = 0;        
        
        for(int i=0; i<days.length; i++){
            if(days[i].equalsIgnoreCase(S)){
                index = i;
                break;
            }
        }
        
        if(index + K <= 6){
            return days[index + K];   
        }
        
        
        for(int i = 0; i<= K-1; i++){
        	index++;
        	if (index>6){
        		index = 0;
        	}        	
        }
        
        System.out.println("index: "+index);
        return days[index];

        
    }
    
}
