package principal;

import principal.dominio.mascotas.MascotaService;
import principal.dominio.usuarios.Usuario;
import principal.dominio.usuarios.UsuarioService;

public class Principal {

    public static void main(String[] args) {

        UsuarioService usuarioService = new UsuarioService();
        MascotaService mascotaService = new MascotaService();

        //Creando y guardando usuarios en la base de datos
        try {
            usuarioService.crearUsuario("fngz7788@gmail.com", "40908692");
            usuarioService.crearUsuario("facunglez@gmail.com", "40908692");
            usuarioService.crearUsuario("mengano@outlook.com", "40908692");
            usuarioService.crearUsuario("sultano@outlook.com", "40908692");
            usuarioService.crearUsuario("fulano@outlook.com", "40908692");
            usuarioService.imprimirUsuarios();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error del sistema por \n" + e.getMessage());
        }

        //Modificamos la clave de un usuario, el segundo argumento es la clave actual y el tercero es la nueva clave
        try {
            usuarioService.modificarClaveUsuario("mengano@outlook.com", "40908692", "41909693");
            usuarioService.modificarClaveUsuario("sultano@outlook.com", "40908692", "42910694");
            usuarioService.modificarClaveUsuario("fulano@outlook.com", "40908692", "43911695");
            usuarioService.imprimirUsuarios();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error del sistema por \n" + e.getMessage());
        }

        //Eliminamos un usuario por un correo 
        try {
            usuarioService.eliminarUsuario("facunglez@gmail.com");
            usuarioService.imprimirUsuarios();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error del sistema por \n" + e.getMessage());
        }

        //Buscamos un usuario que fue creado anteriormente y lo asignamos a la mascota que crearemos
        try {

            Usuario usuario = usuarioService.buscarUsuarioPorCorreoElectronico("fngz7788@gmail.com"); //Buscamos un usuario con el email y lo guardamos en un molde para asignarlo luego a la mascota que crearemos
            //Creamos Mascota con el Usuario anterior
            mascotaService.crearMascota("Chiquito", "Beagle", usuario);

            //Mostramos Mascota con su Usuario
            mascotaService.imprimirMascotas();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error del sistema por \n" + e.getMessage());
        }
    }
}
