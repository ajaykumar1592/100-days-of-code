Implement a Binary Search in Python
First, we implement a binary search with the iterative method. We will repeat a set of statements and iterate every item of the list. 
We will find the middle value until the search is complete.

We have a sorted list of elements, and we are looking for the index position of 45.

[12, 24, 32, 39, 45, 50, 54]

So, we are setting two pointers in our list. One pointer is used to denote the smaller value called low and the second pointer is used to denote the highest value called high.

Next, we calculate the value of the middle element in the array.

mid = (low+high)/2  
Here, the low is 0 and the high is 7.  
mid = (0+7)/2  
mid = 3 (Integer)  
Now, we will compare the searched element to the mid index value. In this case, 32 is not equal to 45. So we need to do further comparison to find the element.

If the number we are searching equal to the mid. Then return mid otherwise move to the further comparison.

The number to be search is greater than the middle number, we compare the n with the middle element of the elements on the right side of mid and set low to low = mid + 1.

Otherwise, compare the n with the middle element of the elements on the left side of mid and set high to high = mid - 1.

We have created a function called binary_search() function which takes two arguments - a list to sorted and a number to be searched.
We have declared two variables to store the lowest and highest values in the list. The low is assigned initial value to 0, high to len(list1) - 1 and mid as 0.
Next, we have declared the while loop with the condition that the lowest is equal and smaller than the highest The while loop will iterate if the number has not been found yet.
In the while loop, we find the mid value and compare the index value to the number we are searching for.
If the value of the mid-index is smaller than n, we increase the mid value by 1 and assign it to The search moves to the left side.
Otherwise, decrease the mid value and assign it to the high. The search moves to the right side.
If the n is equal to the mid value then return mid.
This will happen until the low is equal and smaller than the high.
If we reach at the end of the function, then the element is not present in the list. We return -1 to the calling function.

