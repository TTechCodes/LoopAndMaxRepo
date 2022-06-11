
class WhileLoop{

    //Forward Loop
    protected void forwardLoop() {
        int i = 1;
        while (i <= 1000) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }

    //Backward Loop
    protected void backwardLoop() {
        int i = 1000;
        while (i >= 1) {
            System.out.print(i + " ");
            i--;
        }
        System.out.println();
    }

    //even Loop
    protected void evenLoop() {
        int i = 1;
        while (i <= 1000) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
    }

    //odd Loop
    protected void oddLoop() {
        int i = 1;
        while (i <= 1000) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
    }


}
