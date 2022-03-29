import java.util.ArrayList;


public class SubnettingCalculator {

    public static void main(String[] args) {
        ArrayList<String> binaryList = new ArrayList<>();
        int subnetzNr = 8;
        int einsenAnzahl = subnetzNr;

        for (int i = 0; i < 4; i++) {
            //Vier Teile
            String teil = "";

            //1 in Subnetzmaske
            int tmpEinsen = einsenAnzahl;
            if(tmpEinsen >= 8){
                tmpEinsen = 8;
            }
                for (int j = 0; j <  tmpEinsen; j++) {
                    teil += "1";
                }


            //Rest mit 0 auffüllen
            if(teil.length() < 8) {
                for (int j = teil.length(); j < 8; j++) {
                    teil += "0";
                }
            }

            if(!(einsenAnzahl - 8 < 0)) {
                einsenAnzahl -= 8;
            }else{
                einsenAnzahl = 0;
            }
            binaryList.add(teil);
        }

        //Ausgabe Strings + kompletten String
        String completed = "";

        for (String binS: binaryList) {
            int bin = Integer.parseInt(binS,2);
            completed += bin + ".";
        }

        //Letzten Punkt entfernen
        completed = completed.substring(0,completed.length() - 1);

        //Ausgabe
        System.out.println(completed);
    }

}