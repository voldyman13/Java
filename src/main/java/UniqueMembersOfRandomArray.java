import java.util.Random;

public class UniqueMembersOfRandomArray {
    public static void main(String[]args){
        int length = 50; // length of array
        int bound = 20;  // bound of random members
        int[] array = new int[length];
        getRandomArray(array, bound);
        getUniqueMembers(array);
    }

    public static void getUniqueMembers(int[] array) {
        System.out.print("Unique Members: [ ");
        for (int i=0; i<array.length; i++) {
            boolean flag = true;
            for (int j=0; j<array.length; j++){
                if (j!=i) {
                    if (array[j] == array[i]) {
                        flag = false;
                        break;
                    }
                }
            }
            if(flag){
                System.out.print(array[i]+" ");
            }
        }
        System.out.println("]");
    }

    public static void getRandomArray(int[] array, int bound) {
        Random rd = new Random();
        int len = array.length;
        System.out.print("Array: [ ");
        for(int i=0; i<len; i++){
            array[i] = rd.nextInt(bound);
            System.out.print(array[i]+" ");
        }
        System.out.println("]");
    }
}
