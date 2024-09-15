package ex02;

import java.util.Scanner;

public class FiveWorkers {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] tempoServ = new int[5];
        String[] profissao = new String[5];

        System.out.println("Indique o nome do arquivo onde as informações serão armazenadas.");
        String name = teclado.nextLine();

        for(int i = 0; i < tempoServ.length; i++) {
            System.out.println("Indique a proffissão do funcionário.");
            profissao[i] = teclado.nextLine();
            System.out.println("Indique o tempo de contribuição do funcioonário.");
            tempoServ[i] = teclado.nextInt();
            teclado.nextLine(); 
        }

        Writer w = new Writer();
        w.CreateFile(name);
        w.writeI(tempoServ);
        w.writeS(profissao);

        Reader r = new Reader();
        r.Read(name);
        teclado.close();
    }
}
