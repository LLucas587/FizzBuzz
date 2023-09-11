public class Multiples {
    public static void main(String[] args) {
        int i = 3;
        int counter = 0;
        while (i < 1000) {
            if (i % 3 == 0) {
                counter += 1;
            } else if (i % 5 == 0) {
                counter += 1;
            }
            i+=1;

        }
        System.out.println(counter);
    }
}

