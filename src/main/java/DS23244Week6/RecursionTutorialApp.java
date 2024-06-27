package DS23244Week6;

/**
 * @author hebergoncalves
 */
public class RecursionTutorialApp {
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

        //test array
        System.out.println("#########testing containsValue##########");
        int[] array1 = {2, 3, 6, 9, 21 };
        int[] array2 = {10, 20, 30, 40, 50};
        System.out.println("containsValue (array1, 3): " + myRT.containsValue(array1, 0, 3));
        System.out.println("containsValue (array2, 25): " + myRT.containsValue(array2, 0, 25));
    }
}
