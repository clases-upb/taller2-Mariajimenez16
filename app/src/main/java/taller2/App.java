/*
 * Este es el segundo taller de lógica de programación. En este taller deben comenzar a prácticar hacer las validaciones
 * de los datos que va a recibir la función usando los condicionales if. 
 * 
 * Como en el anterior, tenga en cuenta la siguiente rúbrica para cada ejercicio la cual, 
 * se basa en los mandamientos del programador. El taller es una herramienta para comenzar a preparar la evaluación 
 * donde los descuentos si van a ser tenidos en cuenta. 
 * Con este taller, usted irá aprendiendo a aplicar buenas prácticas en la programación.
 * 
 * La siguiente rúbrica se descuenta en cada ejercicio y es acumulativa:
 * Descuento por quemar valores en el código y no usar constantes: -0.5
 * Descuento por no implementar control de errores con trycatch: -0.8
 * Descuento por no escribir el código ordenado, identado: -0.4
 * 
 * RÉTESE, PÓNGASE A PRUEBA!!!
 * 
 */
package taller2;

public class App {

    public static void main(String[] args) {
        try {
            System.out.println(Calcular_saldo(2000000, 500000, 1000000));
        System.out.println(Calcular_tip(100));
        System.out.println(Obtener_puntos(3, 2, 1));
        System.out.println(Calcular_definitiva(4, 4, 4, 4, 4, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f));
        System.out.println(Calcular_para_ganar(3, 3, 3, 3, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f));
        System.out.println(Calcular_salario(40, 10, 5, 20000));
        System.out.println(Calcular_area_triangulo(10, 5));
        System.out.println(Calcular_perimetro_cuadrado(5));
        System.out.println(Calcular_volumen_cilindro(5, 10));
        System.out.println(Calcular_area_circulo(5));


    
        } 
        
        catch (Exception e) {
            System.out.println(e);
        }


    }


    /*
     * 1. Diseñe un algoritmo e implemente la función Calcular_saldo que reciba
     * tres enteros: la base de dinero en la taquilla, el total de recaudos y
     * el total de retiros, y retorne un entero que represente el saldo final
     * en la taquilla.
     * 
     * Valide que la base sea igual a 2.000.000. Si no es así, retorne -1.
     * 
     * saldo_taquilla = base + total recaudos - total_retiros
     * Si hay algún error, retorne -1.
     */
public static int Calcular_saldo(int base_dinero, int total_recaudos, int total_retiros) {
        try {
           int saldo_taquilla = base_dinero + total_recaudos - total_retiros;
           if (base_dinero == 2000000){
            return saldo_taquilla;
           }else{
            return -1;
           }

        } catch (Exception e) {
            return -1;
        }
    }


    /*
     * 2. Diseñe un algoritmo e implemente la función Calcular_tip que reciba
     * un float representando el valor del consumo de un cliente, y devuelva
     * un string que contenga el valor de la propina (10%), el impuesto al
     * consumo (8%) y el valor total a pagar.
     * 
     * MUY IMPORTANTE:
     * 
     * El formato del string debe ser: valor comida: $### - valor propina $### -
     * valor impoconsumo $### - total a pagar $###.
     * 
     * Si hay algún error, retorne "Error en la función Calcular_tip".
     * 
     * Ademas de esto, primero valide que el valor del consumo sea mayor a 0. Si no
     * es así, retorne "Error calculando consumo".
     * 
     */
        public static String Calcular_tip(float valor_consumo) {
        try {
            float valor_propina = valor_consumo * 0.10f;
            float valor_impuesto = valor_consumo * 0.08f;
            float total_pagar = valor_consumo + valor_propina + valor_impuesto;

            if (valor_consumo <= 0) {
                return "error calculando consumo";
            }
            String resultado = "valor comida: $" + valor_consumo + "- valor propina: $" + valor_propina
                    + " - valor impoconsumo: $" + valor_impuesto + "; - total a pagar: $" + total_pagar;
            return resultado;
        } catch (Exception e) {
            return "Error en la función Calcular_tip";

        }
    }


    /*
     * 3. Diseñe un algoritmo e implemente la función Obtener_puntos que reciba
     * tres enteros representando el número de partidos ganados, perdidos y
     * empatados de un equipo de fútbol, y devuelva un entero que represente
     * los puntos totales del equipo. La puntuación sigue los lineamientos
     * de la FIFA: 3 puntos por partido ganado, 1 punto por partido empatado y
     * 0 puntos por partido perdido. Si hay algún error, retorne -1.
     * 
     * Valide ademas que los partidos ganados, perdidos y empatados sean mayores o
     * iguales a 0. Si no es así, retorne -1.
     * 
     */
    public static int Obtener_puntos(int ganados, int perdidos, int empatados) {
        try {
            int puntos = 0; 
    
            if (ganados < 0 || perdidos < 0 || empatados < 0) {
                puntos = -1;
            } else {
                puntos = (ganados * 3) + (empatados * 1); 
            }
    
            return puntos;
        } catch (Exception e) {
            return -1; 
        }
    }

    /*
     * 4. Diseñe un algoritmo e implemente la función Calcular_definitiva que
     * reciba cinco floats representando las notas (entre 0 y 5) y cinco floats
     * representando los porcentajes (que entre todos deberán sumar 1 y cada uno
     * estar entre 0 y 1),
     * y devuelva un float que represente la nota definitiva. Si algo está mal
     * con los porcentajes o con las notas, retorne -1.
     */
       public static float Calcular_definitiva(float N1, float N2, float N3, float N4, float N5, float P1, float P2,float P3,float P4, float P5) {
        try {
            float definitiva = 0;
            float suma_porcentajes = 0;

            if (N1 < 0 || N1 > 5 || N2 < 0 || N2 > 5 || N3 < 0 || N3 > 5 || N4 < 0 || N4 > 5 || N5 < 0 || N5 > 5) {
                return -1;
            }

            if (P1 < 0 || P1 > 1 || P2 < 0 || P2 > 1 || P3 < 0 || P3 > 1 || P4 < 0 || P4 > 1 || P5 < 0 || P5 > 1) {
                return -1;
            }

            suma_porcentajes = P1 + P2 + P3 + P4 + P5;

            if (suma_porcentajes != 1.0f) {
                return -1;
            }
 
            definitiva = (N1 * P1) + (N2 * P2) + (N3 * P3) + (N4 * P4) + (N5 * P5);
            return definitiva;
    
        } catch (Exception e) {
            return -1;
        }
    }


    /*
     * 5. Diseñe un algoritmo e implemente la función Calcular_para_ganar que
     * reciba cinco floats representando los porcentajes de una materia (que
     * deberán sumar 1 y estar entre 0 y 1) y cuatro floats representando las
     * primeras notas (entre 0 y 5), y devuelva un float que represente la
     * nota que deberá sacar para ganar si el puntaje mínimo es 3. Si algo
     * está mal con los porcentajes o con las notas, retorne -1.
     */
        public static float Calcular_para_ganar(float P1, float P2, float P3, float P4, float P5, float N1,float N2, float N3, float N4) {
        try {
        float suma_porcentajes = P1 + P2 + P3 + P4 + P5;
        float puntaje_actual = (N1 * P1) + (N2 * P2) + (N3 * P3) + (N4 * P4);
        float nota_necesaria = 0;
            
        if (P1 < 0 || P1 > 1 || P2 < 0 || P2 > 1 || P3 < 0 || P3 > 1 || P4 < 0 || P4 > 1 || P5 < 0 || P5 > 1) {
            return -1;
        }

        if (N1 < 0 || N1 > 5 || N2 < 0 || N2 > 5 || N3 < 0 || N3 > 5 || N4 < 0 || N4 > 5) {
            return -1;
        }

        if (suma_porcentajes != 1.0f) {
            return -1;
        }

        nota_necesaria = (3.0f - puntaje_actual) / P5;

        if (nota_necesaria < 0 || nota_necesaria > 5) {
            return -1;
        }

        return nota_necesaria;

    } catch (Exception e) {
        return -1;
    }
}

    /*
     * 6. Diseñe un algoritmo e implemente la función Calcular_salario que
     * reciba cuatro enteros: cantidad de horas normales laboradas, cantidad
     * de horas extras diurnas laboradas, cantidad de horas extras nocturnas
     * laboradas, y el valor de la hora normal como un float. La función debe
     * retornar un float con el salario total. Las horas extras diurnas tienen
     * un recargo adicional del 15% sobre la hora normal, y las horas extras
     * nocturnas tienen un recargo adicional del 35% sobre la hora normal.
     * 
     * Valide que el valor de la hora normal sea mayor a 0. Si no es así, retorne
     * -1.
     * 
     * Si hay algún error, retorne -1.
     */
     public static float Calcular_salario(int horas_normales, int horas_extras_diurnas, int horas_extras_nocturnas,float valor_hora_normal) {

        try {
            float salario_horas_normales = 0;
            float salario_horas_extras_diurnas = 0;
            float salario_horas_extras_nocturnas = 0;
            float salario_total = 0;
    
            if (valor_hora_normal <= 0) {
                return -1;
            }
    
            salario_horas_normales = horas_normales * valor_hora_normal;
            salario_horas_extras_diurnas = horas_extras_diurnas * valor_hora_normal * 1.15f;
            salario_horas_extras_nocturnas = horas_extras_nocturnas * valor_hora_normal * 1.35f;
            salario_total = salario_horas_normales + salario_horas_extras_diurnas + salario_horas_extras_nocturnas;
    
            return salario_total;
    
        } catch (Exception e) {
            return -1;
        }
}


    /*
     * 7. Diseñe un algoritmo e implemente la función Calcular_area_triangulo
     * que reciba dos floats representando la base y la altura de un triángulo
     * rectángulo, y devuelva un float que represente el área del triángulo.
     * 
     * Valide que la base y la altura sean mayores a 0. Si no es así, retorne -1.
     * 
     * La fórmula del área es: área = 1/2 * base * altura.
     * 
     * Si hay algún error, retorne -1.
     */
        public static float Calcular_area_triangulo(float base, float altura) {
        try {
            float area;
            if (base <= 0 || altura <= 0) {
                return -1;
            }
            area = 0.5f * base * altura;
            return area;

        } catch (Exception e) {
            return -1;
        }
    }
    /*
     * 8. Diseñe un algoritmo e implemente la función Calcular_perimetro_cuadrado
     * que reciba un float representando el lado de un cuadrado, y devuelva un
     * float que represente el perímetro del cuadrado.
     * 
     * Valide que el lado sea mayor a 0. Si no es así, retorne -1.
     * 
     * La fórmula del perímetro es: perímetro = lado * 4.
     * 
     * Si hay algún error, retorne -1.
     */
 public static float Calcular_perimetro_cuadrado(float lado) {
        try {
            float perimetro;
            if (lado <= 0) {
                return -1;
            }
            perimetro = lado * 4;
            return perimetro;
        } catch (Exception e) {
            return -1;
        }
    }

    /*
     * 9. Diseñe un algoritmo e implemente la función Calcular_volumen_cilindro
     * que reciba dos floats representando el radio de la base y la altura de
     * un cilindro, y devuelva un float que represente el volumen del cilindro.
     * 
     * Valide que el radio y la altura sean mayores a 0. Si no es así, retorne -1.
     * 
     * La fórmula del volumen es: V = pi * radio^2 * altura, usando pi con
     * precisión de 7 decimales (3.1415927).
     * 
     * Si hay algún error, retorne -1.
     */
        public static float Calcular_volumen_cilindro(float radio, float altura) {
        final float PI = 3.1415927f;
        try {
            float volumen;
            if (radio <= 0 || altura <= 0) {
                return -1;
            }
            volumen = PI * radio * radio * altura;
            return volumen;

        } catch (Exception e) {
        return -1;
        }
    }

    /*
     * 10. Diseñe un algoritmo e implemente la función Calcular_area_circulo
     * que reciba un float representando el radio de un círculo, y devuelva un
     * float que represente el área del círculo.
     * 
     * Valide que el radio sea mayor a 0. Si no es así, retorne -1.
     * 
     * La fórmula del área es: área = pi * radio^2, usando pi con precisión
     * de 7 decimales (3.1415927).
     * 
     * Si hay algún error, retorne -1.
     */
        public static float Calcular_area_circulo(float radio) {
        final float PI = 3.1415927f; 
        try {
            float area;
            if (radio <= 0) {
                return -1;
            }
            area = PI * radio * radio;
            return area;


        } catch (Exception e) {
           return -1;
        }


    }




}
