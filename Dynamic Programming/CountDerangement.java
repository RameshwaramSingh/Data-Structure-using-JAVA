// Count derangement Geeks for geeks


// using memoiztion
class DerangementCounter {

    private static final int MOD = 1000000007;

    public long countDerangementsMemo(int n) {
        // Handle small n immediately
        if (n <= 1) return 0;
        
        // dp array initialized with -1 (or some indicator) for uncomputed states
        long[] dp = new long[n + 1];
        java.util.Arrays.fill(dp, -1);
        
        // Set base cases in the DP array
        dp[0] = 1; // D(0) is conventionally 1
        dp[1] = 0;

        return solve(n, dp);
    }

    private long solve(int n, long[] dp) {
        // Base Cases already handled/set in the main method, but safe check here
        if (n == 0) return 1;
        if (n == 1) return 0;
        
        // If already computed, return the stored value
        if (dp[n] != -1) {
            return dp[n];
        }

        // Recurrence relation: D(n) = (n - 1) * [D(n-1) + D(n-2)]
        long term1 = solve(n - 1, dp);
        long term2 = solve(n - 2, dp);
        
        // Calculate result and apply modulo at each step
        long result = ((n - 1) * (term1 + term2)) % MOD;

        // Store and return
        dp[n] = result;
        return result;
    }
}



// using tabulation
class DerangementCounter {

    private static final int MOD = 1000000007;

    public long countDerangementsTabu(int n) {
        if (n <= 1) return 0;

        // dp array of size n+1
        long[] dp = new long[n + 1];

        // 1. Base Cases
        dp[0] = 1; // D(0)
        dp[1] = 0; // D(1)

        // 2. Iterate and apply recurrence
        for (int i = 2; i <= n; i++) {
            long prev1 = dp[i - 1]; // D(i-1)
            long prev2 = dp[i - 2]; // D(i-2)

            // D(i) = (i - 1) * [D(i-1) + D(i-2)]
            // Ensure additions are done modulo MOD first, before multiplication
            long sum = (prev1 + prev2) % MOD;
            
            // Multiply by (i - 1) and apply final modulo
            dp[i] = ((i - 1) * sum) % MOD;
        }

        // The answer is stored at dp[n]
        return dp[n];
    }
}
