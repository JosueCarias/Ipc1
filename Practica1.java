package usac.edu.ip1;

import java.util.Scanner;
public class Practica1 
{
   //definicion de variables globales
    public static String num1="";
    public static String num2="";
    public static String opcion="";
    public static String clase="";
    public static double factorial =0;
    public static int contador=0;
    public static double senG=0;
    public static double cosG=0;
    public static String[] datos;
    public static String num3="";
    public static float matriz[][];
    public static int var;
        
    public static void main(String[] args ) {
        //Procesos
        getMenuPrincipal();
    }
    /*
     * Objetos para crear menus
     */
    //Objeto para obtener el menu principal
    //Objeto para obtener los menus interso
    public static void getMenuInterno(String opcion, String clase) {
        showText("Usted a ingresado la opcion: "+clase);
        if(opcion.equals("1")){
            switch(clase){
                case "1":
                    getFilTwo();      
                    getSum(num1, num2);
                    showText("Presione enter para continuar");
                    readText();
                    getArit(); 
                    clase=readText(); 
                    getMenuInterno(opcion,clase);
                     
                    break;
                case "2": 
                    getFilTwo();         
                    getResta(num1, num2);
                    showText("Presione enter para continuar");
                    readText();
                    getArit(); 
                    clase=readText(); 
                    getMenuInterno(opcion,clase);
                    break;
                case "3":
                    getFilTwo();
                    getMul(num1, num2);
                    showText("Presione enter para continuar");
                    readText();
                    getArit(); 
                    clase=readText(); 
                    getMenuInterno(opcion,clase);
                    break;
                case "4":  
                    getFilTwo();
                    getDiv(num1, num2);
                    showText("Presione enter para continuar");
                    readText();
                    getArit(); 
                    clase=readText(); 
                    getMenuInterno(opcion,clase);
                    break;
                case "5":
                    getMenuPrincipal();
                    break;
                default:
                showText("El numero esta fuera de las opciones");
            }
        }
        if(opcion.equals("2")){
            switch(clase){
                case "1":
                    showText("ingrese el valor de x");
                    num1=readText();
                    showText("ingrese el valor de n");
                    num2=readText();
                    getSen();
                    showText("El seno es: "+senG);
                    showText("Presione enter para continuar");
                    readText();
                    getTrig();
                    clase=readText(); 
                    getMenuInterno(opcion,clase);
                    break;
                case "2": 
                    showText("ingrese el valor de x");
                    num1=readText();
                    showText("ingrese el valor de n");
                    num2=readText();
                    getCos();
                    showText("El coseno es: "+cosG);
                    showText("Presione enter para continuar");
                    readText();
                    getTrig();
                    clase=readText(); 
                    getMenuInterno(opcion,clase);
                    break;
                case "3":
                    showText("ingrese el valor de x");
                    num1=readText();
                    showText("ingrese el valor de n");
                    num2=readText();
                    getTan();
                    showText("Presione enter para continuar");
                    readText();
                    getTrig();
                    clase=readText(); 
                    getMenuInterno(opcion,clase);
                    break;
                case "4":   
                    getMenuPrincipal();
                    break;
                default:
                showText("El numero esta fuera de las opciones");
            }
        }
        if(opcion.equals("3")){
            switch(clase){
                case "1":
                    showText("ingrese una cadena de numeros reales separado por comas: ");
                    num1=readText();
                    getMedia();
                    showText("el promedio de "+num1+" es: "+num2);
                    showText("Presione enter para continuar");
                    readText();
                    getSta();
                    clase=readText(); 
                    getMenuInterno(opcion,clase);
                break;
                case "2":
                    showText("ingrese una cadena de numeros reales separado por comas: ");
                    num1=readText();
                    getVarianza();
                    showText("la varianza de "+num1+" es: "+num2);
                    showText("Presione enter para continuar");
                    readText();
                    getSta();
                    clase=readText(); 
                    getMenuInterno(opcion,clase);
                break;
                case "3":
                    showText("ingrese una cadena de numeros reales separado por comas: ");
                    num1=readText();
                    getDesviacion();
                    showText("la desviacion de "+num1+" es: "+num2);
                    showText("Presione enter para continuar");
                    readText();
                    getSta();
                    clase=readText(); 
                    getMenuInterno(opcion,clase);
                break;
                case "4":
                    getMenuPrincipal();
                    break;
                default:
                showText("El numero esta fuera de las opciones");
            }
        }
        if(opcion.equals("4")){
            switch(clase){
                case "1":
                    getGauss();
                    showText("La solucion: ");
                    showText("Presione enter para continuar");
                    readText();
                    getCal();
                    clase=readText(); 
                    getMenuInterno(opcion,clase);
                    break;
                case "2":
                    getMenuPrincipal();
                    break;
                default:
                showText("El numero esta fuera de las opciones");
            }
        }
    } 
    public static void getMenu() {
        showText("Menu");
        showText("1. Aritmetica");
        showText("2. Trigonometria");
        showText("3. Estadistica");
        showText("4. Calculo");
        showText("5. Salir");
    }
    //Objeto para obtener el menu de aritmetica
    public static void getArit() {
        showText("Aritmetica");
        showText("1. Suma");
        showText("2. Resta");
        showText("3. Multiplicacion");
        showText("4. Division");
        showText("5. Regresar");
    }
    //Objeto para obtener el menu de trigonometria
    public static void getTrig() {
        showText("Trigonometria");
        showText("1. Seno");
        showText("2. Coseno");
        showText("3. Tangente");
        showText("4. Regresar");
    }
    //Objeto para obtener el menu de calculo
    public static void getCal() {
        showText("Calculo");
        showText("1. Resolver sistema de ecuaciones lineales Nxm con Gauss-Jordan");
        showText("2. Regresar");
    }
    //Objeto para obtener el menu de estadistica
    public static void getSta() {
        showText("Estadistica");
        showText("1. Media");
        showText("2. Varianza");
        showText("3. Desviacion estandar");
        showText("4. Regresar");
    }
    //Objeto para tomar la desicion de que menu cargar
    public static void getSelec(String opcion){
        showText("Usted a ingresado la opcion: "+opcion);
        switch(opcion){
            case "1":
                getArit();
                break;
            case "2":
                getTrig();
                break;
            case "3":
                getSta();
                break;
            case "4":
                getCal();
                break;
            case "5":
                showText("Saliendo");
                getExit();
                break;
            default:
            showText("El numero esta fuera de las opciones");
        }
    }
    //objeto para generar el menu procipal
    public static void getMenuPrincipal() {
        getMenu();
        opcion=readText();
        getSelec(opcion);
        clase=readText();
        getMenuInterno(opcion,clase);
    }
    /*
     * funciones aritmetica 
     */
    //Objeto para obtener suma
    public static void getSum(String num1, String num2){
        float suma=0;
        suma=Float.parseFloat(num1)+Float.parseFloat(num2);
        showText("La suma de "+num1+"+"+num2+"="+suma);
    }
     //Objeto para obtener  resta
    public static void getResta(String num1, String num2){
        float resta=0;
        resta=Float.parseFloat(num1)-Float.parseFloat(num2);
        showText("La resta de "+num1+"-"+num2+"="+resta);
    }
    //Objeto para obtener multiplicacion
    public static void getMul(String nun1, String nun2){
        float multiplicacion =0;
        multiplicacion=Float.parseFloat(num1)*Float.parseFloat(num2);
        showText("La multiplicacion de "+num1+"*"+num2+"="+multiplicacion);
    }
    //Objeto para obtener division
    public static void getDiv(String num1, String num2){
        float division=0;
        if(num2.equals("0")){
            showText("El numerado es cero");
            showText("Ingrese el segundo numero");
            num2=readText();
        }
        division=Float.parseFloat(num1)/Float.parseFloat(num2);
        showText("La division de "+num1+"/"+num2+"="+division);
    }
    /*
     * funciones de entradas y salidas
     */
    //Objeto para la captura de 2 numeros
    public static void getFilTwo() {
        showText("Ingrese el primer numero: ");
        num1=readText();
        showText("Ingrese el segundo numero");
        num2=readText();
    }
    //objeto para leer un solo numero
    public static void getFilOne() {
        showText("Ingrese el primer numero: ");
        num1=readText();
    }
    //objeto para salir del programa
    public static void getExit() {
        System.exit(0);
    }
    //Objeto para salida de texto
    public static void showText(String msg){
        System.out.println(msg);
    }
    //Objeto para captura de texto
    public static String readText(){
        return System.console().readLine();
    }
    /*
     * Objetos para las funciones trigonometricas
     */
    //Objeto para obtener el seno
    public static void getSen() {
        factorial =0;
        contador=0;
        double seno=0;
        for(int n=0;n<Integer.parseInt(num2);n++){
            getFacSen();
            seno+=((Math.pow(-1, n))*(Math.pow(Math.toRadians(Integer.parseInt(num1)), (2*n+1))))/(factorial);        
            contador++;
        }
        senG=seno;
    }
    //Objeto para obtener el factorial del seno
    public static void getFacSen() {
        int num=2*contador+1;
        factorial=1;
        while(num!=0){
            factorial=factorial*num;
            num--;
        }
    }
    //Objeto para obtener el coseno
    public static void getCos() {
        double cos=0;
        factorial =0;
        contador=0;
        for(int n=0;n<Integer.parseInt(num2);n++){
            getFacCos();
            cos+=((Math.pow(-1, n))*(Math.pow((Math.toRadians(Integer.parseInt(num1))), (2*n))))/(factorial);        
            contador++;
        }
        cosG=cos;
    }
    //Objeto para obtener el factorial del coseno
    public static void getFacCos() {
        int num=2*contador;
        factorial=1;
        while(num!=0){
            factorial=factorial*num;
            num--;
        }
    }
    //Objeto para obtener la tangente
    public static void getTan(){
        double tan=0;
        factorial =0;
        contador=0;
        getSen();
        getCos();
        tan=senG/cosG;
        showText("La tangente de "+num1+" es: "+tan);
    }
    //Objeto para obterner la cadena de datos
    public static String[] getCadena(String msg){
        String cadena=msg;
        String[] lista=cadena.split(",");
    return lista;
    }
    //Objeto para obtener la media
    public static void getMedia() {
        float promedio=0;
        for(int a=0;a<getCadena(num1).length;a++){
            promedio+=Integer.parseInt(getCadena(num1)[a]);
        }
        promedio=promedio/getCadena(num1).length;
        num2=""+promedio; 
    }
    //Objeto para obterner la varianza
    public static void getVarianza() {
        float varianza=0;
        double diferencia=0;
        float promedio=0;
        getMedia();
        promedio=Float.parseFloat(num2);
        for (int a=0;a<getCadena(num1).length;a++){
            diferencia=(Integer.parseInt(getCadena(num1)[a]))-promedio;
            varianza+=(float) Math.pow(diferencia, 2);
        }
        varianza=varianza/(getCadena(num1).length);
        num2=""+varianza;
    }
    //Objeto para obtener la desviacion 
    public static void getDesviacion() {
        getVarianza();
        num2=""+Math.sqrt(Float.parseFloat(num2));
    }
    
    /*
     * funciones para gauss jordan
     */
    // objeto para imprimer matriz
    public static void muestramatriz(float matriz[][], int var) {
        for (int x = 0; x < var; x++) {
            for (int y = 0; y < (var + 1); y++) {
                System.out.print(" " + matriz[x][y] + " |");
            }
            showText("");
        }
    }
    //objeto para hacer pivote 
    public static void pivote(float matriz[][], int piv, int var) {
        float temp = 0;
        temp = matriz[piv][piv];
        for (int y = 0; y < (var + 1); y++) {

            matriz[piv][y] = matriz[piv][y] / temp;
        }
    }
    //objeto para hacer el la diagonal inferio y superior
    public static void hacerceros(float matriz[][], int piv, int var) {
        for (int x = 0; x < var; x++) {
            if (x != piv) {
                float c = matriz[x][piv];
                for (int z = 0; z < (var + 1); z++) {
                    matriz[x][z] = ((-1 * c) * matriz[piv][z]) + matriz[x][z];
                }
            }
        }
    }
    //objeto para resolver sistema 
    public static void getGauss() {
        Scanner leer = new Scanner(System.in);
        int var = 0, piv = 0;
        float matriz[][];
        showText("\n¿Cuantas lineas tiene el sistema de ecuaciones?");
        var = leer.nextInt();
        matriz = new float[var][var + 1];
        for (int x = 0; x < var; x++) {
            for (int y = 0; y < (var + 1); y++) {
                showText("Ingresa la constante de la posicion: A[" + (x + 1) + "][" + (y + 1) + "]");
                matriz[x][y] = leer.nextFloat();
            }

        }

        for (int a = 0; a < var; a++) {
            pivote(matriz, piv, var);

            showText("\tRenglon " + (a + 1) + " entre el pivote");
            muestramatriz(matriz, var);

            showText("");

            showText("\tHaciendo ceros");
            hacerceros(matriz, piv, var);

            muestramatriz(matriz, var);
            showText("");
            piv++;
        }
        for (int x = 0; x < var; x++) {
            showText("La variable X" + (x + 1) + " es: " + matriz[x][var]);
        }
    }
}