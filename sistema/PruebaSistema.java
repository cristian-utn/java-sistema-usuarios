package sistema;

import java.util.Scanner;

public class PruebaSistema {
	private static final int REGISTRAR_NUEVO_USUARIO=1,
			VER_ESTADISTICAS_DEL_SISTEMA=2,
			SALIR=5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("es valido: "+laContraseniaEsValida("Cristian@123"));
		//Usuario usu1=new Usuario("usu","usu","usu",12);
		//Usuario usu1=new Usuario("usu","usu","usu",12);
		//Usuario usu1=new Usuario("usu","usu","usu",12);
		//Usuario usu1=new Usuario("usu","usu","usu",12);
		Sistema sistema1=new Sistema("nombre de sistema",3);
		Scanner scan=new Scanner(System.in);
		int op;
		do {
			mostrarMenu();
			op=scan.nextInt();
			System.out.println("************************************");
			switch(op) {
			case REGISTRAR_NUEVO_USUARIO:
				System.out.println("funcion 1");
				
				break;
			case VER_ESTADISTICAS_DEL_SISTEMA:
				System.out.println("funcion 2");
				System.out.println(sistema1.toString());

				break;
			case SALIR:
				System.out.println("Salio del programa");
				break;
			default:
				System.out.println("no es una opcion valida");
			}
		}while(op!=SALIR);
		
	}
	private static boolean laContraseniaEsValida(String clave) {
		String caracterElegido;
		byte contNumero = 0, contLetraMay = 0, contLetraMin=0;
		boolean tieneMayuscula=false,tieneMinuscula=false,tieneNumero=false,tieneEspecial=false;
		if(clave.length()>=8) {
			for (byte i = 0; i < clave.length(); i++) {
				caracterElegido = String.valueOf(clave.charAt(i));
				if (caracterElegido.matches("[A-Z]"))tieneMayuscula=true;
				if (caracterElegido.matches("[a-z]"))tieneMinuscula=true;
				if (caracterElegido.matches("[0-9]"))tieneNumero=true;
				if(((int)clave.charAt(i)>=123)&&((int)clave.charAt(i)<=255))tieneEspecial=true;
				if(((int)clave.charAt(i)>=33)&&((int)clave.charAt(i)<=47))tieneEspecial=true;
				if(((int)clave.charAt(i)>=58)&&((int)clave.charAt(i)<=64))tieneEspecial=true;
				if(((int)clave.charAt(i)>=91)&&((int)clave.charAt(i)<=96))tieneEspecial=true;
			}
		}
        return tieneMayuscula&&tieneMinuscula&&tieneNumero&&tieneEspecial;
	}
	private static void mostrarMenu() {
		System.out.println("**** Menu *****");
		System.out.println("*1- registrar usuario *****");
		System.out.println("*2- ver estadisticas *******");
		
	}
}
