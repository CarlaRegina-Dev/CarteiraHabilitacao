
package carteirahabilitação;
/*
 * SENAI-CIMATEC
 * @author Carla Regina dos Anjos dos Santos 
 * @turma: NOTURNO 211-DES-2N-DES082
 */
public class Motorista {
    private String nomeMotorista;
    private int anoNascimento;
    private char tipoCnh;
    
    public Motorista(String nomeMotorista, int anoNascimento){
        this.nomeMotorista=nomeMotorista;
        this.anoNascimento=anoNascimento;
        this.tipoCnh='-';
    }
    
    public String getNomeMostorista(){
        return nomeMotorista;
    }
    
    public int getAnoNascimento(){
        return anoNascimento;
    }
    
    public void setTipoCnh(char tipoCnh){
        if(tipoCnh=='A'||tipoCnh=='B'||tipoCnh=='Z'){
           this.tipoCnh=tipoCnh;
        } 
    }
    
    public char getTipoCnh(){
        return tipoCnh;
    }   
}
