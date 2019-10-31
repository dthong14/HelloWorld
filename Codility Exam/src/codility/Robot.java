package codility;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Robot {

	/**
	 * @param args
	 */
//	public static void main(String[] args) {
//		
//		Robot r = new Robot();
//		String val = "FD{foo}FFD{bar}RFF{Khate}RFFD{World}D{}DA{hello}";
//		//String val = "FD{foo}FFD{bar}RFFD{Foo}RFFD{World}D{}DA{hello}";
//		Map<String, List<String>> x = null;
//		try {
//			x = r.simulateArm(val);
//			System.out.println("\nThe Final output: "+	x.toString());
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			//e.printStackTrace();
//			System.out.print(e.getMessage());
//		}
//	}
	
    public Map<String, List<String>> simulateArm(final String input) throws Exception{
    	
    	Map<String, List<String>> output = new TreeMap<String, List<String>>();
    	List<String> command = new ArrayList<String>();
    	List<String> word = new ArrayList<String>();
    	boolean isValid;
    	output.put("A", new ArrayList<String>());
    	output.put("B", new ArrayList<String>());
    	output.put("C", new ArrayList<String>());
    	output.put("D", new ArrayList<String>());
    	output.put("E", new ArrayList<String>());
    	    
    	String[] str = input.split("}");
    	for(String s : str){
    		command.add(this.getCommand(s));
    		word.add(this.getStringValue(s));
    		isValid= this.validateCommand(s);
    		if(!isValid){
    			String err="There must be a 'D' command prior {";
    		    throw new InvalidStringException(err);  
    		}
    	}
    	    	
    	int cur = -1;   
    	Set<String> x = output.keySet();
    	String[] k = x.toArray(new String[x.size()]);
    
    	for(int i=0; i<command.size(); i++){
    		char[] cmd = this.splitCommand(command.get(i));

    		for(char c : cmd){
    			if(c == 'F'){
    				if(cur < 5)
    				cur++;
    			}else if(c == 'R'){
    				cur=-1;
    			}else if(c == 'D'){  
    				if(!word.get(i).equals("")){    					
    					output.get(k[cur]).add(word.get(i));
    				}
    				cur++;
    			}
    		}
    		
    	}

        return output;
    }
    
    private String getStringValue(String str){
    	return str.substring(str.indexOf('{')+1);
    }
    
    private String getCommand(String str){
    	return str.substring(0,str.indexOf('{'));
    }
    
    private char[] splitCommand(String str){
    	return str.toCharArray();
    }
    
    private boolean validateCommand(String str){
    	
    	if(str.contains("{")){
    		int x = str.indexOf("{");    		
    		if(str.indexOf("D") > x || str.indexOf("D") == -1){
    			return false;
    		}else{
    			return true;
    		}
    	}
    	return false;
    }
    
   
}
