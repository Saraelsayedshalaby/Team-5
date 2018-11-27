public class Main
{
	public static boolean isPalindrome(String inputString){
    int length  = inputString.length();
    int i, begin, end, middle;
    begin  = 0;
    end    = length - 1;
    middle = (begin + end)/2;
		for (i = begin; i <= middle; i++) {
			if (inputString.charAt(begin) == inputString.charAt(end)) {
			   begin++;
			   end--;
			}else {
				break;
			}
		}
		if (i == middle + 1) {
		  return true;
		}else {
		  return false;\\not palaindrome
	    }  
	}
	

public class Main
{

    public static void main(String[] args) {
        System.out.println("Hello Team 5");
    }

}
