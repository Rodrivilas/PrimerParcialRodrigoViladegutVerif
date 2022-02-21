package ejercicio2;

public class inicioDeSesion {
    PermisoUtil permisoUtil;
    Userutil userutil;

    public inicioDeSesion(PermisoUtil permisoUtil, Userutil userutil) {
        this.permisoUtil = permisoUtil;
        this.userutil = userutil;
    }

    public String iniciarSesion(String user, String password){
        if(userutil.userExists(user,password)){

        }
    }
}
