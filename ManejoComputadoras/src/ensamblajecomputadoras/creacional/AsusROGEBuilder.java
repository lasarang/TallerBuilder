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
    }

    @Override
    public void ConstruirSO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ConstruirMainboard() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
