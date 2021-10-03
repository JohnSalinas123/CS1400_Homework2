public class PowersChart {
   
    public static void main(String []args) {
        System.out.println("Problem 2: Powers Chart");

        System.out.printf("%5s %5s %5s %5s \n", 1, 2, 3, 4);
        System.out.printf("%4s %5s %5s %5s \n", "x", "x", "x", "x");
        System.out.println();

        int base = 1;
        int exponent = 0;
        int powerNum;
        int powers[] = new int[4];

        for (int i = 0; i < 10; i++) {
            exponent = 1;
            for (int j = 0; j < 4;j++) {
                powerNum = (int)Math.pow(base,exponent);
                powers[j] = powerNum;
                exponent++;
            }
            System.out.printf("%5s %5s %5s %5s \n", powers[0], powers[1], powers[2], powers[3]);
            base++;
        }
    }

}
