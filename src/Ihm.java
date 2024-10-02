import clavier.In;
public class Ihm {
    public static void main(String[] args) {
        //affichage
        System.out.print("Entre un numero : ");

        //saisie
        String numero ;
        numero = In.readString();

        //definition
        String indicatif = numero.substring(0,2);


        //traitement  pour zone geographiques
        if (numero.length() ==10) {
            switch (indicatif){
                case "01":
                    System.out.println("Region parisienne");
                    break;
                case "02":
                    System.out.println("Region Nord Ouest");
                    break;
                case "03":
                    System.out.println("Region Nord Est");
                    break;
                case "04":
                    System.out.println("Region Sud Est");
                    break;
                case "05":
                    System.out.println("Region Sud Ouest");
                    break;
            }
        }else{
            System.out.println("Votre numero n'est pas egale a 10,la votre est de longueur "+numero.length());
        }
    }
}
