package DS23244Week6;

public class RecursionTutorialApp{
    public static void main(String[] args) {
        RecursionTutorial myRT = new RecursionTutorial();
        System.out.println("#########testing countHi##########");
        System.out.println("countHi (abcdefghi): " + myRT.countHi("abcdefghi"));
        System.out.println("countHi (abchidehfighiab): " + myRT.countHi("abchidehfighiab"));


        System.out.println("#########testing removeX##########");
        //should be blank
        System.out.println("removeX (): " + myRT.removeX(""));
        //should be ab
        System.out.println("removeX (ab): " + myRT.removeX("ab"));
        //test remove X
        System.out.println("removeX (xjxxxxtxx): " + myRT.removeX("xjxxxxtxx"));
    }
}
