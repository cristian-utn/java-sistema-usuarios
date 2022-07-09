package sistema;
public class Usuario {
    private final int CANTIDAD_DE_CLAVES=5,CLAVE_ACTUAL=0;
	private String usuario;
    private String contrasenias[]=new String[CANTIDAD_DE_CLAVES];
    
    private String nombre;
    private String apellido;
    private boolean logueado;
    private boolean bloqueado;
    private int edad;
    public Usuario(String usuario, String nombre, String apellido, int edad){
        this.usuario=usuario;
//        for (int i = 0; i < contrasenias.length; i++) {
//			System.out.println(contrasenias[i]);
//		}
        this.nombre=nombre; 
        this.apellido=apellido; 
        this.edad=edad;
        //this.contrasenia=contrasenia;
    }
    public String getUsuario(){
        return usuario;
    } 
//    public String getContrasenia(){
//        return contrasenia;
//    }
    public boolean cambiarContrasenia(String contrasenia){
    	if(!existioContrasenia(contrasenia)) {
    		for (int i = contrasenias.length-1; i > 0; i--) {
    			System.out.println(contrasenias[i]);
    			contrasenias[i]=contrasenias[i-1];
    		}
    		this.contrasenias[CLAVE_ACTUAL]=contrasenia;
    		return true;
    	}
    	else return false;
    }
    public boolean existioContrasenia(String contrasenia){
    	for (int i = 0; i < contrasenias.length; i++) {
			if(contrasenias.equals(contrasenia))return true;
		}
    	return false;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public boolean getLogueado() {
    	return logueado;
    }
    public boolean getBloqueado() {
    	return bloqueado;
    }
    public int getEdad() {
    	return edad;
    }
}