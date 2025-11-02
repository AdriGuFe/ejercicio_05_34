public class App {
    public static int InvertirNumero(int num) {
        int digito;
        int invertido = 0;
        while (num > 0) {
            digito = num % 10;
            invertido = invertido * 10 + digito;
            num /= 10;
        }
        return invertido;
    }

    public static void main(String[] args) throws Exception {
        try{
            System.out.print("Por favor, introduzca un número: ");
        int num1 = InvertirNumero(Integer.parseInt(System.console().readLine()));
        System.out.print("Introduzca otro número: ");
        int num2 = InvertirNumero(Integer.parseInt(System.console().readLine()));
        int numPar = 0;
        int numImpar = 0;
        while (num1 > 0 && num2 > 0) {
            int digito1 = num1 % 10;
            int digito2 = num2 % 10;
            num1 /= 10;
            num2 /= 10;
            if (digito1 % 2 == 0)
                numPar = numPar * 10 + digito1;
            if (digito2 % 2 == 0)
                numPar = numPar * 10 + digito2;
            if (digito1 % 2 != 0)
                numImpar = numImpar * 10 + digito1;
            if (digito2 % 2 != 0)
                numImpar = numImpar * 10 + digito2;
        }
        System.out.printf("El número formado por los dígitos pares es %d %n", numPar);
        System.out.printf("El número formado por los dígitos pares es %d %n", numImpar);
        }catch(NumberFormatException e){
            System.out.println("Error, entrada no válida");
        }catch(Exception e){
            System.out.println("Error inesperado");
        }
        
    }
}
