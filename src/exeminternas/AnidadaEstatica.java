
package exeminternas;

public class AnidadaEstatica {
    
    static int externa_x= 20;
    private int externa_y = 30;
    
    // acceso a clase interna 
  public void acceder(){
    Interna obx = new Interna();
    obx.amosar();
      System.out.println("inter --> "+ obx.inter);
    
  } 
    static class Interna{
        int inter =4;
        public void amosar(){
            System.out.println("static --> "+ externa_x); //accedemos a variable static
        //    System.out.println(" non static --> "+ externa_y); //non podo acceder por ser non static
        System.out.println("variable de la clase interna: "+inter);
        }
    }
    
    
}
