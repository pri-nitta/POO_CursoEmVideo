package ex01conta

import org.graalvm.compiler.debug.TTY.print

class ContaBanco1(var numConta: Int,
                  protected var tipo: String,
                  private var dono: String,
                  private var saldo: Double,
                  private var status: Boolean) {

    fun abrirConta(){

    }

    fun fecharConta(){

    }

    fun depositar(){

    }

    fun sacar(){

    }

    fun pagarMensal(){

    }

    fun construtor(){
        saldo = 0
        status = false
    }

    fun setNumConta(n: Int){
        this.numConta = n
    }

    fun getNumConta(){
        return numConta
    }

    fun setTipo(t: String){
        tipo = t
    }

    fun getTipo(){
        return tipo
    }

    fun setTipo(t: String){
        tipo = t
    }

    fun getTipo(){
        return tipo
    }

    fun setDono(d: String){
        dono = d
    }

    fun getDono(){
        return dono
    }

    fun setSaldo(v: Double){
        saldo = v
    }

    fun getSaldo(){
        return saldo
    }

    fun setStatus(v: Boolean){
        status = v
    }

    fun getStatus(){
        return status
    }

    fun abrirConta(t: String){
        setTipo(t)
        setStatus(true)
        if(t =="CC"){
            saldo = 50.0
        } else if (t == "CP"){
            saldo = 150.0
        }
    }

    fun fecharConta(){
        if (saldo > 0){
            print("Conta com dinheiro")
        } else if (saldo <0){
            print("Conta em débito")
        } else{
            setStatus(false)
        }
    }

    fun depositar(v: Double){
        if(status){
            setSaldo(getSaldo()+v)
        }else{
            print("Impossível depositar")
        }
    }

    fun sacar(v:Double){
        if (status){
            if(saldo>v){
                setSaldo(getSaldo - v)
            } else{
                print("Saldo insuficiente")
            }
        }else{
            print("Impossível sacar")
        }
    }

    fun pagarMensal(){
        var v: Int
        if (tipo == "CC"){
            v = 12
        } else if (tipo =="CP"){
            v = 20
        }
        if (status == true){
            if(saldo > v){
                saldo = saldo -v
            }else{
                print("Saldo Insuficiente")
            }
        }else{
            print("Impossivel pagar")
        }
    }
}