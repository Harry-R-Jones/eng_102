import com.company.Challenge_1.Challenge1;
import com.company.Challenge_2.Challenge2;
public class Main {

    public static void main(String[] args) {
        Challenge1 challenge = new Challenge1();
        Challenge2 challenge2 = new Challenge2();

	    System.out.println(challenge.challenge1(1000));


        String[] arrayHolder = challenge2.sortWords(challenge2.splitWords("Have a Nice Day"));
        for(int i = 0; i < arrayHolder.length; i ++){
            System.out.println(arrayHolder[i]);
        }
    }



}
