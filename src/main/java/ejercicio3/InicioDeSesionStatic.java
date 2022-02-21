package ejercicio3;

public class InicioDeSesionStatic {
    public InicioDeSesionStatic() {

    }

    public String iniciarSesion(String user, String password){
        String msg="";
        if(UserutilStatic.userExists(user,password)){
            msg=PermisoUtilStatic.permisos(user,password)+" - " +java.time.LocalDateTime.now();
        }else{
            msg="El usuario no existe";
        }
        return msg;
    }
}
