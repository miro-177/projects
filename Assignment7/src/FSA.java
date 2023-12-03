public class FSA {
    int state;


    public FSA() {
        state = 0;
    }
    public FSA(int state) {
        this.state = state;
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

    public boolean end() {
        return state == 3;
    }
}

