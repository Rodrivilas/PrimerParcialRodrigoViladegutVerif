package ejercicio3;

import ejercicio2.InicioDeSesion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class InicioDeSesionMockStaticTest {
    @BeforeAll
    public static void before(){
        MockedStatic<PermisoUtilStatic> objMockPermiso= Mockito.mockStatic(PermisoUtilStatic.class);
        MockedStatic<UserutilStatic> objMockUser= Mockito.mockStatic(UserutilStatic.class);
        objMockPermiso.when(()-> PermisoUtilStatic.permisos("Rodrigo","ex123")).thenReturn("CRUD");
        objMockPermiso.when(()-> PermisoUtilStatic.permisos("Ariel","ex123")).thenReturn("CRUD");
        objMockPermiso.when(()-> PermisoUtilStatic.permisos("Joaquin","ex123")).thenReturn("CUD");
        objMockPermiso.when(()-> PermisoUtilStatic.permisos("Sasha","ex123")).thenReturn("CD");
        objMockPermiso.when(()-> PermisoUtilStatic.permisos("Juan","ex123")).thenReturn("R");

        objMockUser.when(()-> UserutilStatic.userExists("Rodrigo","ex123")).thenReturn(false);
        objMockUser.when(()-> UserutilStatic.userExists("Ariel","ex123")).thenReturn(true);
        objMockUser.when(()-> UserutilStatic.userExists("Joaquin","ex123")).thenReturn(true);
        objMockUser.when(()-> UserutilStatic.userExists("Sasha","ex123")).thenReturn(true);
        objMockUser.when(()-> UserutilStatic.userExists("Juan","ex123")).thenReturn(true);
    }

    @Test
    public void inicioSesionFallido(){
        InicioDeSesionStatic inicioDeSesionStatic=new InicioDeSesionStatic();
        String expected="El usuario no existe";
        String actual=inicioDeSesionStatic.iniciarSesion("Rodrigo", "ex123");
        Assertions.assertTrue(actual.contains(expected),"Error");
    }

    @Test
    public void inicioSesionCRUD(){
        InicioDeSesionStatic inicioDeSesionStatic=new InicioDeSesionStatic();
        String expected="CRUD";
        String actual=inicioDeSesionStatic.iniciarSesion("Ariel", "ex123");
        Assertions.assertTrue(actual.contains(expected),"Error");
    }
    @Test
    public void inicioSesionCUD(){
        InicioDeSesionStatic inicioDeSesionStatic=new InicioDeSesionStatic();
        String expected="CUD";
        String actual=inicioDeSesionStatic.iniciarSesion("Joaquin", "ex123");
        Assertions.assertTrue(actual.contains(expected),"Error");
    }
    @Test
    public void inicioSesionCD(){
        InicioDeSesionStatic inicioDeSesionStatic=new InicioDeSesionStatic();
        String expected="CD";
        String actual=inicioDeSesionStatic.iniciarSesion("Sasha", "ex123");
        Assertions.assertTrue(actual.contains(expected),"Error");
    }
    @Test
    public void inicioSesionR(){
        InicioDeSesionStatic inicioDeSesionStatic=new InicioDeSesionStatic();
        String expected="R";
        String actual=inicioDeSesionStatic.iniciarSesion("Juan", "ex123");
        Assertions.assertTrue(actual.contains(expected),"Error");
    }

}
