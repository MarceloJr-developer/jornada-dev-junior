package semana01.reforco;

public class MathUtil {

    public static int soma(int num1, int num2) {
        return num1 + num2;
    }
    public static double media(double num1, double num2) {
        return (num1 + num2)/2;
    }
    public static long fatorial(int num1) {
        if(num1 < 0){
            throw new IllegalArgumentException("ERRO: NAO EXISTE FATORIAL DE NUMERO NEGATIVO");
        }
        if (num1 > 20){
            throw new IllegalArgumentException("ERRO: FATORIAL ACIMA DE 20 ESTOURA O TIPO LONG");
        }

        long resultado = 1;

            for(int i = num1; i > 1; i--){
                resultado *= i;
            }
            return resultado;



    }
    public static int max(int num1, int num2){
        int maiorNum;
        if(num1 > num2){
            maiorNum = num1;
        } else {
            maiorNum = num2;
        }

        return maiorNum;
    }
    public static int min(int num1, int num2){
        int menorNum;
        if(num1 < num2){
            menorNum = num1;
        } else {
            menorNum = num2;
        }

        return menorNum;
    }

    public static void main (String[] args){
        System.out.println(MathUtil.soma(1,2));
        System.out.println(MathUtil.media(4,3));
        System.out.println(MathUtil.max(10,8));
        System.out.println(MathUtil.min(10,8));

        //teste fatorial

        System.out.println(Integer.MAX_VALUE);              // 2147483647
        System.out.println(Integer.MAX_VALUE + 1);          // -2147483648 (!!)

        try {
            System.out.println(MathUtil.fatorial(25));
        } catch (IllegalArgumentException e) {
            System.out.println("Capturei exception: " + e.getMessage());
        }

        System.out.println(MathUtil.fatorial(0));
        System.out.println(MathUtil.fatorial(1));
        System.out.println(MathUtil.fatorial(3));
        System.out.println(MathUtil.fatorial(5));
        System.out.println(MathUtil.fatorial(10));
        System.out.println(MathUtil.fatorial(15));
    }





}
