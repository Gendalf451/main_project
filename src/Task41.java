import java.util.Random;

public class Task41 {
    public static void main(String[] args) {

        //4.1.3
        int[] nums = getArrayInteger();
        for (int num : nums) {
            System.out.println(num);
        }
        System.out.println();

        //4.1.4
        nums = getArrayEvenInteger();
        for (int num : nums) {
            System.out.println(num);
        }
        System.out.println();

        //4.1.5
        nums = getArrayUnevenInteger();
        for (int num : nums) {
            System.out.println(num);
        }
        System.out.println();

        //4.1.6
        nums = getArrayIntegerDivisionBy2And5(new int[] { 10, 20, 30, 5 });
        for (int num : nums) {
            System.out.println(num);
        }
        System.out.println();

        //4.1.7
        nums = getArrayRandomInteger();
        for (int num : nums) {
            System.out.println(num);
        }
        System.out.println();

    }


    //4.1.3
    static int[] getArrayInteger() {
        Random random = new Random();
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt();
        }
        return nums;
    }

    //4.1.4
    static int[] getArrayEvenInteger() {
        Random random = new Random();
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            int randomInt = random.nextInt();
            if (randomInt % 2 != 0) {
                i--;
            } else {
                nums[i] = randomInt;
            }
        }
        return nums;
    }

    //4.1.5
    static int[] getArrayUnevenInteger() {
        Random random = new Random();
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            int randomInt = random.nextInt();
            if (randomInt % 2 == 0) {
                i--;
            } else {
                nums[i] = randomInt;
            }
        }
        return nums;
    }

    //4.1.6
    static int[] getArrayIntegerDivisionBy2And5(int[] arr) {
        int count = 0;
        for (int j : arr) {
            if (j % 2 == 0 && j % 5 == 0) {
                count++;
            }
        }
        int[] nums = new int[count];
        int index = 0;
        for (int j : arr) {
            if (j % 2 == 0 && j % 5 == 0) {
                nums[index] = j;
                index++;
            }
        }
        return nums;
    }

    //4.1.7
    static int[] getArrayRandomInteger(){
        Random random = new Random();
        int[] nums = new int[20];
        int min = -10;
        int max = 10;
        int diff = max-min;

        for (int i = 0; i < nums.length; i++) {
            int randomInt = random.nextInt(diff+1) + min;
            if (randomInt == 0) {
                i--;
            } else {
                nums[i] = randomInt;
            }
        }
        return nums;
    }
}
