
package exeminternas;

public class Interna {
    // Non STATICA
    static int externa_x= 20;
    private int externa_y = 30;
    private static int exter= 19;
    
    public void accedo(){
        Inter ob = new Inter();
        ob.amosar();
        System.out.println("***"+ ob.interna);
        
    }
    
    public class Inter{
        private int interna = 50;
        public void amosar(){
            System.out.println("static -->"+ externa_x + " externa_y --> "+ externa_y+ " static privada --> "+exter);
        }
    }
    
    
}
