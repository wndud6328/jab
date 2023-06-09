package com.kh.stream.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.kh.model.Student;

/*
 * 필터링
 * - 중간 처리 기능으로 요소를 걸러내는 역할
 * - distinct() : 중복을 제거하는 메서드
 * - filter(Predicate) : 매개 값으로 전달되는 Predicate가 false를 리턴하는 요소를 제거
 * 
 */
public class A_Filtering {

	public static void main(String[] args) {
		A_Filtering a = new A_Filtering();
//		a.method1();
		a.method2();
		
	}
	// 중복 제거 : distinct
	public void method1() {
		List<String> names = Arrays.asList("김준영", "김도경", "김예진", "박주영" ,"김준영", "김도경");
		Stream<String> stream = names.stream();
		
		stream.distinct().forEach(name -> System.out.print(name + " "));
		
		System.out.println();
		
		List<Student>students = Arrays.asList(new Student("김준영", 8 , "남자", 80, 50),
										     (new Student("김도경", 6, "여자", 80, 80)),
										     (new Student("김예진", 3, "여자", 60, 90)),
										     (new Student("박주영", 1, "남자", 100, 100)),
										     (new Student("김준영", 8 , "남자", 80, 50)),
											 (new Student("김도경", 6, "여자", 80, 80)));
		students.stream().distinct().forEach(student -> System.out.println(student));
	}

	// 필터 : filter
	public void method2() {
		List<String> names = Arrays.asList("김준영", "김도경", "김예진", "박주영");
		
		names.stream().filter(name -> name.startsWith("김")).forEach(name -> System.out.println(name + " "));
				
		List<Student>students = Arrays.asList(new Student("김준영", 8 , "남자", 80, 50),
			     (new Student("김도경", 6, "여자", 80, 80)),
			     (new Student("김예진", 3, "여자", 60, 90)),
			     (new Student("박주영", 1, "남자", 100, 100)),
			     (new Student("김준영", 8 , "남자", 80, 50)),
				 (new Student("김도경", 6, "여자", 80, 80)));
		// 성별이 여자인 요소만 출력
		students.stream().distinct().filter(student-> student.getGender().equals("여자")).forEach(student-> System.out.println(student));
		
		System.out.println();
		System.out.println();
		// 수학 점수는 70점 이상, 영어 점수는 80점 이상인 요소만 출력
		
		List<Student>stu1 = Arrays.asList(new Student("김준영", 8 , "남자", 80, 50),
										  new Student("김도경", 6, "여자", 80, 80),
										 new Student("김예진", 3, "여자", 60, 90),
										 new Student("박주영", 1, "남자", 100, 100));
			     					
		stu1.stream().distinct().filter(stu -> stu.getMath() >=70 && stu.getEnglish() >=80)
							.forEach(System.out::println);//(stu -> System.out.println(stu));
	}
}
