package POO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Collections1 {
    public static void main(String args[])
    {
        Scanner ler = new Scanner(System.in);
        Collection<String> estoque = new ArrayList();

        int escolha;
        String produto, atualizacao;

        do
        {
            System.out.println("Escolha uma ação:");
            System.out.println("[1] Adicionar um produto");
            System.out.println("[2] Remover um produto");
            System.out.println("[3] Atualizar um produto");
            System.out.println("[4] Exibir a lista de produtos");
            System.out.println("[0] Fechar o programa");
            escolha = ler.nextInt();

            if(escolha == 1)
            {
                System.out.println("Digite o produto para add na lista: ");
                produto = ler.next();
                estoque.add(produto);
            }

            else if(escolha == 2)
            {
                System.out.println("Digite o produto para remover da lista: ");
                produto = ler.next();
                estoque.remove(produto);
            }

            else if(escolha == 3)
            {
                System.out.println("Digite a atualização do produto: ");
                atualizacao = ler.next();

                System.out.println("Digite o produto para remover da lista: ");
                produto = ler.next();

                if(estoque.contains(produto))
                {
                    estoque.remove(produto);
                    estoque.add(atualizacao);
                }
            }

            else if(escolha == 4)
                System.out.println("Produtos do estoque: " + estoque + "\n");

            else
                System.out.println("Escolha errada!");
        }
        
        while(escolha != 0);
    }
}