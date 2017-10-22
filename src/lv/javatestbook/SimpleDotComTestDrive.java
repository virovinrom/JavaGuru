package lv.javatestbook;

public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();
        int[] locations = {2, 3, 4};
        //dot.setLocationCells(locations);
        String userGuess = "2";
        String result = dot.checkYourselfe(userGuess);
        String testResult = "neyda4a";
        if (result.equals("Popal")){
            testResult = "Projden";
        }
        System.out.println(testResult);
    }
}
