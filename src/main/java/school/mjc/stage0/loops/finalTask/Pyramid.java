package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public static void main(String[] args) {
        printPyramid(9);
    }
    public static void printPyramid(int cathetusLength) {
        for (int i = cathetusLength; i >= 1; i--) {
            for (int j = (cathetusLength * -1) + 1; j <= cathetusLength -1; j++) {
                int elementIJ = 1;
                if (j < 0) {
                    if (j < i - cathetusLength) {
                        System.out.print(" ");
                    } else {
                        elementIJ = -(j - 1);
                        System.out.print(elementIJ);
                    }
                } else if (j > 0) {
                    if (j > cathetusLength - i) {
                        System.out.print(" ");

                    } else {
                        elementIJ = j + 1;
                        System.out.print(elementIJ);
                    }
                } else {
                    System.out.print(1);
                }
            }
            System.out.println();
        }
    }

//    public static void main(String[] args) {
//        new Pyramid().printPyramid(7);
//    }
}
