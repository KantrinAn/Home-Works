import java.util.Random;

public class Homework9 {
    public static void main(String[] args) {
        int[] arrTeamOne = new int[25];
        int[] arrTeamTwo = new int[25];
        int sum =0;
        Random random = new Random();

        for (int i = 0; i < arrTeamOne.length; i++ ){
            arrTeamOne[i] = (int)(Math.random() * 18 + 22);

        }
        for (int j = 0; j < arrTeamTwo.length; j++ ){
            arrTeamTwo[j] = (int)(Math.random() * 18 + 22);

        }
        for (int i = 0; i < arrTeamOne.length;  i++) {
            System.out.print(arrTeamOne[i] + " ");
            sum += arrTeamOne[i];

        }
        int averageAgeTeamOne = sum / arrTeamOne.length;
        System.out.println();

        for (int j = 0; j< arrTeamTwo.length; j++){
            System.out.print(arrTeamTwo[j]+ " ");
            sum += arrTeamTwo[j];
        }
        int averageAgeTeamTwo = sum / arrTeamTwo.length;
        System.out.println();
        System.out.println("Середній вік першої команди " + averageAgeTeamOne);
        System.out.println("Середній вік другої команди " + averageAgeTeamTwo);
    }
}
