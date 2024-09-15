package ex03;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Writer {
    FileWriter fileWriter;
    BufferedWriter bufferedWriter;
    File file;

    public boolean CreateFile (String pathname) {
        file = new File(pathname);
        try {
            file.createNewFile();
            return true;
        } catch (Exception e) {
            System.err.println("Erro ao criar o arquivo");
            return false;
        }
    }

    /*Nesse método irei fazer uma leitura com o processo um pouco diferente, 
    ao invés de fazer um loop de escrita dentro do método, que receberia um vetor
    como parâmetro irei tranferir essa função para o main*/
    public void WriteS(String s) {
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
        } catch (Exception e) {
            System.err.println("Erro ao escrever informações no arquivo.");
        }        
    }
}
