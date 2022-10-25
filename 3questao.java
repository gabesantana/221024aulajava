public class Main{
    
    public static void main (String[] args) {
 
    SP sp = new SP();
    
     
    sp.setRegiao("SP");
    
    sp.setPreco_gasolina(10.00);
    sp.gerarNotaFiscal( sp.getRegiao(), sp.getPreco_gasolina() );
    
   
    SC sc = new SC();
    
    sc.setRegiao("SC");
    sc.setPreco_gasolina(10.00);
    sc.gerarNotaFiscal( sc.getRegiao(), sc.getPreco_gasolina() );
    
    RN rn = new RN();
    
    rn.setRegiao("RN");
    rn.setPreco_gasolina(10.00);
    rn.gerarNotaFiscal( rn.getRegiao(), rn.getPreco_gasolina() );
    
 }  }
 
class Posto {
    
    private String regiao;
    private double preco_gasolina;
    
    
    public void setRegiao(String regiao) { this.regiao = regiao;}
    public void setPreco_gasolina(double preco_gasolina) { this.preco_gasolina = preco_gasolina;}
    
     public String getRegiao() { return this.regiao; }
    public double getPreco_gasolina() { return this.preco_gasolina; }
    
    public void gerarNotaFiscal(String nome, double preco_gasolina){
        
        if( nome.equals("SP") ){System.out.println( preco_gasolina *0.07 ) ; }  
        else if (nome.equals("RN")) { System.out.println( preco_gasolina + preco_gasolina * 0.12);}
        else { System.out.println(preco_gasolina + preco_gasolina * 0.17) ;}
    }  

}

class SP extends Posto { }
class RN extends Posto { }
class SC extends Posto { }
    
    
