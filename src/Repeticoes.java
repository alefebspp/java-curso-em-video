public class Repeticoes {
    public void printWhile(){
        int counter = 0;

        while(counter < 15) {
            if(counter > 9){
                System.out.println("Utilizado o break para não printar números maiores que 10");
                break;
            }

            counter ++;

            if(counter % 2 == 0){
                System.out.println("Não fazer o print pois é um número par: " + counter);
                continue;
            }
            System.out.println("Print a partir do while " + counter);

        }

    }

    public void printDoWhile() {
        int counter = 0;
        do {
            counter ++;
            System.out.println(counter + " Cambalhota(s)");
        } while (counter < 5);
    }

    public void printForLoop(){
        for(int counter = 0; counter <= 100; counter += 10){
            System.out.println("Print do counter somado + 10 até 100: " + counter);
        }
    }

    public void showResults(){
        System.out.println("ESTRUTURA DE REPETIÇÃO WHILE:");
        printWhile();
        System.out.println("ESTRUTURA DE REPETIÇÃO DO WHILE:");
        printDoWhile();
        printForLoop();
    }
}
