fun calculateBinomial(n: Int, k: Int): Long{

    val numerator = factorial(n)
    val denominator = factorial(k)*factorial(n-k)
    return numerator / denominator

}