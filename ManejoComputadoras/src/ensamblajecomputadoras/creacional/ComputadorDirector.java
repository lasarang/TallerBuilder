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
public class ComputadorDirector {
    
    private ComputadorBuilder builder;
    
    public ComputadorDirector(ComputadorBuilder builder) {
        this.builder = builder;
    }
    
    public void ConstruirComputador() {
        builder.DefinirComputador();
        builder.ConstruirSO();
        builder.ConstruirMainboard();
        builder.DefinirExtras();
    }
    
    public Computador getComputador() {
        return builder.getComputador();
    }
    
}
