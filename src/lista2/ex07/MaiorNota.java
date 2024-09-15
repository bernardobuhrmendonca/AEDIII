package ex07;

import java.util.Scanner;

public class MaiorNota {
    public static void main(String[] args) {
        float maiorNota = 0, notaTemp = 0;
        String maiorAlunoN = "", alunoTemp = "", pathname;
        Writer w = new Writer();
        Reader r = new Reader();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Indique o nome do arquivo a ser criado.");
        pathname = teclado.nextLine();
        w.createFile(pathname);


        while (alunoTemp.equalsIgnoreCase("x")) {
            if (alunoTemp.equalsIgnoreCase("x")) {
                System.out.println("Indique o nome de um aluno e 'x' para encerrar o cadastramento");
                alunoTemp = teclado.nextLine();
                w.write(pathname, alunoTemp);
                System.out.println("Indique a nota do aluno.");
                notaTemp = teclado.nextFloat();
                w.write(pathname, (int)notaTemp);
            } else {
                break;
            }
        }

    while (r.read(pathname) != null) {
       alunoTemp = r.read(pathname);
       if (r.readI(pathname) > maiorNota) {
            maiorAlunoN =  alunoTemp;
            maiorNota = r.readI(pathname);
       }
    }
    System.out.println("Aluno: " + maiorAlunoN + "\nNota: " + maiorNota);
    teclado.close();    
    }
}
