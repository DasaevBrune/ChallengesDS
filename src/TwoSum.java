public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int[] result = new int[2]; // Inicializa result con tamaño 2
        int target = 9;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = nums[i];
                    result[1] = nums[j];
                    break; // Termina el bucle si se encuentra una solución
                }
            }
        }

        // Imprime el resultado
        System.out.println("Result: [" + result[0] + ", " + result[1] + "]");
    }
}
