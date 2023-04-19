public class Math {
    public int Add(int x, int y){
        int Sum = x+y;
        return Sum;
    }

    public int Subtract(int x, int y){
        int Diff = x-y;
        return Diff;
    }
    public int Multiply(int x, int y){
        int Product = x*y;
        return Product;
    }

    public int Division(int x, int y){
        int Quotient = x*y;
        return Quotient;
    }
    public static void main(String args[]){
        Math M = new Math();
        int Result1 = M.Add(5,3);
        System.out.println(Result1);
        int Result2 = M.Subtract(5,3);
        System.out.println(Result2);
        int Result3 = M.Multiply (5,3);
        System.out.println(Result3);
    }
}
