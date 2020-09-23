package Domain;

import java.util.HashMap;

public class Answers {
	private static HashMap<String, Integer> answers = new HashMap<String, Integer>();

	public static void putAnswer(String language) {
		int current = 0;
		int total = 0;
		try {
			current = answers.get(language);
		} catch (NullPointerException e) {
			System.out.println("Não encontrou a linguagem" + " " + language);
		}
		try {
			total = answers.get("total");
		} catch (NullPointerException e) {
			System.out.println("Falha ao carregar total");
		}
		current += 1;
		total += 1;
		answers.put("total", total);
		answers.put(language, current);
	}

	public static HashMap<String, Integer> getAnswers() {
		return answers;
	}
}
