import java.util.Arrays;

public class Vetores {
    //Formas de declarar um vetor:
    int vetor1[] = new int[2];
    int[] vetor2 = {6,3,8};
    public void constructVetor1() {
        vetor1[0] = 1;
        vetor1[1] = 2;
    }

    public void printSimpleFor() {
        for(int c = 0; c < vetor2.length; c++){
            System.out.println("Na posição " + c + " do vetor2, o valor é: " + vetor2[c]);
        }
    }

    //For each para arrays:
    public void printForEach(){
        for(int value: vetor2){
            System.out.println("Print a partir do foreach: " + value);
        }
    }

    //Sort de arrays:
    public void printSortedArray(){
        Arrays.sort(vetor2);
        for(int value: vetor2){
            System.out.println("Print do vetor ordenado: " + value);
        }
    }

    //encontrar posição de um elemento
    public void printFindItemIndex(){
        //Caso um elemento com o valor 8 não exista, ele retornará -8. Ele deixa o valor negativo caso não encontre no array
        int value = Arrays.binarySearch(vetor2,8);
        System.out.println("O valor 8 tem posição " + value + " no vetor2.");
    }

    //Forma de preencher um array de forma automática:

    public void printAutomaticFilledArray(){
        int[] automaticArray = new int[20];
        Arrays.fill(automaticArray, 0);
        System.out.println("Valores do array preenchido automático:");
        for (int value: automaticArray){
            System.out.print(value);
        }
    }

    public void showResults() {
        constructVetor1();

        printSimpleFor();
        printForEach();
        printSortedArray();
        printFindItemIndex();
        printAutomaticFilledArray();

    }

}
