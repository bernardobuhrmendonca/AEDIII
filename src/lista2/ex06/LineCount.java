package ex06;

import java.util.Scanner;

public class LineCount {
    public static void main(String[] args) {
        Writer w = new Writer();
        Reader r = new Reader();
        Scanner teclado = new Scanner (System.in);

        String pathname;
        String text;

        System.out.println("Indique o nome do arquivo.");
        pathname = teclado.nextLine();
        w.createFile(pathname);

        System.out.println("Indique o texto a ser digitado. Escreva <<<x>>> para encerrar o programa.");
        text = teclado.nextLine();
        while(!text.equalsIgnoreCase("<<<x>>>")) {
            w.write(pathname, text);
            System.out.println("Indique o texto a ser digitado. Escreva <<<x>>> para encerrar o programa.");
            text = teclado.nextLine();
        }
        System.out.println("O número de linhas é: " + r.readCount(pathname));

        teclado.close();
    }
}
