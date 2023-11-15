
import kotlin.math.pow

// n = number of trials
// p = succesrate
// x = a value from 0 to n. It represents a possible outcome. It represents a random_variable X

// Calculating a binomial distribution means calculation the chance for every X (random_variable) that is possible in the trials, from 0 to n
fun calculateBinomialDistribution(n: Int, p: Double){

    var k = 0

        // calculate (1-p)^n-k
        val chance = (1-p).pow(n-k)

    while (k < n+1){
        println("The change of the experiment returning $k times true is: ${ calculateBinomial(n, k) * p.pow(k) * chance }")
        k++
    }


    }


