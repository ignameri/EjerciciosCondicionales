public class Main {
    public static void main(String[] args)
    {

        int numeroIf = 0;

        if (numeroIf < 0){
            System.out.println("El valor es NEGATIVO");
        }
        else if (numeroIf > 0){
            System.out.println("El valor es POSITIVO");
        }
        else {
            System.out.println("El valor es 0");
        }


        int numeroWhile=0;

        while (numeroWhile<3)
        {
            numeroWhile = numeroWhile + 1;
            System.out.println(numeroWhile);
        }

        int numeroDo = 2;
        do {
            numeroDo = numeroDo + 1;
            System.out.println(numeroDo);
        }while (numeroDo<3);



        for (int numeroFor=0; numeroFor <= 3 ; numeroFor++ )
        {
            System.out.println(numeroFor);
        }


        var estacion = "invierno";

        switch (estacion)
        {
            case "verano":
                System.out.println("Estas en VERANO");
                break;
            case "invierno":
                System.out.println("Estas en INVIERNO");
                break;
            case "otoño":
                System.out.println("Estas en OTOÑO");
                break;
            case "primavera":
                System.out.println("Estas en PRIMAVERA");
                break;
            default:
                System.out.println("No es ninguna ESTACION");
        }

    }
}