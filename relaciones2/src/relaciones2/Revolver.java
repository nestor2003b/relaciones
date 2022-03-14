package relaciones2;
public class Revolver {
    private int posicionActual;
    private int posicionAgua;

    public Revolver() {
    }

    public Revolver(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }
    public void llenarRevolver (Revolver revolver){
        revolver.setPosicionAgua((int)(Math.random()*6));
        revolver.setPosicionActual((int)(Math.random()*6));
    }
    
    public boolean mojar (Revolver revolver){ 
    return (revolver.getPosicionActual() == revolver.getPosicionAgua()); 
}
   public void siguienteChorro(Revolver revolver) {
       if (revolver.getPosicionActual()==5){
           revolver.setPosicionActual(0);  
       }else{
           revolver.setPosicionActual(revolver.getPosicionActual()+1);
       }
   }
    @Override
   public String toString(){
   return "Relvolver en "+ "posicionActual "+posicionActual+ " y la posicion del agua es "+ posicionAgua;
   }
}

