/*Esta atividade consiste em fazer um programa simples para cadastro de motoristas que querem tirar a CNH. Atenção para os requisitos abaixo.

Classe Motorista
- Possui os atributos privados: nome (string), anoNascimento (inteiro) e tipoCNH (caractere).
- Possui um construtor com os parâmetros de nome e anoNascimento. Dentro do construtor, os dois atributos são inicializados com os valores recebidos dos parâmetros. E o atributo tipoCNH é inicializado com um traço. Sim, o símbolo -
- Possui os getters dos três atributos.
- Possui o setter do tipoCNH. Dentro do método, é feita a seguinte validação: o atributo tipoCNH só é atualizado se o parâmetro for igual a 'A', 'B' ou 'Z'.

Classe HabilitacaoMain
Dentro do método principal:
- Pede para a pessoa informar o nome e a data de nascimento, guardando os dados em duas variáveis.
- Caso a pessoa tenha nascido após 2003, o programa apenas informa que ela não tem permissão para dirigir.
- Caso contrário:
   - Um objeto Motorista é criado, passando para o construtor as variáveis de nome e data de nascimento obtidas anteriormente.
   - O programa pergunta qual tipo de habilitação a pessoa deseja: A) moto, B) carro ou Z) moto e carro. (No nosso programa é Z mesmo, não é AB).
   - O tipo de CNH escolhido pelo usuário é guardado em uma variável. Dica: o método charAt(<número>) pode ser bem útil aqui.
   - O método setTipoCNH() é chamado, passando a variável acima como parâmetro.
   - O programa exibe as informações do(a) motorista cadastrado. Para isso, chama os getters do objeto criado e os coloca nos prints.

Seguem algumas screenshots do meu console em execução para que você se baseie ao fazer a atividade.

Estou à disposição para quaisquer dúvidas! Não se acanhe em ir além do que a atividade pede, caso queira. */
package carteirahabilitação;

import java.util.Scanner;
/*
 * SENAI-CIMATEC
 * @author Carla Regina dos Anjos dos Santos 
 * @turma: NOTURNO 211-DES-2N-DES082
 */
public class HabilitacaoMain {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
            System.out.println("--------Cadastro CNH---------");
            System.out.printf("Informe seu nome: ");
            String nomeMotorista = ler.next();
            System.out.printf("Informe ano de nascimento (4 digítos): ");
            int anoNascimento = ler.nextInt();
               
                if (anoNascimento>2003){
                    System.out.println("Você não tem idade suficiênte para dirigir!");
                }else{
                   Motorista cnh = new Motorista(nomeMotorista,anoNascimento);
                   System.out.println("Qual tipo de Habiliatação deseja tirar: ");
                   System.out.println(" A)Moto\n B)Carro\n Z)Moto e Carro ");
                   char tipoCnh= ler.next().toUpperCase().charAt(0);   
                   cnh.setTipoCnh(tipoCnh); 
                   System.out.println("------------Informações do Motorista---------------");
                    System.out.println(" Nome: " + cnh.getNomeMostorista());
                    System.out.println(" Ano de Nascimento: " + cnh.getAnoNascimento());
                    System.out.println(" Tipo CNH: " + cnh.getTipoCnh());
                }              
    }    
}
