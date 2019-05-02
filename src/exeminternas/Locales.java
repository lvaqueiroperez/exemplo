
package exeminternas;

public class Locales {
    
    public void metodoClase(){
        final int suma= 20;
            
        
        class Interna{
            private final int resto =4;
            private int divisor=2;
            private void operacion(){
                System.out.println(suma + resto);
            }
            private void division(){
                System.out.println("divi = "+ suma * divisor);
            } Interna in = new Interna();
     
         }
       Interna in = new Interna();
       in.division();
       in.operacion();
  
        
        
        
    }
    
}
