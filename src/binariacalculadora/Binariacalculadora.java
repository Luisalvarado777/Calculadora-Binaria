
package binariacalculadora;

import java.util.Scanner;

public class Binariacalculadora {

    public static void main(String[] args) {
        

        int opc;

        do {
            Scanner scn = new Scanner(System.in);
            System.out.println("*.- MENU SWITCH .-*");
            System.out.println("1.- Binario a decimal");
            System.out.println("2.- Decimal a binario");
            System.out.println("3.- Suma binaria");
            System.out.println("4.- Resta binaria");
            System.out.println("5.- Multiplicacion binaria");
            System.out.println("6.- SALIR");
            System.out.print("INGRESE OPCION: ");
            opc = scn.nextInt();


            switch (opc) {
                case 1:
                    
                    String binario;
                    int decimal =0;
                    System.out.println("Ingrese el binario");
                    Scanner numero = new Scanner(System.in);
                    binario = numero.next();
	
                    for (int i =0; i<binario.length(); i++){
                        if(binario.charAt(i) =='1'){
                            decimal += Math.pow(2, i);	
                        }	else if (binario.charAt(i)!='0'){
                            System.out.println("Revise el numero ingresado");
                            System.exit(0);
                        }
                    }
                    System.out.println("El resultado es: "+decimal);
                    
                    break;
                    
                case 2:
                    Scanner leer = new Scanner (System.in);
                    
                    int modulo;
                    
                    String binario1 = " ";
                    System.out.println("Ingrese numero decimal");
                    decimal=leer.nextInt();
                    
                    while (decimal > 0){
                        modulo = (decimal%2);
                    binario1 = modulo + binario1;
                        decimal = decimal/2;
                    }
                    System.out.println("El resultado es: "+binario1);
                    
                    break;
                    
                case 3:
                    Scanner leer1=new Scanner(System.in);
                  String n1=""; 
                   String n2=""; 
       System.out.println("Ingrese su numero en binario");//se pide el numero en binario
        n1=leer1.next();//se guarda nuestro numero 1
        System.out.println("Ingrese su numero binario numero 2");//aqui se pide el segundo numero
        n2=leer1.next();//guardara nuestro segundo numero

         System.out.println("Su resultado es: "+Suma(n1,n2));                  
                      
                       
                break;
                
                                
                case 4:
                    Scanner leer3=new Scanner(System.in);
                  String a=""; 
                   String b=""; 
       System.out.println("Ingrese su numero en binario");
        a=leer3.next();//se guarda nuestro numero 1
        System.out.println("Ingrese su numero binario numero 2");
        b=leer3.next();
                    
         System.out.println("Su resultado es: "+Resta(a,b));
         
                    break;
                    
                    
                case 5:
                    
                
                    
                    break;    
                
                case 6:
                     System.exit(0);
            }

        } while (opc <= 6);
    }

    
    public static String Suma(String n1, String n2){
        int a1=Integer.parseInt(n1,2);
        int a2=Integer.parseInt(n2,2);
                int c=a1+a2;
                String resultado=Integer.toString(c ,2);
    
        
        return resultado;
    }
    
    public static String Resta(String a, String b) {
        int a1 = Integer.parseInt(a, 2);
        int b1 = Integer.parseInt(b, 2);
                 int c1 = a1 - b1;
        String resultado = Integer.toString(c1, 2);
        return resultado;
    }
    }
 
  

