public class Pokemon {
    private String navn, gender, udviklesFra, udviklerTil;
    private int nummerPokedex;
    private short Skade;

    public Pokemon() {}


    @Override
    public String toString(){
        String beskrivelse = "Pokemon " + navn + " nr. "
                + nummerPokedex + " er en " + gender + ".";
        return beskrivelse;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getUdviklesFra() {
        return udviklesFra;
    }

    public void setUdviklesFra(String udviklesFra) {
        this.udviklesFra = udviklesFra;
    }

    public short getSkade() {
        return Skade;
    }

    public void setSkade(short skade) {
        Skade = skade;
    }

    public int getNummerPokedex() {
        return nummerPokedex;
    }

    public void setNummerPokedex(int nummerPokedex) {
        this.nummerPokedex = nummerPokedex;
    }

    public String getUdviklerTil() {
        return udviklerTil;
    }

    public void setUdviklerTil(String udviklerTil) {
        this.udviklerTil = udviklerTil;
    }


}
