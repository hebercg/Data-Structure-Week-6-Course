package DS23244Week6;

public class RecursionTutorial {

        //given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.
    public  int countHi(String str){
        //base case
        if (str.length() < 2 ){
            System.out.println("String too small to recurse on..");
            return 0;
        }
        //success - we found hi, but call recursively countHi
        else if (str.substring(0, 2).equalsIgnoreCase("hi")){
            //did find hi, so we need to move down 2 positions in the string str
                return 1 + countHi(str.substring(2));
            }
        //fail - no hi, but call recursively countHi
        else {
            //did not find hi, so only need to move down 1 position in teh string str
            return countHi(str.substring(1));
        }
    }
}
