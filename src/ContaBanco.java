public class ContaBanco {
    //atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //metodos
    public void abrirConta() {
    }

    public void fecharConta() {
    }

    public void depositar() {
    }

    public void sacar() {

    }

    public void pagarMensal() {

    }

    //metodos especiais
    public void ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public int getNumConta() {
        return this.numConta;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setDono(String d){
        this.dono = d;
    }

    public String getDono(){
        return this.dono;
    }

    public void setSaldo(float s){
        this.saldo = s;
    }

    public float getSaldo(){
        return this.saldo
    }

    public void setStatus(boolean a){
        this.status = a;
    }
    public boolean getStatus(){
        return this.status
    }

}
