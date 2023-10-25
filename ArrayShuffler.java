public class ArrayShuffler {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        shuffle(numbers);
        
        // Print shuffled array
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    public static void shuffle(int[] array) {
        int index, temp, length = array.length;
        java.util.Random random = new java.util.Random();
        
        for (int i = length - 1; i > 0; i--) {
            index = random.nextInt(i + 1);

            // Simple swap
            temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }
}
