public class MCS {

    public static int maxSubsequenceSum_linear (int[] a)
    {
        int maxSum = 0;
        int thisSum;
        int seqStart = 0;
        int seqEnd = 0;
        int numIte = 0;
        for (int i = 0; i < a.length; i++)
        {
            numIte++;
        }
        return 0;
    }
    public static int maxSubsequenceSum_quadratic (int[] a){
        int maxSum = 0;
        int thisSum;
        int seqStart = 0;
        int seqEnd = 0;
        int numIte = 0;
        for (int i = 0; i < a.length; i++)
        {
            numIte++;
            thisSum = 0;
            for (int j = i; j < a.length; j++)
            {
                numIte++;
                thisSum += a[j];
                if (thisSum > maxSum)
                {
                    maxSum = thisSum;
                    seqStart = i;
                    seqEnd = j;
                }
            }
        }
        System.out.println("Solucion de orden cuadratico");
        System.out.println("Maximo: " + maxSum);
        System.out.println("Inicio: " + seqStart + " Final: " + seqEnd);
        System.out.println("Numero de iteraciones: " + numIte);
        return maxSum;
    }
    public static int maxSubsequenceSum_cubic (int [] a){
        int maxSum = 0;
        int thisSum;
        int seqStart = 0;
        int seqEnd = 0;
        int numIte = 0;
        for (int i=0; i < a.length; i++){
            numIte += 1;
            for (int j=i; j < a.length; j++){
                numIte += 1;
                thisSum = 0;
                for (int k = i; k <= j; k++){
                    numIte += 1;
                    thisSum += a[k];
                }
                if (thisSum > maxSum){
                    maxSum = thisSum;
                    seqStart = i;
                    seqEnd = j;
                }
            }
        }
        System.out.println("Solucion de orden cubico");
        System.out.println("Maximo: " + maxSum);
        System.out.println("Inicio: " + seqStart + " Final: " + seqEnd);
        System.out.println("Numero de iteraciones: " + numIte);
        return maxSum;
    }
}
