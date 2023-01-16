
package projeto.poo;

public class Subtracao extends Operacoes{
    @Override
    public double calcular(){
        resultado = getN1() - getN2();
        return resultado;
    }
}
