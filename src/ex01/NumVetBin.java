package ex01;
public class NumVetBin { 
    public static void main(String[] args) {

        Writer w = new Writer();
        BinConversor b = new BinConversor();
        int [] vet = new int[10];

        w.CreateFile("c:/Users/LGCM/Downloads/arquivo");
        
        for (int i = 0; i < vet.length; i++) {
            vet[i] = (int) Math.random() * 100;
                w.write(b.Conversor(vet[i],vet.length));
        }
    }
    
}
