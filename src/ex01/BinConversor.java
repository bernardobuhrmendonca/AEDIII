package ex01;

public class BinConversor {
    private int[] bin;
    private int[] dec;

    public int[] getBin() {
        return bin;
    }

    public void setBin(int[] bin) {
        this.bin = bin;
    }
    int setCaseBin(int casa) {
        this.bin[casa];
    }

    public int[] getDec() {
        return dec;
    }

    public void setDec(int[] dec) {
        this.dec = dec;
    }

    public int[] Converse(int[] vec) {
        for (int j = 0; j < vec.length; j++) {
            bin[j] = 1;
            if (dec[j] == 0) {
                bin[j] = 0;
            }
            while (dec[j] != 0) {
                if (dec[j] / 2 != 0) {
                    bin[j] = bin[j] * 10;
                    dec[j] = dec[j] / 2;
                } else {
                    dec[j] = 0;
                    bin[j] = bin[j] + 1;
                }
            }
        }
        return bin;
    }
}
