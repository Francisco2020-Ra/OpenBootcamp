package ExerciseItem4;

public class ExerciseItem4 {

    public static void main(String[] args) {
        System.out.println("\nEXECUTING THE \"IF\" STATEMENT");
        var numberIf = 0;
        if(numberIf>0){
            System.out.println("The number " + numberIf +" is positive\n");
        }else {
            System.out.println("The number " + numberIf +" is negative\n");
        }

        System.out.println("EXECUTING THE \"WHILE\" STATEMENT");
        var numberWhile = 0;
        while(numberWhile<3){
            System.out.println(numberWhile);
            numberWhile++;
        }

        System.out.println("\nEXECUTING THE \"DO-WHILE\" STATEMENT");
        do{
            System.out.println(numberWhile);
        }while(false);

        System.out.println("\nEXECUTING THE \"FOR\" STATEMENT");
        var numberFor = 0;
        for(int i = 0; numberFor<=3; i++){
            System.out.println(numberFor);
            numberFor++;
        }

        System.out.println("\nEXECUTING THE \"SWITCH\" STATEMENT");
        var season = "SUMMER";
        switch (season){
            case "SUMMER":
                System.out.println("The season is " + season);
                break;
            case "SPRING":
                System.out.println("The season is " + season);
                break;
            case "AUTUMN":
                System.out.println("The season is " + season);
                break;
            case "WINTER":
                System.out.println("The season is " + season);
                break;
            default:
                System.out.println("The season does not exist");
        }
    }


}
