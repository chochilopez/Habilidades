import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main (String[] args){
        String champion = StdIn.readString();
        while (!StdIn.isEmpty()) {
            champion = StdRandom.bernoulli() ? StdIn.readString() : champion;
        }
        StdOut.println(champion);
    }
}