 */
public class Retroparcial1 {

    public static void main(String[] args) {
        Empleado empleado1=new  Empleado();
        empleado1.setNombre("luis");
        empleado1.setCargo("gerente");
        empleado1.setSalarioBase(200000);
        empleado1.setAnosExperincia(6);
        
        System.out.println("nombre: " + empleado1.getNombre() + empleado1.getCargo());
        
        
    }
}
