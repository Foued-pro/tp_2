import clavier.In;
public class Ihm1 {
    public static void main(String[] args) {
        //affichage
        System.out.print("Entre un numero : ");

        //saisie
        String numero ;
        numero = In.readString();
        //definition
        String indicatif = numero.substring(0,2);
        String departamental = numero.substring(2,4);
        String resultatRegion ="erreur Region";
        String resultatDepartamental="erreur département";


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
            }
            System.out.println("la region est :" + resultatRegion);
            System.out.println("le departement est :" + resultatDepartamental);
        }else{
            System.out.println("Votre numero n'est pas egale a 10,la votre est de longueur "+numero.length());
        }
    }
}
