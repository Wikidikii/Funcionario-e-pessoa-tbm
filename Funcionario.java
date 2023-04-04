package pessoa;

public class Funcionario extends Pessoa {

    public int matricula;

    public Funcionario() {
    }

    public Funcionario(String nome, double altura, double peso, int matricula) {
        super(nome, altura, peso);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
        public void imprimeTudoFunc() {
        System.out.println(nome);
        System.out.println(altura);
        System.out.println(peso);
        if (matricula > 0) {
        System.out.println(matricula);
        }   
   }
}
