package exeminternas;

public class Locales {

    private int a = 0;

    public void metodoClase() {
        final int suma = 20;
        //CLASE INTERNA LOCAL DENTRO DE MÉTODO
        class Interna {

            //ATRIBUTOS DE LA INTERNA LOCAL
            private final int resto = 4;
            private int divisor = 2;

            //MÉTODOS DE LA INTERNA LOCAL
            private void operacion() {
                //ACCESO DIRECTO A LOS ATRIBUTOS DE LA CLASE EXTERNA
                System.out.println(a);

                System.out.println(suma + resto);
            }

            private void division() {
                System.out.println("divi = " + suma * divisor);
            }

        }
        //DESDE EL PROPIO MÉTODO ACCEDEMOS A LOS MÉTODOS DE LA CLASE INTERNA LOCAL
        Interna in = new Interna();
        in.division();
        in.operacion();

    }

    //AHORA, CUANDO CREEMOS UN MÉTODO DE LA CLASE EXTERNA, ACCEDEREMOS A SU
    //MÉTODO, QUE ACCEDERÁ A LA CLASE INTERNA LOCAL PARA EJECUTAR LOS MÉTODOS DE LA CLASE
    //INTERNA LOCAL
}
