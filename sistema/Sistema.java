package sistema;

public class Sistema {
	private String nombreDelSistema;
	private Usuario usuarios[];
	public Sistema(String nombreDelSistema, int cantidadMaximaDeUsuarios) {
		this.nombreDelSistema=nombreDelSistema;
		this.usuarios=new Usuario[cantidadMaximaDeUsuarios];
	}

	public Usuario buscarusuarios(String nombreUsuario) {
		for (int i = 0; i < usuarios.length; i++) {
			if(usuarios[i]!=null)
			if((usuarios[i].getUsuario()).equals(nombreUsuario)) {
				return usuarios[i];
			}
		}
		return null;
	}
	private boolean registrarNuevoUsuario(Usuario nuevoUsuario) {
		if(buscarusuarios(nuevoUsuario.getUsuario())==null) {
			for (int i = 0; i < this.usuarios.length; i++) {				
				if(usuarios[i]==null) {
					usuarios[i]=nuevoUsuario;
					
				}
			}
			return true;
		}
		else {
			return true;
		}
	}
	public int calcularLaCantidadDeUsuariosLogueados() {
		int contadorDeLogueados=0;
		for (int i = 0; i < this.usuarios.length; i++) {
			if(usuarios[i]!=null)
			if(usuarios[i].getLogueado()) {
				contadorDeLogueados++;
			}
		}
		return contadorDeLogueados;
	}
	public int calcularLaCantidadDeUsuariosBloqueados() {
		int contadorDeBloqueados=0;
		for (int i = 0; i < this.usuarios.length; i++) {
			if(usuarios[i]!=null)
				if(usuarios[i].getBloqueado()) {
					contadorDeBloqueados++;
				}
		}
		return contadorDeBloqueados;
	}
	public double calcularLaEdadPromedio() {
		int acumulador=0;
		for (int i = 0; i < this.usuarios.length; i++) {
			if(usuarios[i]!=null)acumulador+=usuarios[i].getEdad();
		}
		return (double)acumulador/usuarios.length;
	}
    public String toString() {
    	String mensaje="calcularLaCantidadDeUsuariosLogueados()"+calcularLaCantidadDeUsuariosLogueados()+
    			"calcularLaCantidadDeUsuariosBloqueados()"+calcularLaCantidadDeUsuariosBloqueados()+
    			"calcularLaEdadPromedio()"+calcularLaEdadPromedio();
    	return mensaje;
    }
}
