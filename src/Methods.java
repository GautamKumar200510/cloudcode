public class Methods {
    public static void main (String [] args){
        Methods mt = new Methods();
        System.out.println(mt.addNum(5,5));
    }

    public int addNum(int num1, int num2){
        int sum = num1+num2;
        return sum;
    }
}
