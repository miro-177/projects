class Renew extends Customer {
    private String name;

    public Renew(String name) {
        super('B');
        this.name = name;
    }

    @Override
    public String getCustomerInfo() {
        return "Renewal License. Ticket Number " + getTicketNumber() + ". Name: " + name;
    }
}