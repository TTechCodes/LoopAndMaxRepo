
class ForLoop{

    //forward Loop
    protected void forwardLoop() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    //backwards Loop
    protected void backwardLoop() {
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    //Even loop
    protected void evenLoop() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    //Even loop
    protected void oddLoop() {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }


}
