/*
Дан массив nums = [3,2,2,3] и число val = 3. 
Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива. 
Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
 */

package Seminars.Lesson_1;

public class Number_4 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        int insertPos = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                int temp = nums[insertPos];
                nums[insertPos] = nums[i];
                nums[i] = temp;
                insertPos++;
            }
        }

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
