public class Character {

    private String nome;
    private String idade;
    private String tipo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public void atacar (Character alvo){
        if (alvo != null){
            System.out.println(nome + " você utilizou exevo gran mas frigo em " + alvo.getNome());
        }
    }
    public static void main(String[] args) {
        Character personagem = new Character();
        personagem.setNome("Anne Avonlea");
        personagem.setTipo("Elder Druid");

        Character personagem2 = new Character();
        personagem2.setNome("Gaiser Spectre");
        personagem2.setTipo("monstro");

        personagem.atacar(personagem2);
    }
}