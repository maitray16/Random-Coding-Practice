import java.lang.*;
class MinCostPath
{
	private static int min(int x, int y, int z)
    {
        if (x < y)
            return (x < z)? x : z;
        else
            return (y < z)? y : z;
    }

	public static int minCost(int cost[][], int m, int n)
	{
		int i, j;
		int table[][] = new int[m+1][n+1];
		table[0][0] = cost[0][0];
		for(i=1; i<=m; i++)
			table[i][0] = table[i-1][0] + cost[i][0];

		for (j=1; j<=n; j++) {
			table[0][j] = table[0][j-1] + cost[0][j];
		}

		for(i=1; i<=m; i++)
			for(j=1; j<=n; j++)
				table[i][j] = min(table[i-1][j-1], table[i-1][j], table[i][j-1]) + cost[i][j];

		return table[m][n];
 	}

	public static void main(String[] args) {
		int cost[][]= {{1, 2, 3},
                       {4, 8, 2},
                       {1, 5, 3}};
        System.out.println("minimum cost to reach (2,2) = " + minCost(cost,2,2));
	}
}