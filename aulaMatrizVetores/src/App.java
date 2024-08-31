import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        // Declarando um Array Unidimensional (com tamanho 5)
        int [] meu_array = new int[5];

        // Inicializando os valores por acesso rápido
        
        // na posição 0 estou guardando o elemento 10, e assim em diante
        meu_array[0] = 10;
        meu_array[1] = 20;
        meu_array[2] = 30;
        meu_array[3] = 40;
        meu_array[4] = 50;

        // Recuperar os elementos da array por acesso rápido
        int element_0 = meu_array[2];
        int element_1 = meu_array[4];

        // imprimindo os elementos
        System.out.println (element_0 + " " + element_1);

        // Array (ou vetor) do tipo Texto \ String
        // o numero de elementos é amarrado no inicio, por meio de um numero inteiro [5]
        // permitindo que o mesmo seja ampliado\diminuido no decorrer do processo.
        String[] lista_aluno = new String[5];

        // criando lista de alunos
        lista_aluno[0] = "João";
        lista_aluno[1] = "Vanessa";
        lista_aluno[2] = "Davi";
        lista_aluno[3] = "Lucas";
        lista_aluno[4] = "Igor"; 

        // Array(ou Vetor) do tipo texto\string
        // a quantidade de elementos é amarrada no ato da criação por meio dos conteúdos,
        // portanto não é possível modificar a quantidade, somente adicionando e removendo
        String[] lista_cidades = {"Poá", "Suzano", "Ferraz", "Mogi"};
        // 0 - Poá \ 1 - Suzano \ 2 - Ferraz \ 3 - Mogi
        
        // Acesso direto (ou rápido)
        System.out.println(lista_cidades[2]);

       
        // Acesso posicional - Sequencial (percorrer um Array)
        for (int i = 0; i < lista_aluno.length; i++) {
            System.out.println ("Elemento " + i + ": " + lista_aluno[i]);
        }

        for (int i = 0; i < lista_cidades.length; i++) {
            System.out.println ("Elemento " + i + ": " + lista_cidades[i]);
        }

        // converter a estrutura Array em texto
        int[] array = {17, 21, 32, 43, 55};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(lista_cidades));
        
        // Verificando o tamanho da array
        System.out.println("O tamanho é: " + array.length);
        System.out.println("O tamnho é: " + lista_cidades.length); 


        // copiando um Array
        int[] copia = array.clone();
        String[] copia_cidade = lista_cidades.clone();
        String[] copia_cidades2 = lista_cidades;

        System.out.println("Copia:" + Arrays.toString(copia));
        System.out.println("Copia:" + Arrays.toString(copia_cidade));

        // recortando e copiando para uma nova array
        String[] copia_sel = Arrays.copyOf(lista_cidades, 2);

        System.out.println("Copia: " + Arrays.toString(copia_sel));

        // organizando ordem dos elementos
        int[] nova_array = {5, 6, 4, 2, 3, 1, 0};
        Arrays.sort(nova_array);
        System.out.println("Ordenada em: " + Arrays.toString(nova_array));


        // inserindo um valor igual em todas as posições
        int[] array_vazia = new int[5]; // vai aparecer 5x o número 0
        System.out.println(" : " + Arrays.toString(array_vazia));
        
        Arrays.fill(array_vazia,10); // vai colocar o valor 0 nas arrays vazias
        System.out.println(":" + Arrays.toString(array_vazia)); 

        // função p comparar arrays (ver se são iguais em tamanho, comprimento e conteúdo)
        boolean resp = Arrays.equals(lista_cidades, copia_cidade);
        System.out.println("As arrays são iguais: " + resp);

        if(Arrays.equals(lista_cidades, copia_cidade)) {
            System.out.println("As listas são iguais");
        } else {
            System.out.println("As listas são diferentes");
        }

        // buscando elementos na lista
        int posição = Arrays.binarySearch(lista_cidades, "Poá");
        System.out.println("Foi localizano na posição: " + posição);

        // buscando elementos na lista
        int posição1 = Arrays.binarySearch(array, 55);
        System.out.println("Foi localizano na posição: " + posição1);
    

    }
}



