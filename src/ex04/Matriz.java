package ex04;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
      Scanner teclado = new Scanner (System.in);
      int h, v, mh = 0, mv;
      Writer w = new Writer();
      Reader r = new Reader();
      String pathname;
      String output;

      System.out.println("Indique caminho do arquivo de destino das informações.");
      pathname = teclado.nextLine();
      System.out.println("Indique a dimensão horizontal da matriz.");
      h = teclado.nextInt();
      System.out.println("Indique a dimensão vertical da matriz.");
      v = teclado.nextInt();

      int [][] matriz = new int[h][v];

      try {
        w.creatFile(pathname);
        w.writeI(h,pathname);
        w.writeI(v,pathname);
      } catch(Exception e) {
        System.err.println("Erro de escrita.");
      }
      
      while(mh != -1) {
        System.out.println("Indique a coordenada horizontal do endereço que deve ser zerado. Para encerrar a alteração digite -1.");
        mh = teclado.nextInt();
        System.out.println("Indique a coordenada vertical do endereço que deve ser zerado.");
        mv = teclado.nextInt();
        teclado.nextLine();

        try {
          w.writeI(mh,pathname);
          w.writeI(mv,pathname);
        } catch(Exception e) {
          System.err.println("Erro de Escrita.");
        }
      }

      for(int i = 0; i < matriz[h].length; i++) {
        for(int j = 0; j < matriz[v].length; j++) {
            matriz[i][j] = 1;
        }
      }

      while(r.read(pathname) != -1) {
        matriz[r.read(pathname)][r.read(pathname)] = 0;
      }

      System.out.println("Indique o nome do arquivo de saída.");
      output = teclado.nextLine();

      w.creatFile(output);;
      
      for(int i = 0; i < matriz[v].length; i++) {
        for(int j = 0; j < matriz[h].length; j++) {
          w.writeI(matriz[j][i], output);
        }
        try {
          w.bw.newLine();
        } catch(Exception e) {
          System.err.println("Linha não saltada.");
        }
      }
      teclado.close();
    }
}