public class Lombric {

    public int longueur = 1;
    public Lombric (){

    }
    public int getLongueur(){
        return this.longueur;
    }
    public void grandit(int n){
        this.longueur = this.getLongueur() + n;
    }
    public Lombric accouplement(Lombric b){
        if(this.getLongueur()>=10){
            if(b.getLongueur()>=10){
                return new Lombric();
            }
        }
        return null;
    }
    public Lombric coupe(){
        Lombric c = new Lombric();
        c.longueur = this.getLongueur()/2;
        return c;
    }

}
