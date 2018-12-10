/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ensamblajecomputadoras.creacional;

/**
 *
 * @author jfherrer
 */
public class AsusROGEBuilder extends ComputadorBuilder {
            
    @Override
    public void DefinirComputador() {
        c = new Computador();
        c.setMarca("Asus");
        c.setModelo("ROGE");
        c.setRam(32);
        c.setAlmacenamiento(1000);
    }

    @Override
    public void ConstruirSO() {
        c.setOs(new SistemaOperativo("Windows 10", 64, "PRO"));
    }

    @Override
    public void ConstruirMainboard() {
        c.setPlaca(new Mainboard("Strix", "X99"));
    }

    @Override
    public void DefinirExtras() {
        c.setCoolerExterno(true);
    }
    
}
