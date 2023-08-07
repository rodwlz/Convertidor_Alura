public class App {
    public static void main(String[] args) throws Exception {
        
Double cantidad1 = 0.0;
Double resultado = 0.0;
String opcion1 = menus.menu_principal();
String opcion2 = new String();

        switch (opcion1){ // Case para el menu
            case "Conversor de moneda":
                cantidad1 = menus.get_cantidad_inicial(); //llamar a conversor moneda
                opcion2 = menus.menu_monedas();
                resultado = conversor_moneda.Divisas(opcion2, cantidad1);
                System.out.println(opcion2 + " = " + resultado);

                break;
            case "Conversor de temperatura":
                cantidad1 = menus.get_cantidad_inicial(); //llamar a conversor moneda
                opcion2 = menus.menu_temperaturas();
                resultado = conversor_temperatura.unidades(opcion2,cantidad1);
                System.out.println(opcion2 + " = " + resultado);
                break;

            case "Salir":
                break;
        }
    }
}
