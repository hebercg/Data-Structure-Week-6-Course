package DS23244Week6;

/**
 * @author hebergoncalves
 */
public class RecursionTutorial {

    //given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.
    public int countHi(String str) {
        //base case
        if (str.length() < 2) {
            System.out.println("String too small to recurse on..");
            return 0;
        }
        //success - we found hi, but call recursively countHi
        else if (str.substring(0, 2).equalsIgnoreCase("hi")) {
            //did find hi, so we need to move down 2 positions in the string str
            return 1 + countHi(str.substring(2));
        }
        //fail - no hi, but call recursively countHi
        else {
            //did not find hi, so only need to move down 1 position in teh string str
            return countHi(str.substring(1));
        }
    }//countHi

    public String removeX(String str) {
        str = str.toLowerCase();
        //base case
        if (str.length() < 1) {
            System.out.println("String too small to recurse on..");
            return str;
            //found x, remove it and call removeX recursively
        } else if (str.charAt(0) == 'x') {
            return removeX(str.substring(1));
        } else {
            //did not find x, but still need to call removeX recursively
            return str.charAt(0) + removeX(str.substring(1));
            //return str  + "end";
        }

    }

    public boolean containsValue(int[] arr, int index, int value) {
        // base case: reached end of array
        if (index >= arr.length) {
            return false;
        }
        // check if current element is the value we're looking for
        else if (arr[index] == value) {
            return true;
        }
        // recursively check the next part of the array
        return containsValue(arr, index + 1, value);
    }
}

