package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        String eight = "8";
        for (int i = 1; i <= cathetusLength; i++)
            System.out.println(eight.repeat(i));
    }
}
