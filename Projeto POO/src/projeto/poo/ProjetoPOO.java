package projeto.poo;

import javax.swing.JOptionPane;

public class ProjetoPOO {


    public static void main(String[] args) {
        Escolha sel = new Escolha();
        while (sel.selecao()){
            sel.opc = JOptionPane.showConfirmDialog(null, "Deseja fazer uma operacão?");
            if (sel.selecao()) {
                sel.opcS = JOptionPane.showInputDialog(null, "Escolha a operação que deseja realizar\n1 Soma \n2 Subtração\n3 Divisão\n4 Multiplicação");
                switch (sel.opcS) {
                    case "1":
                        Operacoes o1 = new Soma();
                        o1.setN1(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do primeiro número")));
                        o1.setN2(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do segundo número")));
                        o1.calcular();
                        JOptionPane.showMessageDialog(null, "O valor da sua soma é de:" + o1.resultado); 
                    break;
                    case "2":
                        Operacoes o2 = new Subtracao();
                        o2.setN1(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do primeiro número")));
                        o2.setN2(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do segundo número")));
                        o2.calcular();
                        JOptionPane.showMessageDialog(null,"O valor da sua subtração é de:" + o2.resultado); 
                    break;
                    case "3":
                        Operacoes o3 = new Divisao();
                        o3.setN1(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do primeiro número")));
                        o3.setN2(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do segundo número")));
                        o3.calcular();
                        JOptionPane.showMessageDialog(null,"O valor da sua divisão é de:" + o3.resultado); 
                    break;
                    case "4":
                        Operacoes o4 = new Multiplicacao();
                        o4.setN1(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do primeiro número")));
                        o4.setN2(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do segundo número")));
                        o4.calcular();
                        JOptionPane.showMessageDialog(null,"O valor da sua multiplicação é de:" + o4.resultado); 
                    break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcão invalida. Tente novamente");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Obrigado por usar!");
            }
            
        }
        
    }
    
}

//Aluno: Evandro Salles De Sousa  
//Matrícula: 01497660

