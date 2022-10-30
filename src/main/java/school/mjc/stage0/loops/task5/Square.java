package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
        for (int i = 0; i < sideLength; i++){
            String eight = "8";
            String empty = " ";   
            if (i == 0 || i == sideLength-1)
                System.out.println(eight.repeat(sideLength));
            else
                System.out.println(eight + empty.repeat(sideLength - 2) + eight);
        }
    }
}
