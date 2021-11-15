public class Lampada{

    private boolean estadoDaLampada;

    public boolean getEstadoDaLampada() {
        return estadoDaLampada;
    }

    public void setEstadoDaLampada(boolean estadoDaLampada) {
        this.estadoDaLampada = estadoDaLampada;
    }

    public void ligar(){
        this.estadoDaLampada = true;
    }

    public void desligar(){
        this.estadoDaLampada = false;
    }

    public void estadoDalLampada(){

        if(this.estadoDaLampada == true){
            System.out.println("A lampada está ligada");
        }else{
            System.out.println("A lampada está deligada");
        }

    }

}