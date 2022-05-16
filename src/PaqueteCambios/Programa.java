//Nombre: Hanna Ximena Anaya Martínez
//Matrícula: 010341153
//Fecha de realización: 12/05/2022

package PaqueteCambios;
import javax.swing.JOptionPane; //Funcion de java para mejorar la estética de la ejecución del programa

public class Programa {
    public static void main(String[] args) {
        Cambios x = new Cambios();

        int m; //Variable que representa la conversión de monedas
        int cant; //Cantidad convertida que se entregará al cliente

        do {
            m = Integer.parseInt(JOptionPane.showInputDialog("Convertidor de Moneda\n"
                    + "Elija un número de las siguientes opciones\n"
                    + "1: Dólares estadounidenses a pesos mexicanos\n"
                    + "2: Pesos mexicanos a dólares estadounidenses\n"
                    + "3: Dólares canadienses a pesos mexicanos\n"
                    + "4: Pesos mexicanos a dólares canadienses\n"
                    + "5: Euros a pesos mexicanos\n"
                    + "6: Pesos mexicanos a Euros\n"
                    + "7: Salir\n"
                    ));

            switch(m) {
                case 1:
                    cant = Integer.parseInt(JOptionPane.showInputDialog("Convertir Dólares estadounidenses a pesos mexicanos\n"
                            + "Introduce la cantidad de dólares estadounidenses a cambiar: "));
                            x.dolaresE_A_pesosM(cant);
                    break;
                case 2:
                    cant = Integer.parseInt(JOptionPane.showInputDialog("Convertir Pesos mexicanos a dólares estadounidenses\n"
                            + "Introduce la cantidad de pesos mexicanos a cambiar:"));
                    System.out.println("$ "+ x.pesosM_A_dolaresE(cant));
                    break;

                case 3:
                    cant = Integer.parseInt(JOptionPane.showInputDialog("Convertir Dólares canadienses a pesos mexicanos\n"
                            + "Introduce la cantidad de dólares canadienses a cambiar:"));
                    System.out.println("$ "+ x.dolarC_A_pesosM(cant));
                    break;
                case 4:
                    cant = Integer.parseInt(JOptionPane.showInputDialog("Convertir Pesos mexicanos a dólares canadienses\n"
                            + "Introduce la cantidad de pesos mexicanos a cambiar:"));
                    System.out.println("$ "+ x.pesosM_A_dolarC(cant));
                    break;
                case 5:
                    cant = Integer.parseInt(JOptionPane.showInputDialog("Convertir Euros a pesos mexicanos\n"
                            + "Introduce la cantidad de euros a cambiar:"));
                    System.out.println("$ "+ x.euros_A_pesosM(cant));
                    break;
                case 6:
                    cant = Integer.parseInt(JOptionPane.showInputDialog("Pesos mexicanos a Euros\n"
                            + "Introduce la cantidad de pesos mexicanos a cambiar:"));
                    System.out.println("$ "+ x.pesosM_A_euros(cant));
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Salio del programa", "Salida",m);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no valida", "Error",m);
                    break;
            }
        }while(m!=7);
    }
}


