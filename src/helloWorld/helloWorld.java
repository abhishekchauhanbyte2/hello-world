package helloWorld;


import java.util.Arrays;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


public class helloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		Function<Integer , Integer> fun = new Function<Integer , Integer>() {
			@Override
			public Integer apply(Integer t) {
				return 2*t;
			};
		};
		int [] arr = {1,2,3,4,5};
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		
		System.out.println(list.stream().map(fun).toList()) ;
		
		List<Integer> myList = new LinkedList<>();
		
		myList.add(8);
		myList.add(56);
		System.out.println(myList);
	}


}
