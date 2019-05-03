package exeminternas;

public class Locales {
//FALTA PONER APUNTES EN EJEMPLO DE NINA EJEMPLO Y EJEMPLOANIDADAS

    private int a = 0;

    public void metodoClase() {
        final int suma = 20;

        class Interna {

            private final int resto = 4;
            private int divisor = 2;

            private void operacion() {
                //ACCESO DIRECTO A LOS ATRIBUTOS DE LA CLASE EXTERNA
                System.out.println(a);

                System.out.println(suma + resto);
            }

            private void division() {
                System.out.println("divi = " + suma * divisor);
            }
            Interna in = new Interna();

        }
        //DESDE EL PROPIO MÉTODO ACCEDEMOS A LA CLASE INTERNA LOCAL QUE TIENE EL
        //MÉTODO
        Interna in = new Interna();
        in.division();
        in.operacion();

    }

}
