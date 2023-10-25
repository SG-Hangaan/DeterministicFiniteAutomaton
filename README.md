# DFA (Deterministic Finite Automata)

* DFA refers to deterministic finite automata. Deterministic refers to the uniqueness of the computation. The finite automata are called deterministic finite automata if the machine is read an input string one symbol at a time.  <br>
* In DFA, there is only one path for specific input from the current state to the next state. <br>
* DFA does not accept the null move, i.e., the DFA cannot change state without any input character.  <br>
* DFA can contain multiple final states. It is used in Lexical Analysis in Compiler.  <br>


Example <br>
Q = {q0, q1} <br>
∑ = {a, b} <br>

Below is an automaton that accepts a string that starts with a or b, any combination of a and b in the middle and ends with a

<p align="center">
  <img src="https://github.com/SG-Hangaan/DeterministicFiniteAutomaton/assets/127215110/0fc52166-ea38-46da-936e-81eaa4cda0ff"/>
</p>


<p align="center">
  <img src="https://github.com/SG-Hangaan/DeterministicFiniteAutomaton/assets/127215110/42755575-4b6b-4fb4-a080-8c22736baeba"/>
</p>

<p align="center">
  <img src="https://github.com/SG-Hangaan/DeterministicFiniteAutomaton/assets/127215110/1d4f9935-5cfe-43ac-967c-4b313fb68e20"/>
</p>

<p align="center">
Below is a DFA accepting strings ending with ‘01’ over input alphabets ∑ = {0, 1} <br>
<br>
  <img src="https://github.com/SG-Hangaan/DeterministicFiniteAutomaton/assets/127215110/173b5f35-15e4-40e1-a072-e688be19b58c"/>
</p>

# Implementation of DFA (Deterministic Finite Automata)
<p align="center">
  <img src="https://github.com/SG-Hangaan/DeterministicFiniteAutomaton/assets/127215110/3325fb66-9a70-4ae5-a35f-586197083b9e"/>
</p>






















