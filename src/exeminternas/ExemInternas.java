package exeminternas;

public class ExemInternas {

    public static void main(String[] args) {
        // ***CLASE INTERNA STATIC***
        //
        //CREAMOS OBJETO DE CLASE EXTERNA Y ACCEDEMOS AL MÉTODO DE LA EXTERNA
        //QUE ACCEDE A LA INTERNA Y MUESTRA SU ATRIBUTO
        AnidadaEstatica obx = new AnidadaEstatica();
        obx.acceder();
        //ACCEDEMOS A LA INTERNA DIRECTAMENTE CON UN OBJETO DE LA CLASE INTERNA
        AnidadaEstatica.Interna varIn = new AnidadaEstatica.Interna();
        varIn.amosar();

        //***CLASE INTERNA NO-STATIC***
        //
        //PARA ACCEDER A LA INTERNA, PRIMERO CREAMOS UN OBJETO DE LA EXTERNA
        Interna obx2 = new Interna();
        //PODEMOS ACCEDER A TRAVÉS DE UN MÉTODO DE LA EXTERNA QUE ACCEDA A LA INTERNA
        obx2.accedo();
        //O CREANDO UN OBJETO DE LA INTERNA A TRAVÉS DE UN OBJETO DE LA EXTERNA
        Interna.Inter var = obx2.new Inter();
        var.amosar();

        //***CLASE INTERNA LOCAL***
        //
        Locales lo = new Locales();
        lo.metodoClase();

    }

}
