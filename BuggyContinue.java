public class MyClass {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.println("Iteration: " + i);
            i++;
            if (i == 3) {
                continue; // Skip the rest of the loop body for i == 3
            }
            System.out.println("After continue (if i ==3, this line won't execute for i=3): " + i);
        }
    }
}