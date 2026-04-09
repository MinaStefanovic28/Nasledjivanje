public class Roman extends Knjiga {

    public String zanr;

    public Roman(String naslov, String autor, int brojStrana, String zanr ) {
        super(naslov, autor, brojStrana);
        this.zanr = zanr;
    }

    public String getZanr() {
        return zanr;
    }

    @Override
    public void infoKnjige() {
        super.infoKnjige();
        System.out.println("Zanr je: " + this.zanr);
    }




}






