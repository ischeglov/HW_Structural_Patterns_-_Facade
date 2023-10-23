public class BinOps {
    public String sum(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, сложите и переведите
      обратно в двоичную запись*/
        int aa = Integer.parseInt(a, 2);
        int bb = Integer.parseInt(b, 2);
        int sum = aa + bb;
        System.out.println("Сумма чисел: " + sum);
        return Integer.toBinaryString(sum);
    }

    public String mult(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, перемножьте и переведите
      обратно в двоичную запись*/
        int aa = Integer.parseInt(a, 2);
        int bb = Integer.parseInt(b, 2);
        int mult = aa * bb;
        System.out.println("Произведение чисел: " + mult);
        return Integer.toBinaryString(mult);
    }
}
