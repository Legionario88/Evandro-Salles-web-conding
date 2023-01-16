package projeto.poo;

public class Soma extends Operacoes{
    
    @Override
    public double calcular(){
        resultado = getN1() + getN2();
        return resultado;
    }
}
