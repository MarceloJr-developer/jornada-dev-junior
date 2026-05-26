package semana01.reforco;

public class MathUtil {

    public static int soma(int num1, int num2) {
        return num1 + num2;
    }
    public static double media(double num1, double num2) {
        return (num1 + num2)/2;
    }
    public static int fatorial(int num1) {
        int resultado = 0;

        if(num1 < 0){
            throw new IllegalArgumentException("ERRO: NAO EXISTE FATORIAL DE NUMERO NEGATIVO");
        }

         if (num1 <= 1){
            return 1;
        } else {
            for(int i = num1 - 1; i > 1; i--){
                num1 *= i;
            }
            return resultado;
        }


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
        System.out.println(MathUtil.fatorial(0));
        System.out.println(MathUtil.max(10,8));
        System.out.println(MathUtil.min(10,8));
    }




}
