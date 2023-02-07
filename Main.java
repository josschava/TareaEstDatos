public class Main {

    public static Boolean esBinario(int x){
        Boolean esBinario = true;
        while (x != 0) {
            if (x % 10 > 1) {
                return false;
            }
            x = x / 10;
        }
        return esBinario;
    }
    public static void main(String args[]) {

        System.out.println(esBinario(53099));
    }
}
