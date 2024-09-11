package ex04;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
      Scanner teclado = new Scanner (System.in);
      int h, v, mh, mv;
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

      try {
        w.createFile(pathname);
        w.writeI(h,pathname);
        w.writeI(v,pathname);
      } catch(Exception e) {
        System.err.println("Erro de escrita.");
      }
      
      while(mh != 00) {
        System.out.println("Indique a coordenada horizontal do endereço que deve ser zerado. Para encerrar a alteração digite 00.");
        mh = teclado.nextInt();
        System.out.println("Indique a coordenada vertical do endereço que deve ser zerado.");
        mv = teclado.nextInt();

        try {
          w.writeI(mh,pathname);
          w.writeI(mv,pathname);
        } catch(Exception e) {
          System.err.println("Erro de Escrita.");
        }
      }

      int matrizA[][] = new int[r.read(pathname)][r.read(pathname)];
      
      while(w.bf.newLine() != null) {
        matriz[r.read(pathname)][r.read(pathname)] = 0;
      }
      for(int i = 0; i < matriz[h].length; i++) {
        for(int j = 0; j < matriz[v].length; j++) {
          if (matriz[i][j] == null) {
            matriz[i][j] = 1;
          }
        }
      }

      w.createFile(output);
      
      for(int i = 0; i < matriz[v].length; i++) {
        for(int j = 0; j < matriz[h].length; j++) {
          w.writeI(matriz[h][v],output);
        }
        w.bw.newLine();
      }
    }
}