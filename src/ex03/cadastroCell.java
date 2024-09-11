package ex03;

import java.util.Scanner;

public class cadastroCell {
    public static void main(String[] args) {
        String celular = "", nome = "";
        Scanner teclado = new Scanner(System.in);
        Writer w = new Writer();

        while(!nome.equalsIgnoreCase("0")) {
            System.out.println("Indique o nome do contato, ou digite '0' para interromper o cadastro.");
            nome = teclado.nextLine();
            System.out.println("Indique o celular do contato.");
            celular = teclado.nextLine();
            try {
                w.WriteS(nome);
                w.WriteS("-");
                w.WriteS(celular);
                w.bufferedWriter.newLine();
            } catch (Exception e) {
                System.err.println("Erro ao escrever no documento.");
            }
        }
        teclado.close();
    }
}
