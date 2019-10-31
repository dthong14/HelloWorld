package codility;

import java.util.ArrayList;
import java.util.List;

public class Shoes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int x  = solution("RLRRLLRLRRLL");
//		int x  = solution("RLRRLLRLRRLL");
		int x  = solution("LLRLRLRLRLRLRR");
		System.out.println("ctr: "+ x);
	}
	
	
	public static int solution(String S){
		char[] strArr = S.toCharArray();
		
		int left=0;
		int right=0;
		char currLetter = strArr[0];
		int ctr = 0; 
		
		
		for(char s: strArr){
			if(s=='L'){
				left++;				
			}else{
				right++;
			}
			
			if(currLetter != s){
				currLetter = s;
			}

			if(left == right){
				ctr++;
				left = 0;
				right = 0;
			}

		}
		
		return ctr;
	}

}
