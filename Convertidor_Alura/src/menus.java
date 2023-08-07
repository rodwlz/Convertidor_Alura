import javax.swing.JOptionPane;

public class menus {
    
    public static String menu_principal() {
        // Menu principal
        String[] opciones = {"Conversor de moneda", "Conversor de temperatura", "Salir"};
        String opcionSeleccionada = (String) JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menú", JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

        return opcionSeleccionada;
    }

    public static Double get_cantidad_inicial(){
        String cantidad_inicial = (String) JOptionPane.showInputDialog("Cantidad a convertir");
    
            try {
                Double cantidad = Double.parseDouble(cantidad_inicial);
                return cantidad;
            } catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Error: Ingresa una cantidad válida.", "Error", JOptionPane.ERROR_MESSAGE);
                return 0.0;
            }
        }

    public static String menu_monedas() {
        // Menu Divisas
        String[] opciones = {"MXN/USD","MXN/EUR","MXN/LBS","MXN/YEN","MXN/WON","USD/MXN", "EUR/MXN", "LBS/MXN", "YEN/MXN", "WON/MXN"};
        String opcionSeleccionada = (String) JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Monedas", JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

        return opcionSeleccionada;
    }

    public static String menu_temperaturas() {
        // Menu Unidades de temp
        String[] opciones = {"Celsius/Fahrenheit","Celcius/Kelvin","Fahrenheit/Kelvin","Kelvin/Fahrenheit","Kelvin/Celcius"};
        String opcionSeleccionada = (String) JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Unidades", JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

        return opcionSeleccionada;
    }


}

