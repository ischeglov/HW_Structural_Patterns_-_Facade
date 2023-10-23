public class Main {

    public static void main(String[] args) {
        BinOps bins = new BinOps();

        String binSum = bins.sum("1100101", "101");
        System.out.println("Сумма чисел в двоичной системе исчисления: " + binSum);

        String binMult = bins.mult("11001", "1011000");
        System.out.println("Произведение чисел в двоичной системе исчисления: " + binMult);
    }
}
