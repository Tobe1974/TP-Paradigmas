package cafe;


public class Expresso extends Cafe {
	
	    @Override
	    public String getDescripcion() {
	        return "Expresso";//Retorno la descripción
	    }

	    @Override
	    public double getPrecio() {
	        return 100; //Retorno el precio del café expresso
	    }
}
