package main;

import java.util.Arrays;

public class Calculator {
    public static int add(String num) throws Exception {
        if (num.equals("")) {
            return 0;
        }

        //check for negative
        if (num.indexOf("-") > -1) {
            throw new Exception(String.format("negatives not allowed %s", num));
        }


/*
-find all the negatives    "-1,-2,-3"
    -find the first index  0
        then search in the remaining substring  "1,-2,-3"
            -repeat until substring is empty
-add them to the exception message
 */

        String delimiter = ",";
        String[] nums;
        int index = 0;

        if (num.charAt(0) == '/') {
            String[] split = num.split("\n");
            delimiter = split[0].substring(2);
            num = num.replace("\n", "");
            System.out.println(num);
            nums = num.split(delimiter);
            index = 1;
        } else {
            nums = num.split(delimiter);
            if (nums.length == 1) {
                if (nums[0].length() == 1) {
                    return Integer.valueOf(nums[0]);
                } else {
                    delimiter = Character.toString(num.charAt(1));
                    nums = num.split(delimiter);
                }
            }

        }

        int total = 0;
        System.out.println(Arrays.toString(nums));
        if (nums.length == 1 && nums[0].equals("")) {
            return 0;
        } else {
            for (int i = index; i < nums.length; i++) {
                System.out.println(nums[i]);
                total += Integer. valueOf(nums[i]);
            }
        }

        return total;
    }
}

/*
-empty string input
-single number input
-numbers separated by commas input

-handle unknown number of inputs
    -if length == 1, check if first string was empty
    -for loop
        -take the length of the array
         -while length > 0
            add value to a total?


    //[delimiter]\n[numbers…]
    "1,2,3"
    //;\n1;2

    capture delimiter
        first line optional

        regex?


    call split(delimiter)

 */
