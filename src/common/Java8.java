package common;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import pojo.Employee;

public class Java8 {
	
	public static void main(String[] args) {
		
		
		int num = 10;
		System.out.println("Sum of 10 prime numbers " + IntStream.iterate(1, i -> i + 1).filter(j -> isPrime(j)).limit(num).sum());
		
		
		String myString = "myNewMn";
		Arrays.stream(myString.split("")).filter(a -> a.equals("N")). forEach(System.out::println);
		//count each character
		Map<String, Long> map = Arrays.stream(myString.split("")).map(s -> s.toLowerCase()).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);
		
		List<Employee> list = Arrays.asList(
				new Employee("0", "A", "Dept1", 1234),
				new Employee("1", "B", "Dept2", 234),
				new Employee("2", "C", "Dept1", 12),
				new Employee("3", "D", "Dept2", 100),
				new Employee("4", "E", "Dept3", 23423),
				new Employee("5", "F", "Dept4", 1234)
				);
		
		Map<String, Optional<Employee>> map2 = list.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.reducing(BinaryOperator.minBy(Comparator.comparing(Employee::getSalary)))));
		System.out.println("Lowest salary in each dept" + map2);

		
		Employee e3 = list.stream().reduce((e1, e2) -> e1.getSalary() > e2.getSalary() ? e2 : e1).get();
		System.out.println("Lowest salary" + e3.getSalary());
		
		int e4 = list.stream().collect(Collectors.mapping(Employee::getSalary, Collectors.minBy(Integer::compareTo))).get();
		System.out.println("Lowest salary by mapping" + e4);
		
		
		String myString1 = "ilovejavatechie";
		List<String> allRepeat = Arrays.stream(myString1.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
		.entrySet().stream().filter(e -> e.getValue() > 1).map(e -> e.getKey()).collect(Collectors.toList());
		System.out.println("All repeating characters" + allRepeat);
		
		
		String[] strArray = {"ilove", "java", "u", "ilovejavatechie"};
		System.out.println("longest string  " + Arrays.stream(strArray).reduce((w1, w2) -> w1.length() > w2.length() ? w1 : w2).get().toString());
		
		String myString2 = "ilovejavate1chie";
		System.out.println("Digitts " + Arrays.stream(myString2.split("")).map(s -> s.toCharArray()[0]).filter(Character::isDigit).count());
		
		
		//average
		System.out.println(IntStream.rangeClosed(1, 10).average());
		
	}
	
	
	
	
	public static Boolean isPrime(Integer number){
        if ( number == 1 ) { return false; }
        return IntStream.range(2,number).noneMatch(i -> number % i == 0 );
      }

}


