public class MCS {

    public static int maxSubsequenceSum_linear (int[] a) // Cost O(N)
    {
        int maxSum = Integer.MIN_VALUE; // En cas de que la cadena fos tota negativa asignem el valor minim que pot tindre un int
        int thisSum = 0; // Variable per portar el sumatori de cada recorregut
        int seqStart = 0; // Inici seqüència amb valor màxim més gran
        int seqEnd = 0; // Final seqüència amb valor màxim més gran
        int numIte = 0; // Comptador de iteracions
        int i = 0; // Índex de la posició inicial del array amb la seqüència amb valor màxim més gran
        for (int j = i; j < a.length; j++) // S'incrementa 'j' per recorre l'array. Cost O(N)
        {
            numIte++; // Cada vegada que es recorri el bucle s'incrementa en 1 les iteracions
            thisSum += a[j]; // Suma el valor al sumatori del recorregut actual
            if (thisSum > maxSum) // Si en el recorregut actual es troba un valor més gran que el que es tenia, es sobreescriu el nou valor màxim
            {
                maxSum = thisSum;
                seqStart = i;
                seqEnd = j;
            }

            if (thisSum < 0) { // En el moment en què el sumatori en algun moment sigui negatiu, no pot ser una opció correcta, perquè el pròxim número no negatiu que se sumi començarà sumant en negatiu. Agafant el següent nombre positiu ja s'arribarà a un nombre més gran que el recorregut anterior.
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
        // El mateix que en el lineal
        int maxSum = Integer.MIN_VALUE;
        int thisSum;
        int seqStart = 0;
        int seqEnd = 0;
        int numIte = 0;
        // El mateix que en el lineal

        for (int i = 0; i < a.length; i++) // Bucle que incrementa el inici d'on fem la suma. Cost O(N)
        {
            numIte++;
            thisSum = 0; // Reinicalitzem la suma cada vegada que cambiem d'inici
            for (int j = i; j < a.length; j++) // Recorrem tot l'array a partir de la posició que indica 'i'. Cost O(N)
            {
                numIte++;
                thisSum += a[j]; // Sumem el valor que es troba en aquesta posició de l'array al sumatori de l'actual recorregut
                if (thisSum > maxSum) // El mateix que al lineal
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
