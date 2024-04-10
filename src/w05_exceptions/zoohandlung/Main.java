package w05_exceptions.zoohandlung;

public class Main {
    public static void main(String[] args) {
        Fisch fisch1 = new Skalar();
        Fisch fisch2 = new Skalar();
        Fisch fisch3 = new Skalar();
        Fisch fisch4 = new Skalar();
        Fisch fisch5 = new Skalar();
        Fisch fisch6 = new Skalar();
        Fisch fisch7 = new Guppy();

        Fisch[] fischArr = {fisch1,fisch2,fisch3,fisch4,fisch5,fisch6,fisch7};

        for (int i = 0; i < fischArr.length; i++){
            for (int j = 0; j < fischArr.length; j++){
                if (!(i==j)){
                    fischArr[i].pruefen(fischArr[j]);
                }
            }
        }
    }
}
