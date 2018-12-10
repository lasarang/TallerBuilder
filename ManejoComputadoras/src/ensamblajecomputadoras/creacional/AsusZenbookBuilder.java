package ensamblajecomputadoras.creacional;
/**
*
* @author Luis A. Sarango-Parrales
*/

public class AsusZenbookBuilder extends ComputadorBuilder{
	@Override
    public void DefinirComputador() {
        c = new Computador();
        c.setRam(16);
        c.setModelo("Zenbook");
        c.setAlmacenamiento(500);
        
    }

    @Override
    public void ConstruirSO() {
    	 c.setOs(new SistemaOperativo("Windows 10",64, "Home Edition" ));
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ConstruirMainboard() {
    	c.setPlaca(new Mainboard("Prime","Z370"));
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void DefinirExtras() {
    	c.setCoolerExterno(false);
    }
	
	

}
