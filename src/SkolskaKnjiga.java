public class SkolskaKnjiga extends Knjiga {

    public String predmet;

    public SkolskaKnjiga (String naslov, String autor, int brojStrana, String predmet) {
        super(naslov, autor, brojStrana);
        this.predmet = predmet;
    }

    public String getPredmet(){
        return predmet;
    }


    @Override
    public void infoKnjige() {
        System.out.println("Naslov udzbenika:" + naslov);
        System.out.println("Naziv autora:" + autor);
        System.out.println("Broj strana:" + brojStrana);
        System.out.println ("Skolski predmet:" + predmet);
}


}
