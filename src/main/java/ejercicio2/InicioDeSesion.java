package ejercicio2;

public class InicioDeSesion {
    PermisoUtil permisoUtil;
    Userutil userutil;

    public InicioDeSesion(PermisoUtil permisoUtil, Userutil userutil) {
        this.permisoUtil = permisoUtil;
        this.userutil = userutil;
    }

    public String iniciarSesion(String user, String password){
        String msg="";
        if(userutil.userExists(user,password)){
            msg=permisoUtil.permisos(user,password)+" - " +java.time.LocalDateTime.now();
        }else{
            msg="El usuario no existe";
        }
        return msg;
    }
}
