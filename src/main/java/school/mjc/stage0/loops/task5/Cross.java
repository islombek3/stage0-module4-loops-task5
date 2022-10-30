package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        String eight = "8";
        String empty = " ";
        int median = (int)Math.ceil(sideLength/2);
        String emptySpace = empty.repeat(median);
        for (int i = 0; i < sideLength; i++){
            if (i != median)
                System.out.println(emptySpace + eight + emptySpace);
            else
                System.out.println(eight.repeat(sideLength));
        }
    }
}
