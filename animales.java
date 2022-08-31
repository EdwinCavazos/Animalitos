/*
 * Crear una clase abstracta llamada Animal
	- Tener 2 metodos abstractos: desplazarse y hacer sonidos.

- Instanciar 5 animales distintos, que hereden de la clase abstracta llamada Animal
	- Cada animal, debe tener esos 2 metodos. (sysout con la informacion).
Revisión de repositorio el día Viernes 2 de Septiembre al finalizar el día. (11:59 pm).

 */
public abstract class Animales {
//Metodo para hacer sonido
	public abstract void hacerSonido();
//Metodo para desplazarse
	public abstract void desplazarse();
///////////////////////////////////////////////////////////////////
}//Clase animales

class Perro extends Animales{

	@Override
	public void hacerSonido() {
	System.out.println("Guau Guau..");
		
	}//hacerSonido

	@Override
	public void desplazarse() {
		System.out.println("Soy un perro y camino con mis 4 patas");
		
	}//Desplazarse
	
}//clase perro
///////////////////////////////////////////////////////////////////
class Gato extends Animales{

	@Override
	public void hacerSonido() {
		System.out.println("Miau Miau...");
		
	}//hacerSonido

	@Override
	public void desplazarse() {
		System.out.println("Soy un gato y camino con mis 4 patas");
		
	}//Desplazarse
	
}//clase gato
///////////////////////////////////////////////////////////////////
class Pato extends Animales{

	@Override
	public void hacerSonido() {
		System.out.println("Cuack Cuack...");
		
	}//HacerSonido

	@Override
	public void desplazarse() {
		System.out.println("Soy un pato y puedo nadar y caminar con mis patitas");
		
	}//desplazarse
	
}//clase pato
///////////////////////////////////////////////////////////////////
class Vaca extends Animales{

	@Override
	public void hacerSonido() {
		System.out.println("Muuuuuuuuuuuuuuh...");
		
	}//hacerSonido

	@Override
	public void desplazarse() {
		System.out.println("Soy una vaquita y camino con mis 4 patas");
		
	}//desplazarse
	
}//clase vaca
///////////////////////////////////////////////////////////////////
class Pez extends Animales{

	@Override
	public void hacerSonido() {
		System.out.println("Glu Glu Glu...");
		
	}//hacerSonido

	@Override
	public void desplazarse() {
		System.out.println("Soy un pez y nado con mis aletitas");
		
	}//desplazarse
	
	
}//clase pez
///////////////////////////////////////////////////////////////////
class testAnimales{
	public static void main(String args[]) {
		Perro Paco = new Perro();
		Paco.hacerSonido();
		Paco.desplazarse();
		
		System.out.println();
		
		Gato Manchas = new Gato();
		Manchas.hacerSonido();
		Manchas.desplazarse();
		
		System.out.println();
		
		Pato Poncho = new Pato();
		Poncho.hacerSonido();
		Poncho.desplazarse();
		
		System.out.println();
		
		Vaca Lola = new Vaca();
		Lola.hacerSonido();
		Lola.desplazarse();
		
		System.out.println();
		
		Pez Lalo = new Pez();
		Lalo.hacerSonido();
		Lalo.desplazarse();
	}
	
	
	
}//clase testAnimales