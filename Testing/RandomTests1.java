import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class RandomTests1 {
    public static void main(String[] args) {
        }
    private static String subsequences(String partialSubsequence, String word) {
        if (word.isEmpty()) {
            // base case
            return partialSubsequence;
        } else {
            // recursive step
            return subsequences(partialSubsequence, word.substring(1))
                    + ","
                    + subsequences(partialSubsequence + word.charAt(0), word.substring(1));
        }
    }
     public static ArrayList<Integer> permute (ArrayList<Integer> digits)
    {
        ArrayList<Integer> permutations = new ArrayList<>();/* initialize an empty list */

        for (int i=0; i<digits.size(); i++)
        {
            int firstDigit = digits.get(i);
            ArrayList<Integer> otherDigits = (ArrayList<Integer>) digits.subList(i+1,digits.size()); // array containing all digits except firstDigit.  */
                    ArrayList<Integer> subPermutations = permute(otherDigits);
            /* prepend firstDigit into each element of 'subPermutations' */
            /* add all elements of 'subPermutations' to the list 'permutations' */
        }
        return permutations;
    }

    public static <T> Stream<List<T>> combinations(T[] arr) {
        final long N = (long) Math.pow(2, arr.length);
        return StreamSupport.stream(new Spliterators.AbstractSpliterator<List<T>>(N, Spliterator.SIZED) {
            long i = 1;
            @Override
            public boolean tryAdvance(Consumer<? super List<T>> action) {
                if(i < N) {
                    List<T> out = new ArrayList<T>(Long.bitCount(i));
                    for (int bit = 0; bit < arr.length; bit++) {
                        if((i & (1<<bit)) != 0) {
                            out.add(arr[bit]);
                        }
                    }
                    action.accept(out);
                    ++i;
                    return true;
                }
                else {
                    return false;
                }
            }
        }, false);
    }
}
