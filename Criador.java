package pessoa;

public class Criador {
    
   
    public static void main(String[] args) {
        
        Pessoa x = new Pessoa("zé",1.85,80);
        Funcionario y = new Funcionario ("Beto",1.65, 75, 1000);

        x.imprimeTudoP();
        y.imprimeTudoFunc();
   }    
}
