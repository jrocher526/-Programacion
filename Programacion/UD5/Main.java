package ejerciciosDeClase;

import java.util.HashSet;

public class Main {
	public static void main(String[] args) {

		HashSet<Integer> numbers = new HashSet<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		System.out.println("HashSet1: " + numbers);
		System.out.println("Referencia: " + numbers.hashCode());
		
		HashSet<Integer> primeNumbers = new HashSet<>();
		primeNumbers.add(2);
		primeNumbers.add(3);
		System.out.println("HashSet2: " + primeNumbers);
		System.out.println("Referencia: " + primeNumbers.hashCode());
		
		System.out.println(numbers == primeNumbers);
		System.out.println(numbers.equals(primeNumbers));
		
		//Comprueba si primeNumbers es un subconjunto de números
		boolean result = numbers.containsAll(primeNumbers);
		System.out.println("Es HashSet2 subconjunto de Hashset1? " + result);
		
	}

}
