package edu.usac.ipc1;

public class tarea1 
{
    public static void main( String[] args )
    {
        //Definicion de variables
        String cadena="";
        //Entrada de datos
        showText("Ingrese Una Cadena De Numeros Separado Por Comas: ");
        //Procesos
        cadena=readText();
        //salidas
        showText("");
        getParesOImpares(cadena);
        showText("");
        showText("La suma de los numeros pares es: "+getSumaPares(cadena));
        showText("La suma de los numeros impares es: "+getSumaImpares(cadena));
        showText("");
        showText(getComparacion(cadena));    
    }  
    //Objeto para salida de texto
    public static void showText(String msg){
        System.out.println(msg);
    }
    //Objeto para captura de texto
    public static String readText(){
        return System.console().readLine();
    }
    //Objecto para obtener los numeros de sin la coma
    public static String[] getDatos(String msg){
            String cadena=msg;
            String[] lista=cadena.split(",");
        return lista;
    }
    //Objeto para saber si el numero es par o impar
    public static String getParesOImpares(String msg){
        String cadena=msg;
        for(int a=0;a<getDatos(cadena).length;a++){
            if(Integer.parseInt(getDatos(cadena)[a])%2==0){
                showText("El numero "+getDatos(cadena)[a]+" es par");
            }
            else{
                showText("El numero "+getDatos(cadena)[a]+" es impar");       
            }
        }
        return cadena;
    }
    //Objeto para saber la suma de numeros pares
    public static int getSumaPares(String msg){
        String cadena=msg;
        int sumaPares=0;
        for(int a=0;a<getDatos(cadena).length;a++){
            if(Integer.parseInt(getDatos(cadena)[a])%2==0){
                sumaPares+=Integer.parseInt(getDatos(cadena)[a]);
            }
        }
        return sumaPares;
    }
    //Objeto para saber la suma de numeros impares
    public static int getSumaImpares(String msg){
        String cadena=msg;
        int sumaImpares=0;
        for(int a=0;a<getDatos(cadena).length;a++){
            if(Integer.parseInt(getDatos(cadena)[a])%2!=0){
                sumaImpares+=Integer.parseInt(getDatos(cadena)[a]);
            }
        }
        return sumaImpares;
    }
    //Objeto para saber cual es mayor entre la suma de los pares o impares
    public static String getComparacion(String msg){
        String cadena=msg;
        String salida="";
        if(getSumaPares(cadena)>getSumaImpares(cadena)){
            salida="suma de los pares es mayor";
        }
        if(getSumaPares(cadena)<getSumaImpares(cadena)){
            salida="La suma de los impares es mayor";
        }
        if(getSumaPares(cadena)==getSumaImpares(cadena)){
            salida="La suma de los pares e impares es igual";
        }
        return salida;
    }
}