package primero.redes.sistemas.proyectooperacionesmatematicas;

import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class ClaseEjecutableOperacionesMAtematicas {

    public static void main(String[] args) {
        Operaciones operacion = new Operaciones();
        Areas areas=new Areas();

        double num1 = 0, num2 = 0;

        Scanner sc = new Scanner(System.in);
        int op = 0;
        int op1,opA;
        

        do {

            System.out.println("MENU OPERACIONES");

            System.out.println("1. Operaciones");
            System.out.println("2. Areas");
            System.out.println("3. Salir");
            System.out.println("Escoja una opcion");
            op1 = sc.nextInt();
            do {

                switch (op1) {
                    case 1:
                        System.out.println("1. Suma");
                        System.out.println("2. Resta");
                        System.out.println("3. Multiplicacion");
                        System.out.println("4. Division");
                        System.out.println("5. Salir");
                        op = sc.nextInt();

                        if (op != 5) {
                            System.out.println("Ingrese el primer numero: ");
                            num1 = sc.nextDouble();

                            System.out.println("Ingrese el segundo numero: ");
                            num2 = sc.nextDouble();

                        }

                        switch (op) {

                            case 1:
                                //metodo suma 
                                operacion.sumar(num1, num2);
                                break;
                            case 2:
                                //metodo resta
                                operacion.restar(num1, num2);
                                break;
                            //metodo multiplicacion return
                            case 3:
                                System.out.println("La multiplicacion es: " + operacion.multiplicar(num1, num2));
                                break;
                            case 4:
                                //metodo division
                                operacion.diviir(num1, num2);
                                break;
                            case 5:
                                System.out.println("Gracias por usar nuestro programa");
                                break;
                            default:
                                System.out.println("Opcion no valida");
                        }

                        break;
                    case 2:
                        do {

                            System.out.println("Areas");
                            System.out.println("1. Circulo");
                            System.out.println("2. Cuadrado");
                            System.out.println("3. Triangulo equilatero");
                            System.out.println("4. Rectangulo");
                            System.out.println("5. Salir");
                            System.out.println("Escoja una opcion");
                            opA = sc.nextInt();
                            if (opA != 5) {
                                switch (opA) {

                                    case 1:
                                        //metodo circulo
                                        System.out.println("Ingrese el valor del radio: ");
                                        num1=sc.nextInt();
                                        areas.circulo(num1);
                                        break;
                                    case 2:
                                        //metodo cuadrado
                                        System.out.println("Ingrese el valor del lado del cuadrado: ");
                                        num1=sc.nextInt();
                                        areas.cuadrado(num1);
                                        break;
                                    //metodo tequilatero
                                    case 3:
                                        System.out.println("Ingrese el valor del lado del triangulo: ");
                                        num1=sc.nextInt();
                                        areas.tequilatero(num1);
                                        break;
                                    case 4:
                                        //metodo rectangulo
                                        System.out.println("Ingrese el valor de la base: ");
                                        num1=sc.nextInt();
                                        System.out.println("Ingrese el valor del altura: ");
                                        num2=sc.nextInt();
                                        areas.rectangulo(num1, num2);
                                        break;
                                    case 5:
                                        System.out.println("Gracias por usar nuestro programa");
                                        break;
                                    default:
                                        System.out.println("Opcion no valida");
                                }
                                break;

                            }else System.out.println("Gracias por usra nuestro programa");

                        } while (opA != 5);

                        break;
                    case 3:
                        System.out.println("Gracias por usar nuestro programa.");
                    default:
                        System.out.println("Opcion no valida ");
                }
            } while (op != 5);

        } while (op1 != 3);
    }
}
