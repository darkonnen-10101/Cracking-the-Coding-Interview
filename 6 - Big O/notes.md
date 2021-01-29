# Big O notation

Big O time is the language and metric we use to describe the efficiency of algorithms.

Time complexity & Space complexity

Big O (upper bound)!= Big O (Omega, lower bound) != Big O (Theta, both)

We can describe the runtime for an algorithm in three main ways:

1.- Best case
2.- Worst case
3.- Expected case

- Drop the constants O(2N) -> O(N)
- Drop the Non-dominant terms O(N + log N) -> O(N)
- Multi-Part algorithms: Add vs. Multiply. O(A+B) | O(A*B)
- Amortized Time -> wtf
- Log N Runtimes -> when, in a problem, the number of elements in the problem space gets halved each time, that will be likely a O(log N) runtime.
- Recursive Runtimes -> likely O(2ⁿ) and space complexity of O(N)

Excercises

`
boolean isPrime(int n) {
	for (int x = 2; x * x <= n; x++) {
		if (n % x == 0) {
			return false;
		}
	}
	return true;
}
`
`
int factorial(int n) {
    if (n < 0) {
        return -1;
    } else if (n == 0) {
        return 1;
    } else {
        return n * factorial(n - 1);
    }
}
`
