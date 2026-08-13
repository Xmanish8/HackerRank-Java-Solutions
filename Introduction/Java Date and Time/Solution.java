import java.io.*;
import java.time.LocalDate;

class Result {
    public static String findDay(int month, int day, int year) {
        LocalDate dd = LocalDate.of(year, month, day);
        return dd.getDayOfWeek().toString();
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);
        int day = Integer.parseInt(firstMultipleInput[1]);
        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        // Print to console instead of writing to OUTPUT_PATH
        System.out.println(res);

        bufferedReader.close();
    }
}
