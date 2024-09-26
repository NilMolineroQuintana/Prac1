public class MCS {

    public static int maxSubsequenceSum_linear (int[] a) // Cost O(N)
    {
        int maxSum = Integer.MIN_VALUE; // En cas de que la cadena fos tota negativa asignem el valor minim que pot tindre un int
        int thisSum = 0; // Variable per portar el recompte de cada suma
        int seqStart = 0; // Inici seqüència més gran
        int seqEnd = 0; // Final seqüència més gran
        int numIte = 0; // Comptador de iteracions
        int i = 0; // Index per recorrer l'array
        for (int j = i; j < a.length; j++) // S'incrementa j per tal de que i serveixi per marcar l'inici de la suma més gran. Cost O(N)
        {
            numIte++;
            thisSum += a[j]; // Suma el valor
            if (thisSum > maxSum)
            {
                maxSum = thisSum;
                seqStart = i;
                seqEnd = j;
            }

            if (thisSum < 0) { // Si la suma ja es negativa, començem de 0 perquè el nombre no podrà ser més negatiu si volem la suma més gran
                thisSum = 0; // Reinicialtizem
                i = j + 1; // Incrementem l'index de l'inici de la suma de l'array ja que volem trobar un millor inici de suma
            }
        }
        // Debug
        System.out.println("Solucion de orden linear");
        System.out.println("Maximo: " + maxSum);
        System.out.println("Inicio: " + seqStart + " Final: " + seqEnd);
        System.out.println("Numero de iteraciones: " + numIte);
        return maxSum;
    }
    public static int maxSubsequenceSum_quadratic (int[] a) // Cost O(N²)
    {
        // Matèix que a lineal
        int maxSum = Integer.MIN_VALUE;
        int thisSum;
        int seqStart = 0;
        int seqEnd = 0;
        int numIte = 0;
        // Matèix que a lineal

        for (int i = 0; i < a.length; i++) // Bucle que incrementa el inici d'on fem la suma. Cost O(N)
        {
            numIte++;
            thisSum = 0; // Reinicalitzem la suma cada vegada que cambiem d'inici
            for (int j = i; j < a.length; j++) // Recorrem tot l'array a partir del inici de on 'i' defineix l'inici de la suma. Cost O(N)
            {
                numIte++;
                thisSum += a[j]; // Sumem el valor que es troba en aquesta posició de l'array
                if (thisSum > maxSum)
                {
                    maxSum = thisSum;
                    seqStart = i;
                    seqEnd = j;
                }
            }
        }
        // Debug
        System.out.println("Solucion de orden cuadratico");
        System.out.println("Maximo: " + maxSum);
        System.out.println("Inicio: " + seqStart + " Final: " + seqEnd);
        System.out.println("Numero de iteraciones: " + numIte);
        return maxSum;
    }
}
