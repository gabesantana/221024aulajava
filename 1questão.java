
// classes, objetos, getters e setters
public class Main
{
    /* classe index*/ 
    public static void main (String[] args) {
    // criando uma instancia do funcionario    
    funcionario funcionario = new funcionario();
    //setando os valores dos atributos
    funcionario.setNome("gabriel");
    funcionario.setSalario(1220.00);
    // resgatar os valores dos atributos
    System.out.println( funcionario.getNome() );
    System.out.println( funcionario.getSalario() );
    }
}

class funcionario{
 private String nome;
 private double salario;
// setando os valores nos atributos 
 public void setNome(String nome) { this.nome = nome;}
 public void setSalario(double salario) { this.salario = salario;}
 // resgatando os valores nos atributos
 public String getNome() { return this.nome; }
 public double getSalario() { return this.salario; }
}
