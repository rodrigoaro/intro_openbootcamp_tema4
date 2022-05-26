public class EjerciciosTema4 {

    public static void main(String[] args){

        //Lógica IF
        int numeroIf = 4;
        if(numeroIf > 0) {
            System.out.println("numeroIf es positivo");
        }
        else if(numeroIf < 0){
            System.out.println("numeroIf es negativo");
        }else{
            System.out.println("numeroIf es cero");
        }

        //Lógica WHILE
        int numeroWhile = 0;
        while (numeroWhile < 3){
            numeroWhile++;
            System.out.println("numeroWhile: "+numeroWhile);
        }

        //Lógica DO-WHILE
        int numeroDoWhile = 0;
        do {
            numeroDoWhile++;
            System.out.println("numeroDoWhile: "+numeroDoWhile);
        } while (numeroDoWhile < 1);

        //Lógica FOR
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println("numeroFor: "+ numeroFor);
        }

        //Lógica SWITCH
        String estacion = "otoño";
        switch (estacion) {
            case "Verano":
                System.out.println("La estación actual es verano");
                break;
            case "Otoño":
                System.out.println("La estación actual es otoño");
                break;
            case "Invierno":
                System.out.println("La estación actual es invierno");
                break;
            case "Primavera":
                System.out.println("La estación actual es primavera");
                break;
            default:
                System.out.println("La variable ingresada no es una estación del año");
                break;
        }
    }
}
