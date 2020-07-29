
public class Seat {
    private int row;
    private String col;
    private Passenger passenger;

    public Seat(int row, String col) {
        this.row = row;
        this.col = col;
        this.passenger=null;
    }

    public int getRow() {
        return row;
    }

    public String getCol() {
        return col;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
   
    
    public boolean equals( Object compared){
   
        if(this==compared)
            return true;
        if (!(compared instanceof Seat))
            return false;
        Seat com = (Seat) compared;
        if(this.col.equals(com.getCol())
                && this.row==com.getRow())
            return true;
        else
            return false;
    
    }
    
    @Override
    public String toString(){
        String salida ="Asiento: "+this.row+this.col+", ";
        if(this.isFree()){
            salida+="ocupado. "+this.passenger.toString();
        }
        else
            salida+="libre.";
        return salida;
    }
    public boolean isFree(){
        if(this.passenger==null){
            return true;
        }
        else
            return false;
    }
    
}
