package ex04;


import java.io.*;


public class Reader {
  BufferedReader br;
  FileReader fr; 
  int line;
  
  public int read(String pathname) {
    try{
      fr = new FileReader(pathname);
      br = new BufferedReader(fr);
      line = br.read();
      return line;
    } catch (Exception e){
      System.err.println("Erro de leitura.");
      return line;
    }
  }
} 