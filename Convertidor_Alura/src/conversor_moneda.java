public class conversor_moneda {
    
    public static Double Divisas(String opcion, Double cantidad1){

        Double resultado = 0.0;
        Double FC = 0.0;

        switch(opcion){ //Tasas de cambio al 07/08/23 3:38 pm
            case "MXN/USD":
                FC = 0.059; // Código para la conversión MXN a USD
            break;
        case "MXN/EUR":
                FC = 0.053; // Código para la conversión MXN a EUR
            break;
        case "MXN/LBS":
                FC = 0.046; // Código para la conversión MXN a LBS
            break;
        case "MXN/YEN":
                FC = 8.35; // Código para la conversión MXN a YEN
            break;
        case "MXN/WON":
                FC = 76.67; // Código para la conversión MXN a WON
            break;
        case "USD/MXN":
                FC = 17.06; // Código para la conversión USD a MXN
            break;
        case "EUR/MXN":
                FC = 18.77; // Código para la conversión EUR a MXN
            break;
        case "LBS/MXN":
                FC = 21.81; // Código para la conversión LBS a MXN
            break;
        case "YEN/MXN":
                FC = 0.12; // Código para la conversión YEN a MXN
            break;
        case "WON/MXN":
                FC = 0.13; // Código para la conversión WON a MXN
            break;
    }

        resultado = cantidad1 * FC;
        return resultado;
    }


}
