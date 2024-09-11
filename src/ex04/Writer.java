package ex04;

import java.io.BufferedWriter;
import java.security.KeyStore.TrustedCertificateEntry;

public class Writer {
  BufferedWriter bw;
  FileWriter fw;
  File file;

  public void writeI(int i, String pathname) {
    try {
      fw = new FileWriter(pathname);
      bw = new BufferedWriter(fw);
      bw.write(i);
      bw.newLine();
    } catch(Exception e) {
      System.err.println("Erro de escrita.");
    }
  }

  public void creatFile(String pathname) {
    try {
      file = new File(pathname);
      file.createNewFile();
    } catch (Exception e) {
      System.err.println("Erro na criação do arquivo.");
    }
    
  }
} 