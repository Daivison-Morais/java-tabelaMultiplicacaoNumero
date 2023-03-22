public class TabelaMultiplicacao {
    public static void main(String[] args) {
        int number = 2;
        System.out.println("Tabela de multiplicação de " + number);
        
        for (int i = 1; i <= 10; i++) {
            int result = 0;
            result = i * number;
            System.out.println(number + "*" + i + "=" + result);

        }

    }
}
