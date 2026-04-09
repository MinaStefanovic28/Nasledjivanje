public class Knjiga {

    protected String naslov;
    protected String autor;
    protected int brojStrana;

    public Knjiga(String naslov, String autor, int brojStrana) {
        this.naslov = naslov;
        this.autor = autor;
        this.brojStrana = brojStrana;

    }

    public void infoKnjige() {
        System.out.println("Naslov knjige: " + naslov);
        System.out.println("Autor knjige: " + autor);
        System.out.println("Broj strana: " + brojStrana);


    }


}
