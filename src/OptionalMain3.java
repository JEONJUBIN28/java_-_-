import java.util.Optional;

public class OptionalMain3 {
	public static void main(String[] args) {
		// Optional 메소드
		String imNull = null;
		Optional<String> opt = Optional.ofNullable(imNull);
		Optional<String> opt1 = Optional.ofNullable("Hello");

		// 아웃풋
		System.out.println(opt.isEmpty()); // true
		System.out.println(opt1.isEmpty()); // false

		// Optional 활용 메소드
		Optional<String> opt4 = Optional.of("Hello");
		Optional<String> opt5 = Optional.of("Hello");
		Optional<String> opt6 = Optional.of("World");

		// Optional 메소드
		boolean isEqual1 = opt1.equals(opt5);
		boolean isEqual2 = opt1.equals(opt6);

		// 아웃풋
		System.out.println(isEqual1); // true
		System.out.println(isEqual2); // false

		Optional<Integer> opt7 = Optional.of(10);
		Optional<Integer> opt8 = Optional.of(1);

		Optional<Integer> optFilter = opt7.filter(num -> num < 5);
		Optional<Integer> optFilter2 = opt7.filter(num -> num < 5);

		System.out.println(optFilter.get());
		System.out.println(optFilter2.get());

		// 인풋
		Optional<String> optional = Optional.of("hello");

		// Optional 메소드
		Optional<Integer> result = optional.map(s -> s.length());

		// 아웃풋
		System.out.println(result.get()); // 5

		// 인풋
		Optional<String> optional1 = Optional.empty();
		Optional<String> optional2 = Optional.of("Hello");

		// Optional 메소드 사용
		Optional<String> result1 = optional1.or(() -> Optional.of("World"));
		Optional<String> result2 = optional2.or(() -> Optional.of("World"));

		// 아웃풋
		System.out.println(result1.get()); // World
		System.out.println(result2.get()); // Hello

		// 스트림
		Optional<String> optional10 = Optional.of("Hello");

		// Optional 메소드 사용
		optional10.stream().map(String::toUpperCase).forEach(System.out::println); // HELLO

	}
}