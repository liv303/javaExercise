package week7.day1;

public class leapYear {
    public static void main(String[] args) {
        int[] arr = {1700, 2016, 2020, 1900, 2400, 2100, 2019};

        checkLeapYear(arr);
    }

    private static void checkLeapYear(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int year = arr[i];
            if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
                System.out.println(year + " 윤년");
            else
                System.out.println(year + " 윤년 아님");
        }
    }
}
