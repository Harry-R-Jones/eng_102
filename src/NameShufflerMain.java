import NameShuffler.NameShuffler;

public class NameShufflerMain {

    public static void main(String[] args) {
        //Initialise the nameShuffler Object
        NameShuffler nameShuffler = new NameShuffler();

        //call flipNames
        System.out.println(nameShuffler.flipNames(args[0]));
    }

}
