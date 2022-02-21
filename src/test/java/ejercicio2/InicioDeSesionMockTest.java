package ejercicio2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class InicioDeSesionMockTest {
    PermisoUtil permisoUtilM= Mockito.mock(PermisoUtil.class);
    Userutil userutilM= Mockito.mock(Userutil.class);

    @Test
    public void inicioSesionRechazado(){
    Mockito.when(permisoUtilM.permisos("Rodrigo","ex123")).thenReturn("CRUD");
    Mockito.when(userutilM.userExists("Rodrigo","ex123")).thenReturn(false);
    InicioDeSesion inicioDeSesion=new InicioDeSesion(permisoUtilM,userutilM);
    String actual=inicioDeSesion.iniciarSesion("Rodrigo","ex123");
    String expected="El usuario no existe";
    Assertions.assertEquals(actual,expected,"Error");

    }

    @Test
    public void inicioSesionAceprtadoCRUD(){
        Mockito.when(permisoUtilM.permisos("Rodrigo","ex123")).thenReturn("CRUD");
        Mockito.when(userutilM.userExists("Rodrigo","ex123")).thenReturn(true);
        InicioDeSesion inicioDeSesion=new InicioDeSesion(permisoUtilM,userutilM);
        String actual=inicioDeSesion.iniciarSesion("Rodrigo","ex123");
        String expected="CRUD";

        Assertions.assertTrue(actual.contains(expected),"Error");
    }

    @Test
    public void inicioSesionAceprtadoCUD(){
        Mockito.when(permisoUtilM.permisos("Rodrigo","ex123")).thenReturn("CUD");
        Mockito.when(userutilM.userExists("Rodrigo","ex123")).thenReturn(true);
        InicioDeSesion inicioDeSesion=new InicioDeSesion(permisoUtilM,userutilM);
        String actual=inicioDeSesion.iniciarSesion("Rodrigo","ex123");
        String expected="CUD";

        Assertions.assertTrue(actual.contains(expected),"Error");
    }
    @Test
    public void inicioSesionAceprtadoCD(){
        Mockito.when(permisoUtilM.permisos("Rodrigo","ex123")).thenReturn("CD");
        Mockito.when(userutilM.userExists("Rodrigo","ex123")).thenReturn(true);
        InicioDeSesion inicioDeSesion=new InicioDeSesion(permisoUtilM,userutilM);
        String actual=inicioDeSesion.iniciarSesion("Rodrigo","ex123");
        String expected="CD";

        Assertions.assertTrue(actual.contains(expected),"Error");
    }
    @Test
    public void inicioSesionAceprtadoR(){
        Mockito.when(permisoUtilM.permisos("Rodrigo","ex123")).thenReturn("R");
        Mockito.when(userutilM.userExists("Rodrigo","ex123")).thenReturn(true);
        InicioDeSesion inicioDeSesion=new InicioDeSesion(permisoUtilM,userutilM);
        String actual=inicioDeSesion.iniciarSesion("Rodrigo","ex123");
        String expected="R";

        Assertions.assertTrue(actual.contains(expected),"Error");
    }
}
