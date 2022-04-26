/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.factory;

import ico.fes.articulos.Celular;
import ico.fes.articulos.Computadora;
import ico.fes.articulos.Tablets;

/**
 *
 * @author fredy
 */
public class ArtFactory
{
    public static Articulo crearArticulo (int tipo )
    {
        switch(tipo)
        {
            case Articulo.COMPUTADORA_LENOVO:
                return new Computadora("LENOVO", "RYZEN 9-5980HX", 32, 1000);
            case Articulo.COMPUTADORA_HUAWEI:
                return new Computadora("HUAWEI", "RYZEN 5-4600H", 16, 500);
            case Articulo.COMPUTADORA_HP:
                return new Computadora("HP", "Intel Core i7-1165G7", 16, 1000);
            case Articulo.CELULAR_ONEPLUS:
                return new Celular("ONEPLUS 9R", 12, 256);
            case Articulo.CELULAR_SAMSUNG:
                return new Celular("SAMSUNG S22 ULTRA", 12, 256);
            case Articulo.CELULAR_XIAOMI:
                return new Celular("XIAOMI MI 11 T", 8, 256);
            case Articulo.TABLET_IPAD_PRO:
                return new Tablets("APPLE IPAD PRO", 8, 128.0f);
            case Articulo.TABLET_MICROSOFT:
                return new Tablets("MICROSOFT SURFACE 7 PRO", 8, 128.0f);
            case Articulo.TABLET_SAMSUNG:
                return new Tablets("Samsung galaxy tab S7 FE", 8, 128.0f);
            default:
                throw new AssertionError();
        }
    }
}
