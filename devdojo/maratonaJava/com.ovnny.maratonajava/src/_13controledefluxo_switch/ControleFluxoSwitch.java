package _13controledefluxo_switch;

public class ControleFluxoSwitch {

    public static void main(String[] args) {

        byte dia = 5;
        // char, int, byte, short, enum e String (a partir do JDK1.7)

        switch(dia) {
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terça");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                // dentro de cada case podem ser construídos blocos de código inteiros
                if (true) {
                    System.out.println("quinta"); // quinta
                }
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sábado");
                break;
        }

        // Caso a variável seja do tipo String, trocar aspas simples por aspas duplas

        char sexo = 'F';
        switch (sexo) {
            case 'F':
                System.out.println("Feminino");
                break; // Feminino
            case 'M':
                System.out.println("Masculino");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
