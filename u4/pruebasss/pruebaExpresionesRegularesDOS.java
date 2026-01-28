/*
		

		x?=Una vez o ninguna
		x*=Puede aparecer una vez o más o ninguna
		x+=Debe aparecer al menos una vez
		x{1,4}= Con esto podemos indicar el mínimo y el máximo
		x{1,}= Con esto podemos indicar el mínimo sin poner máximo
		x{5}= En este caso debe aparecer 5 veces exactas.
		
		[0-9]{3}[a-zA-Z]{1}

		[a-z]{1,4}[0-9]+=tienes que poner letras minúsculas
		de entre 1 a 4 y al menos un número

	
		m.matches(). Devolverá true si toda la cadena (de principio a fin) encaja con el patrón o false en caso
		contrario.

		m.lookingAt(). Devolverá true si el patrón se ha encontrado al principio de la cadena. A diferencia del método
		matches(), la cadena podrá contener al final caracteres adicionales a los indicados por el patrón, sin que ello
		suponga un problema.

		m.find(). Devolverá true si el patrón existe en algún lugar la cadena (no necesariamente toda la cadena debe
		coincidir con el patrón) y false en caso contrario, pudiendo tener más de una coincidencia. Para obtener la
		posición exacta donde se ha producido la coincidencia con el patrón podemos usar los métodos m.start() y
		
		m.end(), para saber la posición inicial y final donde se ha encontrado. Una segunda invocación del método
		find() irá a la segunda coincidencia (si existe), y así sucesivamente. Podemos reiniciar el método find(),
		para que vuelva a comenzar por la primera coincidencia, invocando el método m.reset().
		
		*/