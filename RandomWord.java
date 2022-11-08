/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {

        String champion = "";
        // boolean pass = false;
        // double counter = 1.0;
        for (int i = 1; i < args.length; i++) {
            double iAsDouble = i;
            if (StdRandom.bernoulli(1 / iAsDouble)) {
                champion = StdIn.readLine();
            }
            else {
                StdIn.readLine();
            }
        }
        // while (StdIn.hasNextLine()) {
        //     if (StdRandom.bernoulli(1 / counter)) {
        //         champion = StdIn.readLine();
        //     }
        //     else {
        //         StdIn.readLine();
        //     }
        //     counter++;
        // }
        // while (!StdIn.isEmpty()) {
        //     System.out.println(counter);
        //     System.out.println(args.length);
        //     if (counter == args.length) {
        //         break;
        //     }
        //     counter++;
        //     pass = StdRandom.bernoulli(1 / counter);
        //
        //     if (pass) {
        //         champion = StdIn.readString();
        //     }
        //     else { // need this else statement otherwise we aren't iterating through the words that aren't selected.
        //         StdIn.readString();
        //     }
        // }
        StdOut.println(champion);
    }
}
