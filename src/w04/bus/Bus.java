package w04.bus;

import java.util.Arrays;

public class Bus {
    Fahrer[] busfahrer = new Fahrer[2];
    Passagier[][] passagiere = new Passagier[10][4];

    public boolean bookAndBoard(Passagier pass, int row, int column){
        boolean successBool = false;
        if (row >= 0 && row < passagiere.length && column >= 0 && column < passagiere[0].length){
            if (passagiere[row][column] == null){
                successBool = true;
                passagiere[row][column] = pass;
            }
        }
        return successBool;
    }

    public boolean prepareForDeparture(Fahrer fahrer){
        boolean successBool = false;
        for(int i = 0; i < busfahrer.length; i++){
            if (busfahrer[i] == null){
                successBool = true;
                busfahrer[i] = fahrer;
                break;
            }
        }

        return successBool;
    }

    public int ride(){
        int money = 0;
        for(int i = 0; i < busfahrer.length; i++){
            if (busfahrer[i] == null){
                throw new NotReadyForDepartureException();
            }
        }
        for (int i = 0; i < passagiere.length; i++) {
            for (int j = 0; j < passagiere[i].length; j++) {
                if (passagiere[i][j] != null){
                    money += passagiere[i][j].getPayedPrice();
                }
            }
        }
        return money;
    }

    @Override
    public String toString() {
        String retStr = "";
        for (int i = 0; i < passagiere.length; i++){
            for (int j = 0; j < passagiere[i].length; j++){
                retStr += passagiere[i][j] + " ";
            }
            retStr += "\n";
        }

        return retStr;
    }
}
