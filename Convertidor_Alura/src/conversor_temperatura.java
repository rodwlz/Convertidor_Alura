
public class conversor_temperatura {

    public static double unidades(String opcion, Double temperaturaInicial){

Double temperatura = 0.0;
System.out.println(opcion);
        switch (opcion) {
            case "Celcius/Fahrenheit":
                temperatura = (temperaturaInicial * 9 / 5) + 32;
                break;
            case "Celcius/Kelvin":
                temperatura = temperaturaInicial + 273.15;
                break;
            case "Fahrenheit/Kelvin":
                temperatura = (temperaturaInicial + 459.67) * 5 / 9;
                break;
            case "Kelvin/Fahrenheit":
                temperatura = (temperaturaInicial * 9 / 5) - 459.67;
                break;
            case "Kelvin/Celcius":
                temperatura = temperaturaInicial - 273.15;
                break;
        }
        return temperatura;
    }
    
}
