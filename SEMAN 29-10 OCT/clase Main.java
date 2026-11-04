
public class Main {

    public static void main(String[] args) {

        // 1. CREAR LOS OBJETOS

        Producto producto1 = new Producto(
                "Computador portátil",
                "Tecnología",
                2500000,
                8
        );

        Producto producto2 = new Producto(
                "Mouse inalámbrico",
                "Accesorios",
                85000,
                20
        );

        Producto producto3 = new Producto(
                "Teclado",
                "Accesorios",
                120000,
                15
        );

        // 2. MOSTRAR LOS PRODUCTOS

        System.out.println("===== PRODUCTO 1 =====");
        System.out.println(producto1.verDetalle());

        System.out.println("\n===== PRODUCTO 2 =====");
        System.out.println(producto2.verDetalle());

        System.out.println("\n===== PRODUCTO 3 =====");
        System.out.println(producto3.verDetalle());

        // 3. CALCULAR DESCUENTO

        System.out.println("\n===== DESCUENTOS =====");

        System.out.println("Descuento: $"
                + producto1.calcularDescuento(10));

        System.out.println("Precio final: $"
                + producto1.calcularPrecioFinal(10));

        // 4. CASO 1: VENTA EXITOSA

        System.out.println("\n===== CASO 1 =====");

        System.out.println("Stock antes: "
                + producto1.getCantidadStock());

        System.out.println(producto1.vender(3));

        System.out.println("Stock después: "
                + producto1.getCantidadStock());

        // 5. CASO 2: INVENTARIO INSUFICIENTE

        System.out.println("\n===== CASO 2 =====");

        System.out.println("Stock antes: "
                + producto2.getCantidadStock());

        System.out.println(producto2.vender(25));

        System.out.println("Stock después: "
                + producto2.getCantidadStock());
    }
}
