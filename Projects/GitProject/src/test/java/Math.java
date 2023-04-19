public class Math {
    public int Add(int x, int y){
        int Sum = x+y;
        return Sum;
    }
    public static void main(String args[]){
        Math M = new Math();
        int Result = M.Add(5,3);
        System.out.println(Result);

    }
}
