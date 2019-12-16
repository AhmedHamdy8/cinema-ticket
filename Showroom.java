
package main;
public class Showroom {
    private String roomno;
    private int seatno;
    private char seatrow;
    
    
    public Showroom(String roomno, int seatno, char seatrow)
    {
        this.roomno=roomno;
        this.seatno=seatno;
        this.seatrow= seatrow;
    }

    public String getRoomno() {
        return roomno;
    }

    public int getSeatno() {
        return seatno;
    }

    public char getSeatrow() {
        return seatrow;
    }

    public void setRoomno(String roomno) {
        this.roomno = roomno;
    }

    public void setSeatno(int seatno) {
        this.seatno = seatno;
    }

    public void setSeatrow(char seatrow) {
        this.seatrow = seatrow;
    }

    
    public String toString() {
        return "Showroom{" + "roomno=" + roomno + ", seatno=" + seatno + ", seatrow=" + seatrow + '}';
    }
}
