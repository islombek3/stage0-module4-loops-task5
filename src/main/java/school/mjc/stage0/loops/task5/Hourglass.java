package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        String eight = "8";
        String empty = " ";
        int i = 0;
        int x = height;
        while (x >= 1){
            System.out.println(empty.repeat(i) + eight.repeat(x) + empty.repeat(i));
            i++;
            x -= 2;
        }
        x = height % 2 == 0? x+2: x+4;
        i = height % 2 == 0? i-1: i-2;
        while (x <= height){
            System.out.println(empty.repeat(i) + eight.repeat(x) + empty.repeat(i));
                i--;
                x += 2;
        }
    }
}
