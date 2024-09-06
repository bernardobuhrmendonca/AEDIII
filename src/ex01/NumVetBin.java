package ex01;

import java.util.Random;

public class NumVetBin {
    public static void main(String[] args) {

        Writer w = new Writer();
        BinConversor b = new BinConversor();
        int [] vet = new int[10];
        Random renge = new Random();

        w.CreateFile("c:/Users/LGCM/Downloads/arquivo");
        
        for (int i = 0; i < vet.length; i++) {
            vet[i] = renge.nextInt();
        }

        w.write(b.Converse(vet));

    }
    
}
