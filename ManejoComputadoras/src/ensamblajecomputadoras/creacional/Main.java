package ensamblajecomputadoras.creacional;

public class Main {
	
	public static void main(String[] a) {
		ComputadorDirector directorAsusRoge= new ComputadorDirector(new AsusROGEBuilder());
		directorAsusRoge.ConstruirComputador();
		Computador Roge= directorAsusRoge.getComputador();
		
		ComputadorDirector directorAsusZenbook= new ComputadorDirector(new AsusZenbookBuilder());
		directorAsusZenbook.ConstruirComputador();
		Computador Zenbook= directorAsusZenbook.getComputador();
		
		System.out.println("Primer computador: "+Roge);
		System.out.println(Roge.especificacionesTecnicas());
		
		System.out.println("Segundo computador: "+Zenbook);
		System.out.println(Zenbook.especificacionesTecnicas());
		
		
		
		
		
	}

}
