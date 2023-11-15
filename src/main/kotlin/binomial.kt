fun calculateBinomial(n: Int, k: Int): Long{

    if (n >= k){
        val numerator = factorial(n)
        val denominator = factorial(k)*factorial(n-k)
        return numerator / denominator
    } else return 0



}