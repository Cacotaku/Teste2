import javax.swing.*;

//teste para treino em java.


public class Main {

    public static void main(String[] args) {

        float number1 = 0;
        float number2 = 0;
        int opt = 0;
        float resultado = 0;
        float resto = 0;
        float assistent1 = 0;

        System.out.println("Calculadora maluca:\n" +
                "digite sua operação desejada\n" +
                "1 - Soma\n" +
                "2 - subtração\n" +
                "3 - multiplicação\n" +
                "4 - divisão\n" +
                "5 - exponenciação\n\n");

        opt = Integer.parseInt(JOptionPane.showInputDialog("Opção desejada"));

        switch(opt){

            case 1 :
                number1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro valor:"));
                number2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo valor:"));
                resultado = number1 + number2;

                System.out.println("O resultado de " + number1 + " + " + number2 + " é igual a " + resultado + "\n");

                break;


            case 2 :
                number1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro valor:"));
                number2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo valor:"));
                resultado = number1 - number2;

                System.out.println("O resultado de " + number1 + " - " + number2 + " é igual a " + resultado + "\n");

                break;

            case 3 :
                number1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro valor:"));
                number2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo valor:"));
                resultado = number1 * number2;

                System.out.println("O resultado de " + number1 + " x " + number2 + " é igual a " + resultado + "\n");

                break;

            case 4 :
                number1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro valor:"));
                number2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo valor:"));
                resultado = number1 / number2;
                assistent1 = number1;
                resto = number1 % number2;

                /*
                while(assistent1>=number2)
                {
                    assistent1 = assistent - number2;
                }
                System.out.println("O resultado de " + number1 + " : " + number2 + " é igual a " + resultado + "\n
                O Resto da operação é = " + assistent1 + ".\n");
                */

                System.out.println("O resultado de " + number1 + " : " + number2 + " é igual a " + resultado + "\n");

                break;

            case 5 :
                number1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o exponente\n"));
                number2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a potência\n"));
                resultado = number1;
                assistent1 = 1;

                while(assistent1<number2)
                {
                    resultado = resultado * number1;
                    assistent1 ++;
                }

                System.out.println("O Resultado de " + number1 + " elevado a potência de " + number2 + " é igual a " + resultado);

                break;

            default:
                throw new IllegalStateException("Unexpected value: " + opt);
        }

    }
}