import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int arrRow = 0; arrRow < arr.size() - 2; arrRow++) {
            for (int arrColumn = 0; arrColumn < arr.get(arrRow).size() - 2; arrColumn++) {
                    sum = arr.get(arrRow).get(arrColumn)
                            + arr.get(arrRow).get(arrColumn + 1)
                            + arr.get(arrRow).get(arrColumn + 2)
                            + arr.get(arrRow + 1).get(arrColumn + 1)
                            + arr.get(arrRow + 2).get(arrColumn)
                            + arr.get(arrRow + 2).get(arrColumn + 1)
                            + arr.get(arrRow + 2).get(arrColumn + 2);
                    if (sum > maxSum) {
                        maxSum = sum;
                    }
                }
            }

        System.out.println(maxSum);

        bufferedReader.close();
    }
}
