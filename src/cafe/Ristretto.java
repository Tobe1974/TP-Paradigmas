package cafe;

public class Ristretto extends Cafe {
	
	@Override
    public String getDescripcion() {
        return "Ristretto"; //Retorno la descripción
    }

    @Override
    public double getPrecio() {
        return 110; //Retorno el precio del café ristretto
    }
}
	
