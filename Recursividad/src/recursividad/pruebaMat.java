package recursividad;
/***Tania Ariadna Dominguez Palma
 * 27/mar/2022
 * Clase que prueba la clase OperacionesArregloBidimensional
 */
public class pruebaMat {
    
    public static void main(String[] args) {
        double [ ][ ] mat  = {{5,4,7,9}, {1,2,3,4}, {8,5,3,10}};
	double [ ][ ] mat2  = {{5,4,7,9}, {1,7,3,9}, {8,5,3,10}};
        double [ ][ ] mat3  = {{5.0,4.0,7.0}, {1.0,7.0,3.0}, {8.0,5.0,3.0}};
        double [ ][ ] matP = {{5.0,4.0,7.0}, {1.0,7.0,3.0}, {8.0,5.0,3.0}};
        double [ ][ ] matP2 = {{10.0,4.0,7.0}, {1.0,10.0,3.0}, {8.0,5.0,10.0}};
        String[][] mat4 = {{"V", "X"}, {"A", "S"}, {"M", "L"}, {"B", "L"}};
        double[][] sum1 = {{ 2, 0, 1}, { 3, 0, 0 }, { 5, 1, 1 }};
	double[][] sum2 = {{ 1, 0, 1}, { 1, 2, 1 }, { 1, 1, 0 }};
        double[][] matMul, matMul2, sumS, sumS1;
        double[][] multi1 = { { 1, 2, -3 }, { 4, 0, -2 } };
        double[][] multi2 = { { 3, 1 }, { 2, 4 }, { -1, 5 } };
        double[][] multi3 = { { 1, 0, 3 }, { 2, -1, -2 } };
        double[][] multi4 = { { -2, 4, 2}, { 1, 0, 0 }, { -1, 1, -1 } };
        
        //System.out.println(OperacionesArregloBidimensional.sumaPorColumna(mat, 0, 3));
        //System.out.println(OperacionesArregloBidimensional.sumaPorColumna(mat2, 1, 3));
        //System.out.println(OperacionesArregloBidimensional.sumaPorRenglon(mat, 0, 4));
        //System.out.println(OperacionesArregloBidimensional.sumaPorRenglon(mat2, 1, 4));
        //System.out.println(OperacionesArregloBidimensional.toString(mat3, 3, 3));
        //System.out.println(OperacionesArregloBidimensional.toString(mat4, 4, 2));
        //System.out.println(OperacionesArregloBidimensional.sumaDiagonalPrincipal(matP, 3));
        //System.out.println(OperacionesArregloBidimensional.sumaDiagonalPrincipal(matP2, 3));
        /*sumS = OperacionesArregloBidimensional.sumaMatrices(sum1, sum2, 3, 3, 3, 3);
        System.out.println(OperacionesArregloBidimensional.toString(sumS, 3, 3));
        sumS1 = OperacionesArregloBidimensional.sumaMatrices(mat, mat2, 3, 4, 3, 4);
        System.out.println(OperacionesArregloBidimensional.toString(sumS1, 3, 4));*/
        matMul = OperacionesArregloBidimensional.multiDosMat(multi1, multi2, 2, 3, 3, 2);
        System.out.println(OperacionesArregloBidimensional.toString(matMul, 2, 2));
        matMul2 = OperacionesArregloBidimensional.multiDosMat(multi3, multi4, 2, 3, 3, 3);
        System.out.println(OperacionesArregloBidimensional.toString(matMul2, 2, 3));
        /*System.out.println(OperacionesArregloBidimensional.sumaMatrizReng(mat, 4, 3));
        System.out.println(OperacionesArregloBidimensional.sumaMatrizColum(mat, 3, 4));*/
    }
}
