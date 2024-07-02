package DS23244Week6;

/**
 * @author hebergoncalves
 */
public class RecursionTutorialApp {
    public static void main(String[] args) {
        RecursionTutorial myRT = new RecursionTutorial();
        
        System.out.println("############# Testing countHi ###############");
        System.out.println("countHi(h): " + myRT.countHi("h"));
        System.out.println("countHi(abcdefghi): " + myRT.countHi("abcdefghi"));
        System.out.println("countHi(abchidehfighiab): " + myRT.countHi("abchidehfighiab"));
        
        
        System.out.println("############# Testing removeX ###############");
        System.out.println("removeX(): " + myRT.removeX("")); // nothing
        System.out.println("removeX(ab): " + myRT.removeX("ab")); // ab
        System.out.println("removeX(xaxxbxxn): " + myRT.removeX("xaxxbxxxxn")); // abn
        System.out.println("removeX(xjxxxxtxx): " + myRT.removeX("xjxxxxtxx")); // jt
        
        System.out.println("############# Testing containsNum ###############");
        int [] nums = {2,3,6,9,21};
        System.out.println("containsNum(): " + myRT.containsNum(nums, 9, 0));
        
        System.out.println("############# Testing endX ###############");
        System.out.println("endX(123x45): " + myRT.endX("123x45")); // 12345x
        System.out.println("endX(xx123x45): " + myRT.endX("xx123x45")); // 12345xxx
        System.out.println("endX(x123x4x5x): " + myRT.endX("x123x4x5x")); // 12345xxxx
        
        System.out.println("############# Testing sumDigits ###############");
        
        System.out.println("sumDigits(126): " + myRT.sumDigits(126)); // 9
        System.out.println("sumDigits(958): " + myRT.sumDigits(958)); // 22
        System.out.println("sumDigits(3): " + myRT.sumDigits(3)); // 3
        
        // Call changeXY on a String
        System.out.println("############# Testing changeXY ###############");
        System.out.println(myRT.changeXY("x"));
        
        System.out.println(myRT.changeXY("enda 123"));
        
        System.out.println(myRT.changeXY("x123xstrx"));
        
        // Call stringClean on a String
        System.out.println("############# Testing stringClean ###############");
        System.out.println("myRT.stringClean(\"x\"): " + myRT.stringClean("x"));

        System.out.println("myRT.stringClean(\"yyzzza\"): " + myRT.stringClean("yyzzza"));        
        
    }
}
