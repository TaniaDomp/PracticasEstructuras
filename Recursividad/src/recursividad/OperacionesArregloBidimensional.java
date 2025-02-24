package recursividad;
/**Tania Ariadna Dominguez Palma
 * 27/mar/2022
 * Clase que contiene metodos recursivos apra manejar la informacion de una matriz
 */
public class OperacionesArregloBidimensional {
    
    private static double sumaPorRenglon(double[][] mat, int ren, int n, int i, double sum){
        if(i < n){
            return sumaPorRenglon(mat, ren, n, i + 1, sum + mat[ren][i]);
        }
        else{
            return sum;
        }
    }
    
    public static double sumaPorRenglon(double[][] mat, int ren, int n){
        return sumaPorRenglon(mat, ren, n, 0, 0);
    }
    
    private static double sumaMatrizRenglon(double[][] mat, int n, int m, int i, int j, double sum){
        if(j == m){
            return sum;
        }
        else{
            return sumaMatrizRenglon(mat, n, m, i + 1, j + 1, sum + sumaPorRenglon(mat, i, n));
        }
    }
    
    public static double sumaMatrizReng(double[][]mat, int n, int m){
        return sumaMatrizRenglon(mat, n, m, 0, 0, 0);
    }
    
    private static double sumaPorColumna(double[][] mat, int col, int m, int j, double sum){ 
        if(j < m){
            return sumaPorColumna(mat, col, m, j + 1, sum + mat[j][col]);
        }
        else{
            return sum;
        }
    }
    
    public static double sumaPorColumna(double[][] mat, int col, int m){
        return sumaPorColumna(mat, col, m, 0, 0);
    }
    
    private static double sumaMatrizColum(double[][] mat, int m, int n, int i, int j, double sum){
        if (i == n){
            return sum;
        }
        else{
            return sumaMatrizColum(mat, m, n, i + 1, j + 1, sum + sumaPorColumna(mat, j, m));
        }
    }
    
    public static double sumaMatrizColum(double[][] mat, int m, int n){
        return sumaMatrizColum(mat, m, n, 0, 0, 0);
    }
    
    private static String toString(double [][]mat, int m, int n, int j, int i, StringBuilder cad){
        if(j ==  m){
            return cad.toString();
        }
        else{
            if(i < n){
                cad.append("\t" + mat[j][i]);
                return toString(mat, m, n, j, i + 1, cad);
            }
            else{
                cad.append("\n");
                return toString(mat, m, n, j + 1, 0, cad);
            }
        }
    }
    
    public static String toString(double [][]mat, int m, int n){
         return toString(mat, m, n, 0, 0, new StringBuilder());
    }
    
    private static double sumaDiagonalPrincipal(double[][] mat, int mn, int ji, double sum){
        if(ji < mn){
            return sumaDiagonalPrincipal(mat, mn, ji + 1, sum + mat[ji][ji]);
        }
        else{
            return sum;
        }
    }
    
    public static double sumaDiagonalPrincipal(double[][]mat, int mn){
        if(mat == null){
            throw new RuntimeException("Matriz sin elementos");
        }
        else{
            return sumaDiagonalPrincipal(mat, mn, 0, 0);
        }
    }
    
    private static double[][] sumaMatrices(double[][]mat1, double[][]mat2, int m, int n, int j, int i, double[][] mat){
        if(j ==  m){
            return mat;
        }
        else{
            if(i < n){
                mat[j][i] = mat1[j][i] +  mat2[j][i];
                return sumaMatrices(mat1, mat2, m, n, j, i + 1, mat);
            }
            else{
                return sumaMatrices(mat1, mat2, m, n, j + 1, 0, mat);
            }
        }
    }
    
    public static double[][] sumaMatrices(double[][]mat1, double[][]mat2, int m1, int n1, int m2, int n2){
        double[][]mat = null;
        
        if(m1 == m2 && n1 == n2){
            mat = new double[m1][n1];
            return sumaMatrices(mat1, mat2, m1, n1, 0, 0, mat);
        }
        else{
            return mat;
        }
    }
    
    private static double[][] multiDosMat(double[][]mat1, double[][]mat2, int m1, int n1, int n2, int j, int i, int k, double[][]mat){
        if(j == m1){
            return mat;
        }
        else{
            if(i < n1){
                if(k < n2){
                    mat[j][k] += mat1[j][i] * mat2[i][k];
                    return multiDosMat(mat1, mat2, m1, n1, n2, j, i, k + 1, mat);
                }
                else{
                    return multiDosMat(mat1, mat2, m1, n1, n2, j, i + 1, 0, mat);
                }
            }
            else{
                return multiDosMat(mat1, mat2, m1, n1, n2, j + 1, 0, 0, mat);
            }
        }
    }
    
    public static double[][] multiDosMat(double[][]mat1, double[][]mat2, int m1, int n1, int m2, int n2){
        double[][] mat = null;
        
        if(n1 == m2){
            mat = new double[m1][n2];
            return multiDosMat(mat1, mat2, m1, n1, n2, 0, 0, 0, mat);
        }
        else{
            return mat;
        }
    }
}