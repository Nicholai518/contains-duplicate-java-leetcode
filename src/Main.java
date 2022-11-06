public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] exampleOne = {1, 2, 3, 1};
        int[] exampleTwo = {1, 2, 3, 4};

        System.out.println("Example One : " + solution.containsDuplicate(exampleOne));
        System.out.println("Example Two : " + solution.containsDuplicate(exampleTwo));
    }
}
