package DeterministicFiniteAutomaton;

import java.util.Arrays;

public class DeterministicFiniteAutomaton {
	
	 public static void main(String[] args) {
		 
		 	header();		 
		 	String state = "q0", input = "011101101";
	        String[] states = {"q0", "q1", "q2"};
	        
	        char[] alphabet = {'0', '1'};
	        printInputInfo(input, states, alphabet);
	        
	        if (processInput(state, input, states, alphabet)) {
	            System.out.println("\nString accepted.");
	        } else {
	            System.out.println("\nString not accepted.");
	        }
	        displayProgrammer();
	    }

	    public static boolean processInput(String state, String input, String[] states, char[] alphabet) {
	        for (int i = 0; i < input.length(); i++) {
	            if (state.equals(states[0]) && input.charAt(i) == alphabet[0]) {
	                state = states[1];
	            } else if (state.equals(states[1]) && input.charAt(i) == alphabet[1]) {
	                state = states[2];
	            } else if (state.equals(states[2]) && input.charAt(i) == alphabet[0]) {
	                state = states[1];
	            } else if (state.equals(states[2]) && input.charAt(i) == alphabet[1]) {
	                state = states[0];
	            } else if (state.equals(states[0]) && input.charAt(i) == alphabet[1] ||
	                    state.equals(states[1]) && input.charAt(i) == alphabet[0]) {
	                continue;
	            } else {
	                System.out.println("Invalid input... exiting automaton.");
	                return false;
	            }
	        }

	        return state.equals(states[2]);
	    }
	 
	 public static void printInputInfo(String input, String[] states, char[] alphabet) {
	        System.out.println("Input: " + input);
	        System.out.println("States: " + String.join(" ", states));
	        System.out.println("Alphabet: " + Arrays.toString(alphabet));
	    }
	 
	 
	 public static void header() {
	        System.out.println("\n\t(======================= FINITE AUTOMATA =========================)");
	        System.out.println("\t(===== Laboratory003 - DFA (Deterministic Finite Automata) =======)");
	        System.out.println("\t-------------------------------------------------------------------\n");
	        System.out.println("Below is a DFA accepting strings ending with '01'"
			 		+ " \nover input alphabets sigma = {0, 1}\n");
	    }

	    public static void displayProgrammer() {
	    	System.out.println("\n\t\t-----------> Program Terminated <--------------");
			System.out.println("# =========================================================================== #");		
			System.out.println("|                   2023 @ Sharon Grace T. Hangaan                            |");
			System.out.println("|             Follow me in: https://github.com/SG-Hangaan                     |");
			System.out.println("|                  Email: sharonygracehangaan@gmail.com                       |");
			System.out.println("# =========================================================================== #");	
	    }

}
