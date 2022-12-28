package SOLID_Principles.OpenClosed;

public class Main {
    public static void main(String args[]){
        Operation addOperation = new AddOperation();
        Calculator cal = new Calculator();
        int sum = cal.calculateNumber(5, 6, addOperation);
        System.out.println(sum);
    }
}
