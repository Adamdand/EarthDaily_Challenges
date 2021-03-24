import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * This program uses Java - Eclipse
 * 
 * @author adamd
 *
 */
public final class ListChallenge {

	/**
	 * remove duplicate values from list
	 * 
	 * @param input
	 * @return
	 */
	private static List<String> getUniqueValues(List<String> input) {
		return new ArrayList<>(new LinkedHashSet<>(input));

	}

	/**
	 * sort list by length of strings
	 * 
	 * @param uniqueList
	 * @return
	 */
	private static List<String> sortByLength(List<String> uniqueList) {
		Collections.sort(uniqueList, Comparator.comparing(String::length));
		// reverse string, so it is now reverse alphabetical and length
		Collections.reverse(uniqueList);
		return uniqueList;

	}

	/**
	 * sort list alphabetically
	 * 
	 * @param uniqueList
	 */
	private static void sortAlphabetical(List<String> uniqueList) {
		if (!uniqueList.isEmpty()) {
			for (String emp : uniqueList) {
			}
			Collections.sort(uniqueList);
		}
	}

	static final List<String> totalFunction(List<String> original, List<String> add, List<String> delete) {
		// create longList, by adding "original" list to "add" list
		List<String> longList = new ArrayList<String>();
		longList.addAll(original);
		longList.addAll(add);

		// Create "uniqueList", only keeping unique values within the longList
		List<String> uniqueList = new ArrayList<String>();
		uniqueList = getUniqueValues(longList);

		// remove strings of the "delete" list from the "uniqueList"
		uniqueList.removeAll(delete);

		// Sort alphabetically BEFORE by length
		sortAlphabetical(uniqueList);

		// sort list by work length then flip, so it is ordered longest to shortest and
		// z->a
		List<String> Result = new ArrayList<String>();
		Result = sortByLength(uniqueList);

		List<String> resultCopy = new ArrayList<String>();
		resultCopy = Result;

		return resultCopy;

	}

	public static void main(String[] args) {

		// Initialize list of strings
		List<String> originalList = Arrays.asList("one", "two", "three", "ten", "eleven", "aaaa", "zzzzzz");
		List<String> addList = Arrays.asList("one", "two", "five", "six");
		List<String> deleteList = Arrays.asList("two", "five");
		List<String> resultList;

		// call main function
		resultList = totalFunction(originalList, addList, deleteList);
		// print results
		System.out.println("My Result = " + resultList);

	}

}
