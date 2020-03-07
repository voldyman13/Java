import java.util.Random;

public class UniqueMembersOfRandomArray {
    public static void main(String[]args){
        int length = 31; // length of array
        int bound = 1;  // bound of random members
//        getUniqueMembers(getRandomArray(length, bound));
        getRandomNumber(bound, length);
    }

    public static void getUniqueMembers(int[] array) {
        System.out.print("Unique Members: [ ");
        for (int i=0; i<array.length; i++) {
            boolean flag = true;
            for (int j=0; j<array.length; j++){
                if (j!=i && array[j] == array[i]) {
                        flag = false;
                        break;
                }
            }
            if(flag){
                System.out.print(array[i]+" ");
            }
        }
        System.out.println("]");
    }

    public static int[] getRandomArray(int length, int bound) {
        int[] array = new int[length];
        Random rd = new Random();
        int len = array.length;
        System.out.print("Array: [ ");
        for(int i=0; i<len; i++){
            array[i] = rd.nextInt(bound);
            System.out.print(array[i]+" ");
        }
        System.out.println("]");
        return array;
    }
    public static int getRandomNumber(int first, int last) {
        Random rd = new Random();
        int number = first-1;
        while(number<=first-1) {
            number = rd.nextInt(last-first-1);
        }
        System.out.println(number);
        return number;
    }

}
