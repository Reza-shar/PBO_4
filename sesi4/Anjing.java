
package sesi4;


public class Anjing extends Hewan {
    public void munculSuara(){
        super.munculSuara();
        System.out.println("Anjing:...Guk..Guk...Guk");      
    }
    public static void main(String[]args){
        Anjing a = new Anjing();
        
        a.munculSuara();
    }
}
