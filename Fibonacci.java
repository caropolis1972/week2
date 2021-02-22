/* Author: Rosa C. Rodriguez
1. The Fibonacci sequence
In the 13th century, the Italian mathematician Leonardo Fibonacci—as a way to explain
the geometic growth of a population of rabbits—devised a mathematical sequence that
now bears his name. The first two terms in this sequence, Fib(0) and Fib(1), are 0 and 1,
and every subsequent term is the sum of the preceding two. Thus, the first several terms
in the Fibonacci sequence look like this:
Fib(0) = 0
Fib(1) = 1
Fib(2) = Fib(0) + Fib(1) = (0 + 1) = 1
Fib(3) = Fib(1) + Fib(2) = (1 + 1) = 2
Fib(4) = Fib(2) + Fib(3) = (1 + 2) = 3
Fib(5) = Fib(3) + Fib(4) = (2 + 3) = 5
*/

package week2;

import acm.program.*;

public class Fibonacci extends ConsoleProgram {

	private static final int MAX_TERM_VALUE = 10000;

	public void run() {
		int term1 = 0;
		int term2 = 1;
		int term = 0;
		System.out.println(term1);
		System.out.println(term2);

		while (term < MAX_TERM_VALUE) {
			System.out.println(term1 + term2);		
			term = term1 + term2;
			term1 = term2;
			term2 = term;
			term=term+term1;
		}
	}
}
