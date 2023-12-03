public class Character2 extends Character{
    private String description="Space Jam basketball player";
    private String whoami= "Micheal Jordan";
    public Character2(){

    }
    public Character2(String d, String w) {
        super();
        description=d;
        whoami=w;
    }
    public String getDescription() {
        return description;
    }
    public boolean guessWho(String guess) {
        return guess.equalsIgnoreCase(whoami);
    }
    public String getCharacterName() {
        return whoami;
    }
    @Override

    public String greeting(){
        return "Whats up guys I am the GOAT";
    }

    public String getInformation(){
        return "I have won 6 rings with the bulls";
    }
    public String sayGoodbye(){
        return "Peace out, Ima go play some ball";
    }
}

