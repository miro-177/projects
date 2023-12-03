public class Character3 extends Character{
    private String description="Buddies with Mark Whallburg";
    private String whoami= "Ted";
    public Character3(){

    }
    public Character3(String d, String w) {
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
        return "Whatsup guys I am a talking bear";
    }

    public String getInformation(){
        return "I am a funny talking bear and have 2 movies about me";
    }
    public String sayGoodbye(){
        return "Peace out ima go hang with Mark";
    }
}


