import clavier.In;
public class Ihm3 {
    public static void main(String[] args) {
        //affichage
        System.out.print("Entre un numero : ");

        //saisie
        String numero ;
        numero = In.readString();
        //definition
        String indicatif = numero.substring(0,2);
        String departamental = numero.substring(2,4);
        String taxe = numero.substring(0,3);
        char numeroCourt = indicatif.charAt(0);
        String resultatRegion ="erreur Region";
        String resultatDepartamental="erreur département";
        String operateur ="erreur operateur";
        String portable="il n'y as pas d'information sur le type :" ;
        String court = "erreur";
        String tarif = "erreur tarif";

        //traitement
        if (numero.length() ==10) {
            switch (indicatif){
                case "01":
                    resultatRegion ="Region parisienne";
                    switch(departamental){
                        case "34":
                            resultatDepartamental ="Yvelines ou Val-d'Oise";
                            break;
                        case "39":
                            resultatDepartamental ="Yvelines";
                            break;
                        case "40":
                            resultatDepartamental ="Paris";
                            break;
                        case "41":
                            resultatDepartamental ="Hauts-de-Seine ou Val-d'Oise";
                            break;
                        case "42":
                            resultatDepartamental ="Paris ou Hauts-de-Seine ou Seine-Saint-Denis";
                            break;
                        case "43":
                            resultatDepartamental ="Paris ou Val-de-Marne";
                            break;
                        case "44":
                            resultatDepartamental ="Paris";
                            break;
                        case "45":
                            resultatDepartamental ="Paris ou Val-de-Marne";
                            break;
                        case "46":
                            resultatDepartamental ="Paris ou Essone  ou Hauts-de-Seine";
                            break;
                        case "47":
                            resultatDepartamental ="Hauts-de-Seine";
                            break;
                    }
                    break;
                case "02":
                    resultatRegion="Region Nord Ouest";
                    switch(departamental){
                        case "37":
                            resultatDepartamental="Eure-et-Loire";
                            break;
                        case "38":
                            resultatDepartamental ="Loiret";
                            break;
                        case "14":
                            resultatDepartamental ="Calvados ou Manche ou Orne";
                            break;
                        case "31":
                            resultatDepartamental ="Calvados";
                            break;
                        case "40":
                            resultatDepartamental ="Loire-Atlantique";
                            break;
                        case "41":
                            resultatDepartamental ="Maine-et-Loir";
                            break;
                        case "43":
                            resultatDepartamental ="Mayenne ou Sarthe";
                            break;
                        case "48":
                            resultatDepartamental ="Cher";
                            break;
                        case "47":
                            resultatDepartamental ="Indre-et-Loire";
                            break;
                    }
                    break;
                case "03":
                    resultatRegion=("Region Nord Est");
                    switch(departamental){
                        case "27":
                            resultatDepartamental="Nord";
                            break;
                        case "22":
                            resultatDepartamental ="Somme";
                            break;
                        case "20":
                            resultatDepartamental ="Nord";
                            break;
                        case "21":
                            resultatDepartamental ="Pas-de-Calais";
                            break;
                        case "23":
                            resultatDepartamental ="Aisne";
                            break;
                        case "24":
                            resultatDepartamental = "Ardennes";
                            break;
                        case "26":
                            resultatDepartamental ="Marne";
                            break;
                        case "28":
                            resultatDepartamental ="Nord";
                            break;
                        case "44":
                            resultatDepartamental ="Oise";
                            break;
                    }
                    break;
                case "04":
                    resultatRegion ="Region Sud Ouest";
                    switch(departamental){
                        case "67":
                            resultatDepartamental ="Herault";
                            break;
                        case "72":
                            resultatDepartamental ="Rhone";
                            break;
                        case "70":
                            resultatDepartamental ="Allier";
                            break;
                        case "73":
                            resultatDepartamental ="Puys-de-Dome";
                            break;
                        case "74":
                            resultatDepartamental ="Ain";
                            break;
                        case "75":
                            resultatDepartamental ="Ardeche ou Drome";
                            break;
                        case "76":
                            resultatDepartamental ="Isere";
                            break;
                        case "77":
                            resultatDepartamental ="Loire";
                            break;
                        case "78":
                            resultatDepartamental ="Rhone";
                            break;
                        case "79":
                            resultatDepartamental ="Savoie";
                            break;
                    }
                    break;
                case "05":
                    resultatRegion ="Region Sud Est";
                    switch(departamental){
                        case "58":
                            resultatDepartamental ="Landes";
                            break;
                        case "57":
                            resultatDepartamental ="Girond";
                            break;
                        case "45":
                            resultatDepartamental ="Charente";
                            break;
                        case "46":
                            resultatDepartamental ="Charante Maritime";
                            break;
                        case "56":
                            resultatDepartamental ="Girond";
                            break;
                        case "59":
                            resultatDepartamental ="Pyrenne";
                            break;
                        case "90":
                            resultatDepartamental ="Guadeloupe";
                            break;
                        case "96":
                            resultatDepartamental ="Martinique";
                            break;
                        case "94":
                            resultatDepartamental ="Guyane";
                            break;
                    }
                    break;
                case "06":
                    portable="c est un numero portable" ;
                    switch(departamental){
                        case"01":
                            operateur ="Neuf Cegetel";
                        case"03":
                            operateur ="SFR";
                        case"05":
                            operateur ="Auchan Telecom";
                        case"07":
                            operateur ="Orange";
                        case"08":
                            operateur ="Orange";
                        case"09":
                            operateur ="SFR";
                        case"10":
                            operateur ="SFR";
                        case"11":
                            operateur ="SFR";
                        case"12":
                            operateur ="SFR";
                    }
                case "07":
                    portable = "c'est un numero portable" ;
                    break;
                case "08" :
                    switch(departamental) {
                        case "00":
                            tarif = "(numéros verts) gratuit";
                        case "01":
                            tarif = "(numéros verts) gratuit";
                        case "02":
                            tarif = "(numéros verts) gratuit";
                        case "03":
                            tarif = "(numéros verts) gratuit";
                        case "04":
                            tarif = "(numéros verts) gratuit";
                        case "05":
                            tarif = "(numéros verts) gratuit";
                        case "06":
                            tarif = "Numero gratuit";
                        case "07":
                            tarif = "Numero gratuit";
                        case "08":
                            tarif = "Numero gratuit";
                        case "09":
                            operateur = "Numero gratuit";
                    }
                case "09":
                    portable = "c'est un voix sur IP " ;
                break;
                }
            }System.out.println("la region est :" + resultatRegion);
            System.out.println("le departement est :" + resultatDepartamental);
            System.out.println("operateur est :" + operateur);
            System.out.println(portable);
            System.out.println(tarif);

            switch(taxe){
                case "081":
                    System.out.println("vous paierez au maximum 6 centimes d’euros la minute, ou 15 centimes d’euros l’appel.");
                    break;
                case "082":
                    System.out.println("vous paierez au maximum 20 centimes d’euros la minute, ou 50 centimes d’euros l’appel.");
                    break;
                case "089":
                    System.out.println("vous paierez au maximum 80 centimes d’euros la minute, ou 3 euros par l'appel.");
                    break;
            }
            if (numero.length()<7 || numero.length()>3){
                switch(indicatif){
                    case "30":
                        court = "tarification gratuite";
                        break;
                    case "31" :
                        court = "tarification gratuite";
                        break;
                    case "10":
                        court = "inférieur à 0.8 € la minute ou 3 € l'appel";
                }
                switch (numeroCourt)

            }
        }
    }
