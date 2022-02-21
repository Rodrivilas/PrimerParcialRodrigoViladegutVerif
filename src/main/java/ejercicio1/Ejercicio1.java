package ejercicio1;

public class Ejercicio1 {
    public String porcentajeSalario(int salario) {
        String mensaje;
        if(salario<=0){
           mensaje="Use un salario valido";
        }
        else if(salario>=4000){
            mensaje="Tiene 15% de descuento";
        }else if(salario>=2000){
            mensaje="Tiene 5% de descuento";
        }else{
            mensaje="No tiene descuento";
        }
        return mensaje;
    }
}
