/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.articulos;

import ico.fes.factory.ArtFactory;
import ico.fes.factory.Articulo;
import java.util.Scanner;

/**
 *
 * @author fredy
 */
public class Main
{
    public static void main(String[] args)
    {     
        int seleccion = 0;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Que deseas comprar?:");
        System.out.println(Computadora.COMPUTADORA_LENOVO + ") Computadora Lenovo");
        System.out.println(Computadora.COMPUTADORA_HUAWEI + ") Computadora Huawei");
        System.out.println(Computadora.COMPUTADORA_HP + ") Computadora HP");
        System.out.println(Celular.CELULAR_ONEPLUS + ") Celular OnePlus");
        System.out.println(Celular.CELULAR_SAMSUNG + ") Celular Samsung");
        System.out.println(Celular.CELULAR_XIAOMI + ") Celular Xiaomi");
        System.out.println(Tablets.TABLET_IPAD_PRO + ") Tablet Ipad pro");
        System.out.println(Tablets.TABLET_MICROSOFT + ") Tablet MICROSOFT SURFACE");
        System.out.println(Tablets.TABLET_SAMSUNG + ") Tablet Samsung TAB");
        
        try
        {
            System.out.print("Elige un numero: ");
            seleccion = teclado.nextInt();
        }
        catch (Exception e)
        {
            System.out.println("No tecleaste ningun numero");            
        }
        
        Articulo producto = ArtFactory.crearArticulo(seleccion);
        System.out.println(producto.toString());
    }
}
