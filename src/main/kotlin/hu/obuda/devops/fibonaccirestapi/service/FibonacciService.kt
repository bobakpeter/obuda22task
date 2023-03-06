package hu.obuda.devops.fibonaccirestapi.service

import org.springframework.stereotype.Service

@Service
class FibonacciService {
    fun fibonacci(n: Int): Int {
        if (n == 1) {
            return 1
        } else if (n == 0) {
            return 0
        } else { // (n >= 2)
            return fibonacci(n - 1) + fibonacci(n - 2)
        }
    }
}