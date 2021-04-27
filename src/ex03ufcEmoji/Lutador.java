package ex03ufcEmoji;

public class Lutador {

    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String no, String na, int id, float al, float pe, String ca, int vi, int de, int em) {
        no = nome;
        na = nacionalidade;
        id = idade;
        al = altura;
        setPeso(pe);
        ca = categoria;
        vi = vitorias;
        de = derrotas;
        em = empates;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String no) {
        no = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(String pe) {
        peso = pe;
        setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria(String categoria) {
        if (peso < 52.2) {
            categoria = "Inválido";
        }
        if (peso <= 70.3) {
            categoria = "Leve";
        }
        if (peso <= 83.9) {
            categoria = "Medio";
        }
        if (peso <= 120.2) {
            categoria = "Pesado";
        } else {
            categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public void ganharLuta(){
        setVitorias(getVitorias() +1);
    }

    public void perderLuta(){
        setDerrotas(getDerrotas() +1);
    }

    public void empatarLuta(){
        setEmpates(getEmpates() +1);
    }

    public void apresentar(){
        System.out.println("Lutador: "+ this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println(this.getIdade() + "anos");
        System.out.println("Pesando "+ this.getPeso() + "kg");
        System.out.println("Ganhou: "+ this.getVitorias());
        System.out.println("Perdeu: "+ this.getDerrotas());
        System.out.println("Empatou: "+ this.getEmpates());
    }

    public void status(){
        System.out.println(getNome());
        System.out.println("é um peso " +this.getCategoria());
        System.out.println(this.getVitorias() + "vitórias");
        System.out.println(this.getDerrotas() + "derrotas");
        System.out.println(this.getEmpates() + "empates");

    }
}
