public class Operadores {
    //OPERADORES BÁSICOS
    int n = 1;
    int n2 = 3;
    float res = (n + n2)/2;

    //PEGADINHA:

    int n3 = 5;
    int n4 = 2;

    //n3/n4 não é 2.5, pois o Java está lidando apenas com inteiros. Portanto, o resultado seria 2. Para obter 2.5, deveríamos tratar o resultado.

    String resPegadinha = "A divisão entre int n3 = 5; e int n4 = 2; é: " + n3/n4;

    String print1 = "A soma de " + n + " e " + n2 + " dividos por 2 é: " + res;

    //INCREMENTO E DECREMENTO:

    int number = 5;

    int result = 5 + number++;

    //O resultado será 10.Isso acontece porque number é incrementado apenas após a operação de soma
    String firstLine = "5 + n++ resultará em: " + result;

    int result2 = 5 + ++number;

    //O resultado será 12.Isso acontece porque number é incrementado antes da operação de soma e number já tinha sido reatribuído
    String secondLine = "5 + ++n resultará em: " + result2;

    //OPERADORES DE ATRIBUIÇÃO
    //Podemos utilizar +, -, *, / e %;
    int x = 4;

    int y = x += 4;

    String print3 = "Se x é igual a 4 e y é igual a x+= 4, então y é igual a: " + y;

    //CLASSE MATH
    // Utilizada para realizar fórmulas matemáticas como: raiz quadrada, fatoração, Pi...

    //Operador ternário:

     int showTernaryResult() {
        int n1, m1, r1;
        n1 = 10;
        m1 = 12;
        r1 = n1 > m1 ? 1 : 0;
        return r1;
    }


     String print4 = "Os operadores relacionais de java são iguais ao do javascript: ==, >, <, >=, <=";
     String print5 = "Os operadores lógicos também são os mesmos: &&, ||, !, com adição do ^";

     //Operador lógico ^
    //Ele busca que tenha exclusividade em uma das afirmações.É praticamente o OR sem as duas checagens serem true. Apenas uma condição deve ser true

    String showConditionalResult(int idade){
        if(idade >= 18){
            return "Maior de idade";
        }else {
            return "Menor de idade";
        }
    }

    String print6 = "Utilização do switch:";

    int numberToTranslate = 1;

   public void printSwitchResult(){
        String result;
        switch (numberToTranslate){
            case 1:
                result = "UM";
                break;
            case 2:
                result = "DOIS";
                break;
            default: result = "NULO";
        }
       System.out.println("O resultado do switch é: " + result);
    }




    public void showResults(){
        System.out.println(print1);
        System.out.println(resPegadinha);
        System.out.println(firstLine);
        System.out.println(secondLine);
        System.out.println(print3);
        System.out.println("O resultado de r1 = n1 > m1 ? 1 : 0 é igual a " + showTernaryResult());
        System.out.println(print4);
        System.out.println(print5);
        System.out.println("Estrutura condicional:");
        System.out.println("Quando o parâmetro é igual a 18:" + showConditionalResult(18));
        System.out.println("Quando o parâmetro é menor que 18:" + showConditionalResult(15));
        printSwitchResult();
    }

}
