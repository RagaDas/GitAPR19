public class Math {
    public int Add(int x, int y){
        int Sum = x+y;
        return Sum;
    }

    public int Subtract(int x, int y){
        int Diff = x+y;
        return Diff;
    }
    public static void main(String args[]){
        Math M = new Math();
        int Result = M.Add(5,3);
        System.out.println(Result);
        int Result = M.Subtract(5,3);
        System.out.println(Result);
    }
}
