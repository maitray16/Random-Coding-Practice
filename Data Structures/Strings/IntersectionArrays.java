// Given two arrays, write a function to compute their intersection.

// Example:
// Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].
class IntersectionArrays
{
	public static void printIntersection(int arr1[], int arr2[], int m, int n)
	{
		int i=0, j=0;
		while(i<m && j<n)
		{
			if(arr1[i] < arr2[j])
				i++;
			else if (arr2[i] > arr1[j])
				j++;
			else
			{
				System.out.println(arr2[j++]+ " ");
				i++;
			}	

		}

	}

	public static void main(String[] args) {
		int arr1[] = {1, 2, 4, 5, 6};
        int arr2[] = {2, 3, 5, 7};
        int m = arr1.length;
        int n = arr2.length;
        printIntersection(arr1, arr2, m, n);
	}
}