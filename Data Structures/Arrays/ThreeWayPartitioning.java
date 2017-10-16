// Three way partitioning of an array around a given range
// Given an array and a range [lowVal, highVal], partition the array around the range such that array is divided in three parts.
// 1) All elements smaller than lowVal come first.
// 2) All elements in range lowVal to highVVal come next.
// 3) All elements greater than highVVal appear in the end.
// The individual elements of three sets can appear in any order.

class ThreeWayPartioning{

public static void threeWayPartition(int arr[], int lowVal, int highVal)
{
	int len = arr.length;
}

public static void main(String[] args) {
	int arr[] = {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32};
    threeWayPartition(arr, 10, 20);
  	
}

}
