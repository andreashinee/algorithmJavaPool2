import java.util.Scanner;

public class exercici2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Demanar a l'usuari les dimensions de la primera piscina
        System.out.print("Introdueix l'ample de la primera piscina: ");
        double ample1 = scanner.nextDouble();
        System.out.print("Introdueix la profunditat de la primera piscina: ");
        double profunditat1 = scanner.nextDouble();

        // Demanar a l'usuari les dimensions de la segona piscina
        System.out.print("Introdueix l'ample de la segona piscina: ");
        double ample2 = scanner.nextDouble();
        System.out.print("Introdueix la profunditat de la segona piscina: ");
        double profunditat2 = scanner.nextDouble();

        // Constant valor llarg
        double llarg = 300.3;

        // 1.L'àrea que ocupa cadascuna de les dues piscines

        double area1 = llarg * ample1;
        double area2 = llarg * ample2;

        // Arrodonir els resultats a números enters
        long area1Enter = Math.round(area1);
        long area2Enter = Math.round(area2);

        System.out.println("L'àrea que ocupa cadascuna de les dues piscines:");
        System.out.println("Àrea Piscina 1: " + area1Enter);
        System.out.println("Àrea Piscina 2: " + area2Enter);


        // 2.El volum d'aigua que pot allotjar cadascuna de les dues piscines

        double volum1 = llarg * ample1 * profunditat1;
        double volum2 = llarg * ample2 * profunditat2;

        // Arrodonir els resultats a números enters
        long volum1Enter = Math.round(volum1);
        long volum2Enter = Math.round(volum2);

        System.out.println("El volum d'aigua que pot allotjar cadascuna de les dues piscines:");
        System.out.println("Volum Piscina 1: " + volum1Enter);
        System.out.println("Volum Piscina 2: " + volum2Enter);


        // 3.Els valors d'ample i llarg de l'espai que ocuparien les dues piscines si les posem les dues una al costat de l'altre. Aquest             espai tindrà un llarg igual al de qualsevol d'elles (totes dues tenen el mateix llarg), i un ample resultant de sumar els dos amples.

        double ampleEspai = ample1 + ample2;

        System.out.println("Els valors d'ample i llarg de l'espai que ocuparien les dues piscines si les posem les dues una al costat de     l'altre:");
        System.out.println("Llarg total de l'espai: " + llarg);
        System.out.println("Ample total de l'espai: " + ampleEspai);

        // 4.L'àrea que ocuparien les dues piscines quan estan una al costat de l'altre.

        double areaTotal = llarg * ampleEspai;

        // Arrodonir els resultats a números enters
        long areaTotalEnter = Math.round(areaTotal);

        System.out.println("L'àrea que ocuparien les dues piscines quan estan una al costat de l'altre :");
        System.out.println("Volum Total: " + areaTotalEnter);


        // 5.El volum d'aigua que allotjarien entre les dues.

        double volumTotal = volum1 + volum2;

        // Arrodonir els resultats a números enters
        long volumTotalEnter = Math.round(volumTotal);

        System.out.println("El volum d'aigua que allotjarien entre les dues:");
        System.out.println("Volum Total: " + volumTotalEnter);

        // 6.El programa ha d'intercanviar1 els valors de profunditat de les dues piscines i tornar a calcular i mostrar el valor del volum         d'aigua que pot encabir cada piscina amb aquestes noves mides.

        double nouProfunditat1 = profunditat2;
        double nouProfunditat2 = profunditat1;

        double nouVolum1 = llarg * ample1 * nouProfunditat1;
        double nouVolum2 = llarg * ample2 * nouProfunditat2;

        // Arrodonir els resultats a números enters
        long nouVolum1Enter = Math.round(nouVolum1);
        long nouVolum2Enter = Math.round(nouVolum2);

        System.out.println(".El programa ha d'intercanviar1 els valors de profunditat de les dues piscines i tornar a calcular i mostrar el valor del volum d'aigua que pot encabir cada piscina amb aquestes noves mides:");

        System.out.println("Volum Piscina 1: " + nouVolum1Enter);
        System.out.println("Volum Piscina 2: " + nouVolum2Enter);

        scanner.close();

    }
}
