
package sesi4;


public class Burung extends Hewan {
    public void munculSuara(){
        super.munculSuara();
        System.out.println("Burung:...cit..cit...cit");      
    }
    public static void main(String[]args){
        Burung a = new Burung();
        
        a.munculSuara();
    }
}
