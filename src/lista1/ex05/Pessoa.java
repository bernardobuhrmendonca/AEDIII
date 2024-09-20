import java.io.*;

public class Pessoa{
    private String nome;
    private int anoNasc;

    public Pessoa(String nome, int anoNasc) {
        setAnoNasc(anoNasc);
        setNome(nome);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public int getAnoNasc() {
        return anoNasc;
    }
    public String getNome() {
        return nome;
    }


    public static void serializeMethod(Pessoa pessoa, String pathname) {
       try {
            FileOutputStream fos = new FileOutputStream(pathname);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(pessoa);
       } catch (Exception e) {
            System.err.println("Erro ao serializar objeto.");
        }
    }

    public static void desserializeMethod(Pessoa pessoa, String pathname) {
        try {
            FileInputStream fis = new FileInputStream(pathname);
            ObjectInputStream ois = new ObjectInputStream(fis);
            pessoa = (Pessoa) ois.readObject();
        } catch (Exception e) {
            System.err.println("Erro ao desserializar.");
        }
    }
}