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
public abstract class ComputadorBuilder {
    protected Computador c;
    
    public Computador getComputador() {
        return c;
    }
    
    public abstract void DefinirComputador();
    public abstract void ConstruirSO();
    public abstract void ConstruirMainboard();
    
}
