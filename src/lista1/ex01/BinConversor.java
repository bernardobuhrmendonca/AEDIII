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
    public void setCaseBin(int casa, int value) {
        this.bin[casa] = value;
    }

    public int[] getDec() {
        return dec;
    }

    public void setDec(int[] dec) {
        this.dec = dec;
    }

    //Used for convert a decimal number to a binary one.
    public int[] Converse(int[] vec) {
        //This loop is used for covert all items in an vector and tranffer to another one, dec to bin.
        for (int j = 0; j < vec.length; j++) {
            bin[j] = 1;
            //if the dec number is equal to 0, the return in bin vector will be 0 too.
            if (dec[j] == 0) {
                bin[j] = 0;
            }
            //for the cases that the number isn't 0.
            while (dec[j] != 0) {
                //Implementing the sucessive division per two conversion method.
                if (dec[j] / 2 != 0) {
                    bin[j] = bin[j] * 10;
                    dec[j] = dec[j] / 2;
                } else {
                    dec[j] = 0;
                    bin[j] = bin[j] + 1;
                }
            }
        }
        //Returning the vector with the results of the process.
        return bin;
    }
}
