import javax.swing.JOptionPane;


public class DecimalBinario {

    public static void main(String[] args) {

        int n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero decimal"));

        int res=n%2, a=1;

        while (n/2>0){

            n=n/2;

            a=a*10;

            res=res+(n%2)*a;

        }
        JOptionPane.showMessageDialog(null,"En binario es: "+res);
    }

}