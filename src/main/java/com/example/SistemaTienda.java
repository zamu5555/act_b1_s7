package com.example;

public class SistemaTienda {
    public static void main(String[] args) {
        ProductoElectronico laptop = new ProductoElectronico(
                "Laptop Gamer", 2500000, "PROD-1001", 5, "Electrónica",
                24, "Alienware", 110, true);

        ProductoElectronico celular = new ProductoElectronico(
                "Smartphone X", 1800000, "PROD-1002", 3, "Electrónica",
                12, "Samsung", 120, false);

        ProductoAlimenticio leche = new ProductoAlimenticio(
                "Leche Entera", 4500, "PROD-2001", 20, "Alimentos",
                true, "L001", 5);

        ProductoAlimenticio pan = new ProductoAlimenticio(
                "Pan Integral", 3200, "PROD-2002", 0, "Alimentos",
                false, "L002", 2);

        leche.vender(5);
        pan.vender(1);

        System.out.println("Precio laptop: $" + laptop.calcularPrecioElectronico());
        System.out.println("Precio celular: $" + celular.calcularPrecioElectronico());
        System.out.println("Precio leche: $" + leche.calcularPrecioAlimenticio());
        System.out.println("Precio pan: $" + pan.calcularPrecioAlimenticio());

        pan.reabastecer(10);
        pan.vender(2);

        System.out.println("Laptop compatible con 120V: " + laptop.esCompatibleVoltaje(120));
        System.out.println("Celular compatible con 100V: " + celular.esCompatibleVoltaje(100));

        System.out.println("Laptop - Base: $" + laptop.getPrecioBase() + " / Final: $" + laptop.calcularPrecioElectronico());
        System.out.println("Leche - Base: $" + leche.getPrecioBase() + " / Final: $" + leche.calcularPrecioAlimenticio());

        System.out.println("Laptop - Garantía extendida: " + laptop.esGarantiaExtendida());
        System.out.println("Celular - Costo garantía: $" + celular.calcularCostoGarantia());

        System.out.println("Leche - Estado frescura: " + leche.obtenerEstadoFrescura());
        System.out.println("Pan - ¿Vencido?: " + pan.estaVencido());
        System.out.println("Pan - Pérdida por vencimiento: $" + pan.calcularPerdidaPorVencimiento());
    }
}