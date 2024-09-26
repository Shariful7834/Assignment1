
public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nValues = 50;

        outerLoop:
        for (int i = 2; i <= nValues; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    continue outerLoop; // labeled continue
                }
            }
            System.out.println(i); // prime number
        }
    }
}