package com.dgmarket.dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@SpringBootApplication
public class StreamApiV1Application {

    public static void main(String[] args) {
        SpringApplication.run(StreamApiV1Application.class, args);
//		List<Integer> number = Arrays.asList(2,3,4,5);
//		List<Integer>square = number.stream().map(x ->x*x).collect(Collectors.toList());
//		System.out.println(square);

        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> square = numbers.stream().map(x -> x * x).collect(Collectors.toList());
//		System.out.println(square);
        List<Integer> triple = numbers.stream().map(x -> x * x * x).collect(Collectors.toList());
//		System.out.println(triple);

//        numbers.stream().map(x -> x * 2).forEach(y -> System.out.print(y + " "));
//        System.out.println();

        List<String> names = Arrays.asList("rahim", "karim", "esmu", "eleana", "maria", "faria");

        List<String> startWithNameList = names.stream().filter(s -> s.startsWith("e")).collect(Collectors.toList());

        System.out.println("------Starts With Method-----");
        startWithNameList.stream().forEach(y -> System.out.print(y + " "));

        System.out.println();

        System.out.println("------Contain Method-----");
        names.stream().filter(s -> s.contains("r")).forEach(y -> System.out.print(y + " "));
        System.out.println();

        System.out.println("------equals-----");
        names.stream().filter(s -> s.equals("esmu")).forEach(y -> System.out.println("true"));
        System.out.println();

        System.out.println("--------Sorted Array Ascending Order------");
        names.stream().sorted().forEach(x -> System.out.println(x));
        System.out.println();

        System.out.println("Reversed Order Array");
        names.stream().sorted(Comparator.reverseOrder()).forEach(y-> System.out.println(y));

        System.out.println("------------------Print as Set-----------------");
        Set set = names.stream().collect(Collectors.toSet());
        set.stream().forEach(y-> System.out.println(y));
        System.out.println();

        List<Integer> employeeAge= Arrays.asList(10,20,30,40,50);
        int sum = employeeAge.stream().reduce(0,(ele1,ele2)->ele1+ele2);
        System.out.println("Sum:: "+sum);

        int prod = employeeAge.stream().reduce(1,(ele1,ele2)->ele1*ele2);
        System.out.println("Production of employee Age:: "+prod);


    }
}

