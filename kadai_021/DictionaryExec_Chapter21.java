package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {

		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();

		// 調べる英単語
		String[] words = {"apple", "banana", "grape", "orange"};

		// 繰り返し処理で意味を調べる
		for (String word : words) {
			dictionary.search(word);
		}
	}
}
