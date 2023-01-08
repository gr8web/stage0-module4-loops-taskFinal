package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = 0; j <= cathetusLength * 2; j++) {
                if (j < (cathetusLength - i)) {
                    System.out.print(" ");
                    continue;
                }
                if (j < cathetusLength) {
                    System.out.print((cathetusLength - j));
                }

                if (j > cathetusLength + 1 && j < cathetusLength + 1 + i) {
                    System.out.print(j - cathetusLength);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
