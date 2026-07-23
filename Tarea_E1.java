import java.util.Scanner;

public class Tarea_E1{
    public static void main(String[] args)
     {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese de cuantos números a ser el array: ");
        int cantidad = scan.nextInt();

        int array[]= new int[cantidad];

        for(int i = 0; i < cantidad; i++)
        {
            System.out.print("Ingrese un número: ");
            array[i] = scan.nextInt();
        }

        System.out.print("Ingresa una opción, 1. Número Mayor 2. Número Menor 3. Ordenar Array: ");
        int decision = scan.nextInt();

        if(decision == 1) System.out.print("El número mayor del array es: " + mayormenor( array, cantidad, decision));
        else if (decision == 2) System.out.print("El número menor del array es: " + mayormenor(array, cantidad, decision));
        else ordenarMayor(array, cantidad);

        scan.close();
        }

     public static int mayormenor(int numeros[], int cantidad, int decision)
     {
        int temproral = 0;
        
        for(int i = 0; i < cantidad - 1; i++)
        {
            for (int j = 0; j < cantidad - i - 1; j++)
            {
                if (numeros[j] > numeros[j + 1])
                {
                    temproral = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temproral;
                }
            }
        }

        if(decision == 1) return numeros[cantidad-1];
        else return numeros[0];
    }
    public static void ordenarMayor(int numeros[], int cantidad)
     {
        int temproral = 0;
        
        for(int i = 0; i < cantidad - 1; i++)
        {
            for (int j = 0; j < cantidad - i - 1; j++)
            {
                if (numeros[j] > numeros[j + 1])
                {
                    temproral = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temproral;
                }
            }
        }
        System.out.println("El array esta ordenado de menor a mayor: \n");
        for(int i = 0; 1 < cantidad; i++)
        {
            System.out.println(numeros[i]);
            System.err.println(" ");
        }
    }
}