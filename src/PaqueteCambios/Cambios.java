package PaqueteCambios;
import javax.swing.JOptionPane; //Funcion de java para mejorar la estética de la ejecución del programa
public class Cambios {
    public double pesos_A_dolarE = 0.049; //Peso mexicanos en dólares estadounidenses
    public double pesos_A_dolarC = 0.064; //Peso mexicanos en dólares canadienses
    public double pesos_A_euro = 0.048; //Peso mexicano en euros
    public double dolarEstadounidense = 20.25;
    public double dolarCanadiense = 15.52;
    public double euro = 21.01;
    public double res; //Es el resultado de la cantidad que se entrega al cliente


    double MXN = 0.0494558;
    double CAD = 0.0644789;
    double EUR = 0.0476851;
    public void dolaresE_A_pesosM(int cant) {
        String.valueOf(dolarEstadounidense);
        res = cant * dolarEstadounidense;
        JOptionPane.showMessageDialog(null,cant + " Debes entregar al cliente: $" + res +" pesos mexicanos");
        JOptionPane.showMessageDialog(null,"Tipo de cambio: \n" + "1 USD " + "20,2133" + " MXN\n"
        + "1 MXN " + MXN + " USD\n");
    }
    public double pesosM_A_dolaresE(int cant) {
        res = cant * pesos_A_dolarE;
        JOptionPane.showMessageDialog(null,cant+" Debes entregar al cliente: $" + res +" dólares estadounidenses");
        JOptionPane.showMessageDialog(null,"Tipo de cambio: \n" + "1 MXN " + MXN + " USD\n"
                + "1 USD " + "20,2133" + " MXN\n");
        return res;
    }
    public double dolarC_A_pesosM(int cant) {
        res = cant * dolarCanadiense;
        JOptionPane.showMessageDialog(null,cant+" Debes entregar al cliente: $" + res +" pesos mexicanos");
        JOptionPane.showMessageDialog(null,"Tipo de cambio: \n" + "1 CAD " + "15,5089" + " MXN\n"
                + "1 MXN " + CAD + " CAD\n");
        return res;
    }
    public double pesosM_A_dolarC(int cant) {
        res = cant * pesos_A_dolarC;
        JOptionPane.showMessageDialog(null,cant+" Debes entregar al cliente: $" + res +" dólares canadienses");
        JOptionPane.showMessageDialog(null,"Tipo de cambio: \n" + "1 MXN " + CAD + " CAD\n"
                + "1 CAD " + "15,5089" + " MXN\n");
        return res;
    }
    public double euros_A_pesosM(int cant) {
        res = cant * euro;
        JOptionPane.showMessageDialog(null,cant+" Debes entregar al cliente: $" + res +" pesos mexicanos");
        JOptionPane.showMessageDialog(null,"Tipo de cambio: \n" + "1 EUR " + "20,9709" + " MXN\n"
                + "1 MXN " + EUR + " EUR\n");
        return res;
    }
    public double pesosM_A_euros(int cant) {
        res = cant * pesos_A_euro;
        JOptionPane.showMessageDialog(null,cant+" Debes entregar al cliente: $ " + res +" EUR");
        JOptionPane.showMessageDialog(null,"Tipo de cambio: \n" + "1 MXN " + EUR + " EUR\n"
                + "1 EUR " + "20,9709" + " MXN\n");
        return res;
    }

}
