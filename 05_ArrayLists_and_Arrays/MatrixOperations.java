/**
 * An example of using 2D arrays to perform
 * matrix operations (addition, scalar, and transpose)
 * @version Feb 14
 */

public class MatrixOperations
{
    public static void main(String [] args)
    {
        int [][] matrix1 = new int[2][3];
        int [][] matrix2 = new int[5][6];
        int [][] matrix3 = new int[2][3];
        int [][] result;    //result


        //initialize and print each array
        initializeMatrix(matrix1);
        System.out.println("Matrix 1:");
        print(matrix1);

        initializeMatrix(matrix2);
        System.out.println("Matrix 2:");
        print(matrix2);        

        initializeMatrix(matrix3);
        System.out.println("Matrix 3:");
        print(matrix3);

        //add matrices
        // result = addMatrix(matrix1, matrix3);
        // if(result == null)
        // {
        //     System.out.println("Not the same size, cannot add");
        // }
        // else
        // {
        //     System.out.println("result:");
        //     print(result);
        // }

        System.out.println("Transpose");
        result = transposeMatrix(matrix3);
        print(result);
    }

    /**
     * Initializes a matrix with random values between
     * 5 and 25
     */
    public static void initializeMatrix(int [][] matrix)
    {
        for(int r = 0; r < matrix.length; r++)  //rows (first array)
        {
            for(int c = 0; c < matrix[r].length; c++) //columns (each array element)
            {
                matrix[r][c] = (int)(Math.random() * 21+5);
            }
        }
    }

    /**
     * Print a 2D array as a grid
     */
    public static void print(int [][] matrix)
    {
        for(int [] row : matrix)
        {
            for(int element : row)
            {
                System.out.print(element + "\t");
            }
            System.out.println("");
        }
    }

    /**
     * Performs matrix addition
     * @param m1 the first matrix
     * @param m2 the second matrix
     * @return the result of adding the two matrices if they are the same size; null otherwise
     */
    public static int [][] addMatrix(int [][] m1, int [][] m2)
    {
        //can only add two matrices together if they are the same
        //size - guaranteed to be rectangular
        int [][] result;
        if(m1.length == m2.length && m1[0].length == m2[0].length)
        {
            result = new int[m1.length][m1[0].length];

            //loop through the arrays and add the two elements together
            for(int r = 0; r < m1.length; r++)
            {
                for(int c = 0; c < m1[r].length; c++)
                {
                    result[r][c] = m1[r][c] + m2[r][c];
                }
            }
        }
        else
        {
            result = null;  //return null since nothing can be done.
        }

        return result;
    }

    /**
     * FINISH:
     * Scalar multiplication - multiplies the contents of a matrix by a value
     */
    public static int [][] scalarMultiplication(int scalar, int [][] matrix)
    {
        int [][] product = new int[matrix.length][matrix[0].length];

        for(int r = 0; r < product.length; r++)
        {
            for(int c = 0; c < product[r].length; c++)
            {
                product[r][c] = matrix[r][c] * scalar;
            }

        }
        return product;
    }

    /**
     * Try this!:
     * Transpose a matrix - turn the rows into columns and vice versa
     */
    public static int [][] transposeMatrix(int [][] matrix)
    {
        int [][] transpose = new int[matrix[0].length][matrix.length];

        for(int r = 0; r < transpose.length; r++)
        {
            for(int c = 0; c < transpose[r].length; c++)
            {
                transpose[r][c] = matrix[c][r];
            }
        }
        return transpose;
    }    
}