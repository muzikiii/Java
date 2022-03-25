public class Regex {
  public static void main(String[] args) {
    String myStr = "TBS0000010";
    
    
    String regex = "(\\D{3}0+)";
	
    String[] output = myStr.split(regex);
    
    String part1 = output[0]; 
    String part2 = output[1]; 

	System.out.println(myStr); 
    System.out.println(part1); 
    System.out.println(part2); 
        
  }
}
