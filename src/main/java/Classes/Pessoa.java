package Classes;
//ao cliar a classe pública, lembrar que os atributos devem estar como privados.
//para criar os setters e getters, clica com o botao direito >> generate >> getter e setter , seleciona
//todos os atributos para os quais vc quer gerar o getter e setter e dar ok
//os atributos são as coisas que o objeto deve ter para se caracterizar como aquilo. neste caso, toda pessoa tem
//idade e nome. já os métodos/funções são os comportamentos esperados. neste caso, um comportamento esperado
// de uma pessoa é que ela faça aniversário. Declarei esse método fazAniversario após os getters e setters.
public class Pessoa {
    private String nome;
    private int idade;
// esse construtor abaixo vai servir para que, na hora de criar um objeto pessoa, vc nao precise passar com o nome
    //da pessoa. Vc pode criar a Pessoa p1, por exemplo, e depois atribuir ao atributo nome o nomeDaPessoa, ou seja,
    //p1 = Fernanda. Esse construtor obriga o dev a informar o nome como atributo na hora que cria a variável.
    public Pessoa (String nomeDaPessoa) {
        this.nome = nomeDaPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void fazAniversario() {
        int novaIdade = this.idade + 1;
        this.idade = novaIdade;
    }
}
