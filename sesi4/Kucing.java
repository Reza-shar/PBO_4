
package sesi4;


public class Kucing extends Hewan{

    public void munculSuara(){
        super.munculSuara();
        System.out.println("kucing:...meow..meow...meow");      
    }
    public static void main(String[]args){
        Kucing a = new Kucing();
        
        a.munculSuara();
    }
}
