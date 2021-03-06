package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot
speak("spell mandlebrot");
		// 2. Catch the user's answer in a String
String letters = JOptionPane.showInputDialog("Type answer here");
		// 3. If the user spelled the word correctly, speak "correct"
if(letters.equalsIgnoreCase("mandlebrot")) {
	speak("correct");
	System.out.println("correct");
}
else {
	speak("wrong");
	System.out.println("wrong");
}
speak("spell hello");
// 2. Catch the user's answer in a String
String letter = JOptionPane.showInputDialog("Type answer here");
// 3. If the user spelled the word correctly, speak "correct"
if(letter.equalsIgnoreCase("hello")) {
speak("correct");
System.out.println("correct");
}
else {
speak("wrong");
System.out.println("wrong");
}
		// 4. Otherwise say "wrong"

		// 5. repeat the process for other words
		
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}


