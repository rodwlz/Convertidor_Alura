public class App {
    public static void main(String[] args) throws Exception {
        
Double cantidad1 = 0.0;
Double resultado = 0.0;

String opcion2 = new String();
String message = "";
double rr = 0.00;
boolean run = true;

while(run){
    String opcion1 = menus.menu_principal();
    
    
    if(opcion1 != "Salir") {
        cantidad1 = menus.get_cantidad_inicial(); //llamar a conversor moneda

                switch (opcion1){ // Case para los submenus
            case "Conversor de moneda":
                opcion2 = menus.menu_monedas(); //Divisas a seleccionar
                resultado = conversor_moneda.Divisas(opcion2, cantidad1); //Conversion
                break;
            case "Conversor de temperatura":
                opcion2 = menus.menu_temperaturas();
                resultado = conversor_temperatura.unidades(opcion2,cantidad1);
                break;
                }

        rr=Math.round(resultado*100)/100; //Redondear a 2 digitos
        message=(opcion2 + " = " + rr); //mensaje a enviar al usuario
        menus.ShowResult(message); //Desplegar resultado
        run = menus.Continue(); //Desea continuar?

    } //End if
   
} //End While
    run=false;
    menus.exit();

}//End Class

       
}
