package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
        for (int i = 0; i < height; i++){
            String eight = "8";
            String empty = " ";   
            if (i == 0 || i == height-1)
                System.out.println(eight.repeat(length));
            else
                System.out.println(eight + empty.repeat(length - 2) + eight);
        }
    }
}
