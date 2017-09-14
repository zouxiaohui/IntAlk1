/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ja1;

/**
 *
 * @author a1brly
 */
public class JA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double hom =5;
        ia.TemperatureUnit honnan = ia.TemperatureUnit.DEGREE_CELSIUS;
        ia.TemperatureUnit hova = ia.TemperatureUnit.DEGREE_FAHRENHEIT;
        double eredmeny =convertTemp(hom,honnan,hova);
        System.out.println(
        "A "  + hom +  " C=" +eredmeny+ " F");
    }

    private static double convertTemp(double temperature, ia.TemperatureUnit fromUnit, ia.TemperatureUnit toUnit) {
        ia.ConvertTemperature service = new ia.ConvertTemperature();
        ia.ConvertTemperatureSoap port = service.getConvertTemperatureSoap();
        return port.convertTemp(temperature, fromUnit, toUnit);
        
    }

    }

