public class FSA2 {
    int state;
    boolean active;


    public FSA2() {
        state = 0;
        this.active = true;
    }
    public FSA2(int state) {
        this.state = state;
        this.active = true;
    }

    public int goToNextState() {
        if (state == 3) {
            state = 0;
        }
        else {
            state++;
        }
        return state;
    }

    public int showCurrentState() {
        return state;
    }

    public boolean end() {
        return state == 3;
    }

    public boolean isActive() {
        return active;
    }
}

