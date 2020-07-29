import java.util.ArrayList;
public class Plane {
    private ArrayList<Seat> seats=new ArrayList<>();
    private int rowls, cols;

    public Plane(int rowls, int cols) {
        this.rowls = rowls;
        this.cols = cols;
        for(int i=1; i<=this.rowls; i++){
            
            for(int j=1; j<=this.cols;j++){
                seats.add(new Seat(i,aLet(j)));
            }
      
        }
        //revisar en el main
    }
    @Override
    public String toString(){//revisar
        String salida="";
        int i=0;
        String j= aLet(cols);
        for(Seat as:seats){
            if(as.getCol().equals("A")){
                i++;
                salida+="\n"+i;
                
            }
            if(as.isFree())
                salida+=as.getCol();
            else
                salida+="X";
        }
        
        return salida;
    }


    public int getRowls() {
        return rowls;
    }

    public int getCols() {
        return cols;
    }



    public void setRowls(int rowls) {
        this.rowls = rowls;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }
    public String aLet(int number){//revisar
        String salida ="";
        switch(number){
            case 1:
                salida="A";
                break;
            case 2:
                salida="B";
                break;
            case 3:
                salida="C";
                break;
            case 4:
                salida="D";
                break;
            case 5:
                salida="E";
                break;
            case 6:
                salida="F";
                break;
            case 7:
                salida="G";
                break;
            case 8:
                salida="H";
                break;

        }
        return salida;
    }
    public int aLet(String number){//revisar
        int salida =0;
        switch(number){
            case "A":
                salida=1;
                break;
            case "B":
                salida=2;
                break;
            case "C":
                salida=3;
                break;
            case "D":
                salida=4;
                break;
            case "E":
                salida=5;
                break;
            case "F":
                salida=6;
                break;
            case "G":
                salida=7;
                break;
            case "H":
                salida=8;
                break;

        }
        return salida;
    }
    public void add(Seat asiento){
        
        int i=0;
        for(Seat as:seats){
            if(as.getCol().equals(asiento.getCol())){
                if(as.getRow()==asiento.getRow()){
                   seats.set(i, asiento); 
                   break; 
                }                  
            }
            i++;
        }
                

    }
     public boolean isFree(Seat asiento){
        if(this.seats.contains(asiento))     
            return true;
        else
            return false;
    }
    public boolean puestoF(Seat asiento){
        int i=0;
        boolean salida=false;
        for(Seat as:this.seats){
            if(as.getCol().equals(asiento.getCol())){
                if(as.getRow()==asiento.getRow()){
                    if(as.getPassenger().getName().equals(asiento.getPassenger().getName())){
                        if(as.getPassenger().getLastname().equals(asiento.getPassenger().getLastname())) 
                    return true;
                    } 
                    
                }
            }
            i++;
        }
       return salida;
    }
}
