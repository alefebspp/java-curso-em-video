public class Metodos {

    //O public declara que esse método pode ser usado por qualquer outro objeto
    //O static permite com que o método seja chamada sem precisar instanciar o objeto Metodos
    public static void printFromMetodos() {
        System.out.println("\n Chamado de dentro do objeto Metodos!");
    }

    public static int getSum(int n, int n2){
        return n + n2;
    }

    public static void printGetSumMethodResult(){

      int result =  getSum(2,2);
        System.out.println("O resultado do método de soma é: " + result);
    }

}
