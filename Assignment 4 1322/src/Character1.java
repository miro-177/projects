public class Character1 extends Character{
    private String description= "tall big nose";
    private String whoami= "Gru";

    public Character1(){

    }
    public Character1(String d, String w) {
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
        return "Whats up my minions";
    }

    public String getInformation(){
        return "I am the leader of my minions";
    }
    public String sayGoodbye(){
        return "Peace out my fellow minions";
    }
}

