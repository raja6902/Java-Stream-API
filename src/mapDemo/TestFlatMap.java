package mapDemo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestFlatMap {

	public static void main(String[] args) {
		// find the distinct words in a file.
		Path path = Paths.get("C:/Users/user/test.txt");
		Set setOfWords = new HashSet();
		try {
			List<String> lines = Files.readAllLines(path);
			// this is a test file
			// this test file is
			// a demo of flatMap.
			for (String line : lines) {
				String[] words = line.split("\\s+");
				// [this is a test file]
				// [ this test file is]
				// [a demo of flatMap.]
				for (String word : words) {
					setOfWords.add(word);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("distinct words from traditional approach is " + setOfWords);

		// Stream implementation.
		try {
			Files.lines(path).map(e -> e.split("\\s+"))
					// [this is a test file]
					// [ this test file is]
					// [a demo of flatMap.]
					.flatMap(Arrays::stream)// Stream of stream Stream(Stream<String>)
					// Stream.of([this is a test file]).
					// Stream.of([ this test file is]).
					// Stream.of([a demo of flatMap.]).
					.distinct().forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
