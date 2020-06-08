package collectDemo;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Testcollect {

	public static void main(String[] args) {
		
		Stream<Account> myStream = 
				Stream.of(new Account(1, "Checking", 100, "New York"), new Account(2, "Savings", 250, "New York"), 
						new Account(3 , "Checking", 300 , "New York"), new Account  (4,"Checking", 150 , "Las Vegas" ));
		// provide list of all checking accounts.
		//List<Integer> result = myStream.filter(e-> e.getType().equals("Checking")).map(e->e.getId()).collect(Collectors.toList());
		        
      //System.out.println(result);
      
      //provide distinct list of cities.
      
    //  Set<String> result1 = myStream.map(e->e.getCity()).collect(Collectors.toSet());
    //  System.out.println(result1);
		//double result = myStream.filter(e->e.getType().equals("Checking")).collect(Collectors.summingDouble(Account::getBalance));
		//System.out.println(result);
		
	 //  Optional<Account> result = myStream.collect(Collectors.maxBy(Comparator.comparing(Account::getBalance)));
	//   System.out.println(result);
   // Group Account by account type and further by city  and sum their balance.
	//	Map<String, Map<String, Double>> result = myStream.collect
	//	(Collectors.groupingBy(Account::getType,Collectors.groupingBy(Account::getCity, Collectors.summingDouble(Account::getBalance))));
	//	System.out.println(result);
		
		//partitioning Account with low balance and high balance.
		Map<Boolean , List<Account>> result = myStream.collect(Collectors.partitioningBy(e->e.getBalance()>125));
		System.out.println(result);
      
	}

	 
	}


