import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {

		//Stream<Date> stream = Stream.generate(() -> { return new Date(); });
        //stream.forEach(p -> System.out.println(p));
		List<List<String>> namesNested = Arrays.asList( 
			      Arrays.asList("Jeff", "Bezos"), 
			      Arrays.asList("Bill", "Gates"), 
			      Arrays.asList("Mark", "Zuckerberg"));

			    List<String> namesFlatStream = namesNested.stream()
			      .flatMap(Collection::stream)
			      .collect(Collectors.toList());
			    System.out.println(namesFlatStream.toString());
	}

	public Stream<String> streamOf(List<String> list) {
		Stream<String> streamEmpty = Stream.empty();
		Stream<String> streamBuilder = Stream.<String>builder().add("a").add("b").add("c").build();
		Stream<String> streamOfArray = Stream.of("a", "b", "c");
		Stream<String> streamGenerated = Stream.generate(() -> "element").limit(10);
		Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(20);
		streamIterated.allMatch((a) -> a / 2 == 0);
		IntStream intStream = IntStream.range(1, 3);
		LongStream longStream = LongStream.rangeClosed(1, 3);
		Random random = new Random();
		DoubleStream doubleStream = random.doubles(3);
		IntStream streamOfChars = "abc".chars();
		Stream<String> streamOfString = Pattern.compile(", ").splitAsStream("a, b, c");
		Path path = Paths.get("C:\\file.txt");
		try {
			Stream<String> streamOfStrings = Files.lines(path);
			Stream<String> streamWithCharset = Files.lines(path, Charset.forName("UTF-8"));
		} catch (Exception e) {
			// TODO: handle exception
		}
		List<String> elements = Stream.of("a", "b", "c").filter(element -> element.contains("b"))
				.collect(Collectors.toList());
		Optional<String> anyElement = elements.stream().findAny();
		Optional<String> firstElement = elements.stream().findFirst();
		Stream<String> stream = Stream.of("a", "b", "c").filter(element -> element.contains("b"));
		Optional<String> anyElement1 = stream.findAny();
		Optional<String> firstElement1 = stream.findFirst();
		Collection<String> collection = Arrays.asList("a", "b", "c");
		Stream<String> streamOfCollection = collection.stream();
		Stream<String> onceModifiedStream = Stream.of("abcd", "bbcd", "cbcd").skip(1);
		Stream<String> twiceModifiedStream = stream.skip(1).map(element -> element.substring(0, 3));
		List<String> list1 = Arrays.asList("abc1", "abc2", "abc3");
		long size = list1.stream().skip(1).map(element -> element.substring(0, 3)).sorted().count();
		OptionalInt reduced = IntStream.range(1, 4).reduce((a, b) -> a + b);

		return list == null || list.isEmpty() ? Stream.empty() : list.stream();
	}

}
