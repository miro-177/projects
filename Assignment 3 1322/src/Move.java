class Move extends Customer {
    private String name;
    private String previousState;

    public Move(String name, String previousState) {
        super('C');
        this.name = name;
        this.previousState = previousState;
    }

    @Override
    public String getCustomerInfo() {
        return "Moved from " + previousState + ". Ticket Number " + getTicketNumber() + ". Name: " + name;
    }
}
