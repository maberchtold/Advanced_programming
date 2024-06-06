package w12_Rekursion.rucksackProblem;

import java.util.Arrays;

public class Main {
    private static int maxVolEingepackt = 0;
    private static int[] besteKombination;

    public static void main(String[] args) {
        int rucksackVolumen = 6790;
        int[] gegenstaende = {2463, 2597, 315, 1089, 78, 599, 1283, 1625, 2292, 211};
        int[] eingepackteGegenstaende = new int[gegenstaende.length];
        besteKombination = new int[gegenstaende.length];
        rucksackPacken(rucksackVolumen, gegenstaende, eingepackteGegenstaende, 0, 0, 0);

        System.out.println("Best mögliche Kombination: " + Arrays.toString(Arrays.copyOf(besteKombination, gegenstaende.length)));
        System.out.println("Volumen eingepackt: " + maxVolEingepackt);
    }

    public static void rucksackPacken(int rucksackVolumen, int[] gegenstaende, int[] eingepackteGegenstaende, int indexGegenstaende, int indexGepackt, int volEingepackt) {
        if (volEingepackt > maxVolEingepackt) {
            maxVolEingepackt = volEingepackt;
            System.arraycopy(eingepackteGegenstaende, 0, besteKombination, 0, indexGepackt);
        }
        if (indexGegenstaende == gegenstaende.length) {
            return;
        }

        if (volEingepackt + gegenstaende[indexGegenstaende] <= rucksackVolumen) {
            eingepackteGegenstaende[indexGepackt] = gegenstaende[indexGegenstaende];
            rucksackPacken(rucksackVolumen, gegenstaende, eingepackteGegenstaende, indexGegenstaende + 1, indexGepackt + 1, volEingepackt + gegenstaende[indexGegenstaende]);
        }

        rucksackPacken(rucksackVolumen, gegenstaende, eingepackteGegenstaende, indexGegenstaende + 1, indexGepackt, volEingepackt);
    }
}
