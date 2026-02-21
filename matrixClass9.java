import java.util.Arrays;

class Matrix {
    private double[][] data;
    private int rows;
    private int cols;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.data = new double[rows][cols];
    }

    public Matrix(double[][] data) {
        this.rows = data.length;
        this.cols = data[0].length;
        this.data = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            if (data[i].length != cols)
                throw new IllegalArgumentException("All rows must have the same length.");
            this.data[i] = Arrays.copyOf(data[i], cols);
        }
    }

    public Matrix transpose() {
        Matrix result = new Matrix(cols, rows);
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result.data[j][i] = data[i][j];
        return result;
    }

    public Matrix addition(Matrix m1) {
        if (this.rows != m1.rows || this.cols != m1.cols)
            throw new IllegalArgumentException("Matrix dimensions must match for addition.");

        Matrix result = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result.data[i][j] = this.data[i][j] + m1.data[i][j];
        return result;
    }
    public Matrix additions(Matrix m2)
    {
        Matrix result=new Matrix(rows,cols);
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                result.data[i][j]= this.data[i][j]+m2.data[i][j];
            }
        }
        return result;

    }

    public Matrix subtraction(Matrix m1) {
        if (this.rows != m1.rows || this.cols != m1.cols)
            throw new IllegalArgumentException("Matrix dimensions must match for subtraction.");

        Matrix result = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result.data[i][j] = this.data[i][j] - m1.data[i][j];
        return result;
    }

    public Matrix subtractions(Matrix m2)
    {
        Matrix result=new Matrix(rows,cols);
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                result.data[i][j]= this.data[i][j]-m2.data[i][j];
            }
        }
        return result;

    }

    public Matrix multiplication(Matrix m1) {
        if (this.cols != m1.rows)
            throw new IllegalArgumentException("Matrix multiplication not valid (A.cols != B.rows)");

        Matrix result = new Matrix(this.rows, m1.cols);
        for (int i = 0; i < result.rows; i++) {
            for (int j = 0; j < result.cols; j++) {
                //for (int k = 0; k < this.cols; k++) {
                    result.data[i][j] = this.data[i][j] * m1.data[i][j];
                //}
            }
        }
        return result;
    }
    public Matrix multiplications(Matrix m2)
    {
        Matrix result=new Matrix(rows,cols);
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                result.data[i][j]= this.data[i][j]*m2.data[i][j];
            }
        }
        return result;

    }

    public Matrix inverse() {
        if (rows != cols)
            throw new UnsupportedOperationException("Inverse only defined for square matrices.");

        int n = rows;
        Matrix aug = new Matrix(n, 2 * n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                aug.data[i][j] = this.data[i][j];
            aug.data[i][i + n] = 1;
        }

        for (int i = 0; i < n; i++) {
            double pivot = aug.data[i][i];
            if (pivot == 0)
                throw new ArithmeticException("Matrix is singular and cannot be inverted.");

            for (int j = 0; j < 2 * n; j++)
                aug.data[i][j] /= pivot;

            for (int k = 0; k < n; k++) {
                if (k != i) {
                    double factor = aug.data[k][i];
                    for (int j = 0; j < 2 * n; j++) {
                        aug.data[k][j] -= factor * aug.data[i][j];
                    }
                }
            }
        }

        Matrix inverse = new Matrix(n, n);
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                inverse.data[i][j] = aug.data[i][j + n];
        return inverse;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (double[] row : data) {
            for (double val : row)
                sb.append(String.format("%8.3f ", val));
            sb.append("\n");
        }
        return sb.toString();
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public double[][] getData() {
        return data;
    }
}

public class matrixClass9{
    public static void main(String[] args) 
    {
        double[][] a = {
            {1, 2},
            {3, 4}
        };

        double[][] b = {
            {5, 6},
            {7, 8}
        };

        Matrix m1 = new Matrix(a);
        Matrix m2 = new Matrix(b);

        System.out.println("Matrix 1:\n" + m1);
        System.out.println("Matrix 2:\n" + m2);

        System.out.println("Addition m1+m1 :\n" + m1.addition(m1));
        System.out.println("Addition m1+m2 :\n"+ m1.additions(m2));
        System.out.println("Subtraction m1-m1 :\n" + m1.subtraction(m1));
        System.out.println("Subtraction m1-m2 :\n" + m1.subtractions(m2));
        System.out.println("Multiplication m1*m1:\n" + m1.multiplication(m1));
        System.out.println("Multiplication m1*m2:\n" + m1.multiplications(m2));
        System.out.println("Transpose of Matrix 1:\n" + m1.transpose());

        try {
            System.out.println("Inverse of Matrix 1:\n" + m1.inverse());
        } catch (ArithmeticException e) {
            System.out.println("Matrix 1 is not invertible.");
        }
    }
}
