package pessoa;

public class Pessoa {

protected String nome;
protected double altura;
protected double peso;

protected Pessoa() {}    
protected Pessoa(String nome, double altura, double peso) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void imprimeTudoP() {
        System.out.println(nome);
        System.out.println(altura);
        System.out.println(peso);
        }   
}


