package DS23244Week6;

/**
 * @author hebergoncalves
 */
public class RecursionTutorial {
    // Given a string, compute recursively (no loops) the number of 
    // times lowercase "hi" appears in the string.
    public int countHi(String str){
        // base case
        if(str.length() < 2){
            System.out.println("String too small to recurse on..");
            return 0;
        }
        // success - we found hi, but call recursively countHi
        else if(str.substring(0, 2).equalsIgnoreCase("hi")){
            // did find hi, so we need to move down 2 positions in the string str
            return 1 + countHi(str.substring(2));
        }
        // fail - no hi, but call recursively countHi
        else{
            // did not find hi, so only need to move down 1 position in the string str
            return countHi(str.substring(1));
        }
    } // countHi
    
    // Given a string, compute recursively a new string where all 
    // the ’x’ chars have been removed.
    public String removeX(String str){
        str = str.toLowerCase();
        // base case
        if(str.length() < 1){
            System.out.println("String too small to recurse on..");
            return str;
        }
        // found x, remove it and call removeX recursively
        else if(str.charAt(0) == 'x'){
            return removeX(str.substring(1));
        }
        // did not find x, but still need to call removeX recursively
        else{
            return str.charAt(0) + removeX(str.substring(1));
        } 
    } // removeX
    
    // Given an array of ints, compute recursively if the array contains a 
    // given value. We’ll use the convention of considering only the part of 
    // the array that begins at the given index. In this way, a recursive call 
    // can pass index+1 to move down the array. The initial call will pass in 
    // index as 0, the array, and the number to be searched.
    public boolean containsNum(int[] nums, int num, int index) {
        // base case, have passed over the full length of the array..so end
        if (index >= (nums.length)) {
            return false;
        // success, found the number in the array....end
        } else if (nums[index] == num) {
            return true;
        // fail, did not find the number at the current index, move to the 
        // next index, and call containsNum recursively
        } else {
            return containsNum(nums, num, index + 1);
        }
    }

    // Given a string, compute recursively a new string where all the 
    // lowercase ’x’ chars have been moved to the end of the string.
    public String endX(String str){
        str = str.toLowerCase();
        
        // base case
        if(str.length() <= 0){
            return str;
        }
        // found x, move it to the end (post-print) and call endX recursively
        else if(str.charAt(0) == 'x'){
            return endX(str.substring(1)) + str.charAt(0);
        }
        // did not find x, but still need to call endX recursively, pre-print the char
        else{
            return str.charAt(0) + endX(str.substring(1));
        }
    }
    
    // Given a non-negative int n, return the sum of its digits recursively 
    // (no loops). Note that mod (%) by 10 yields the rightmost digit 
    // (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit 
    // (126 / 10 is 12).
    
    public int sumDigits(int num){
        // base case
        if(num < 10){
            return num;
        }
        else{
            return (num % 10) + sumDigits(num/10);
        }
    }
    
    // Given a string, compute recursively (no loops) a new string where all 
    // the lowercase ’x’ chars have been changed to ’y’ chars.    
    public String changeXY(String str) {
        if (str.length() == 0) {
            return str;
        } else if (str.charAt(0) == 'x') {
            return 'y' + changeXY(str.substring(1));
        } else {
            return str.charAt(0) + changeXY(str.substring(1));
        }
    }

    // Given a string, return recursively a “cleaned” string where adjacent 
    // chars that are the same have been reduced to a single char. 
    // So “yyzzza” yields “yza”.
    public String stringClean(String str) {
        if (str.length() <= 1) {
            return str;
        } else {
            String sub = str.substring(0, 2);
            if (sub.charAt(0) == sub.charAt(1)) {
                return stringClean(str.substring(1));
            } else {
                return sub.charAt(0) + stringClean(str.substring(1));
            }
        }
    }
}
