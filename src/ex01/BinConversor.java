package ex01;

public class BinConversor {
    private int bin;
    private int dec;

    public int Conversor(int vec, int tamh) {
        bin = 1;
        for (int i = 0; i < tamh; i++) {
            dec = vec;
            if (dec == 0) {
                return 0;
            } else {
                while (dec != 0) {
                    bin = bin * 10;
                    if (dec % 2 == 1) {
                        bin++;
                    }
                }
            }
        }
        return bin;
    }
}
