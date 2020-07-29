
public class Passenger {
    private String name;
    private String lastname;

    public Passenger(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    @Override
    public String toString(){
        return this.name+" "+this.lastname;
    }
    public boolean equals(Passenger pasajero){
        if(this.lastname.equals(pasajero.lastname)&&this.name.equals(pasajero.name))
            return true;
        else
            return false;
    }
}
