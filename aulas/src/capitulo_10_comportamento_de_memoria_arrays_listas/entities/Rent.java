package capitulo_10_comportamento_de_memoria_arrays_listas.entities;

public class Rent {
    private int rentNumber;
    private String clientName;
    private String clientEmail;
    private int room;

    public Rent(int rentNumber, String clientName, String clientEmail, int room) {
        this.rentNumber = rentNumber;
        this.clientName = clientName;
        this.clientEmail = clientEmail;
        this.room = room;
    }

    public int getRentNumber() {
        return rentNumber;
    }

    public void setRentNumber(int rentNumber) {
        this.rentNumber = rentNumber;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public String toString() {
        return clientName + ", " + clientEmail;
    }

}
