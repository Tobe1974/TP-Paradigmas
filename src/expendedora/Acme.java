package expendedora;

import cafe.Ristretto;
import te.Verde;


import java.util.Scanner;
import cafe.Expresso;
import cafe.Normal;
import te.Negro;
import te.Rojo;

public class Acme {
	
	public static void main(String[] args) {

        Bebidas[] pedido = new Bebidas[200];
      

        
        boolean otroPedido = true;
        int siguiente = 0;

        while (otroPedido) {

           
            System.out.println("¿Qué tipo de bebida quiere?\n"
                    + "1)Café\n"
                    + "2)Té\n");
            Scanner entrada = new Scanner(System.in);
            int clase = entrada.nextInt();

            if (clase == 1) {
                
                System.out.println(""
                        + "1-Expresso\n"
                        + "2-Ristretto\n"
                        + "3-Normal\n");
                Scanner entradacafe = new Scanner(System.in);
                int tipoCafe = entradacafe.nextInt();            
                switch (tipoCafe) {
                    case 1:
                        pedido[siguiente] = new Expresso();
                        break;
                    case 2:
                        pedido[siguiente] = new Ristretto();
                        break;
                    case 3:
                        pedido[siguiente] = new Normal();
                        break;
                }

                System.out.println("¿Cuantas cucharas de azúcar?0-3");
                Scanner entradaazucar = new Scanner(System.in);
                int azucar = entradacafe.nextInt();
                pedido[siguiente].setAzucar(azucar);

                System.out.println("¿Cuanta leche?0-3");
                Scanner entradaleche = new Scanner(System.in);
                int leche = entradaleche.nextInt();
                pedido[siguiente].setLeche(leche);
            }

            if (clase == 2) {
               
                System.out.println(""
                        + "1-Negro\n"
                        + "2-Rojo\n"
                        + "3-Verde\n");
                Scanner entradacafe = new Scanner(System.in);
                int tipoTe = entradacafe.nextInt();           
                switch (tipoTe) {
                    case 1:
                        pedido[siguiente] = new Negro();
                        break;
                    case 2:
                        pedido[siguiente] = new Rojo();
                        break;
                    case 3:
                        pedido[siguiente] = new Verde();
                        break;
                }

                System.out.println("¿Cuantas cucharas de azúcar?0-3");
                Scanner entradaazucar = new Scanner(System.in);
                int azucar = entradacafe.nextInt();
                pedido[siguiente].setAzucar(azucar);

                System.out.println("¿Cuanta leche?0-3");
                Scanner entradaleche = new Scanner(System.in);
                int leche = entradaleche.nextInt();
                pedido[siguiente].setLeche(leche);
            }

            System.out.println("¿Desea ordenar algo más?\n"
                    + "1-Sí\n"
                    + "2-No\n");
            Scanner entradaOtroPedido = new Scanner(System.in);
            int otro = entradaOtroPedido.nextInt();
            if (otro == 1) {
                siguiente++;
            } else {
                otroPedido = false;
            }

        }

       
        double subtotal = 0, total = 0;

        for (int i = 0; i < pedido.length; i++) {
            
            if (pedido[i] != null) {
                System.out.println(pedido[i]);
                subtotal = subtotal + pedido[i].getPrecio()
                        + pedido[i].getAzucar() * 5
                        + pedido[i].getLeche() * 5;
                
            }

        }
        total = subtotal * 1.21;
        System.out.println("Subtotal:" + subtotal);
        System.out.println("Total:" + total);
        

    }
}
