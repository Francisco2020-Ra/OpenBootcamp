package FirstPart;

public class FirstPart {
    private static final String mesagge = "Program that asks for three numerical values and adds them", c ="-";

    public static void main(String[] args) {
        System.out.println(c.repeat(mesagge.length()) + mesagge + c.repeat(mesagge.length()));
        add(1,3,4);
    }

    private static void add(int firstValue, int secondValue, int thirdValue){
        System.out.println(firstValue + secondValue + thirdValue);
    }

}
