def binary_search(lst, key):  
    low = 0  
    high = len(lst) - 1  
    mid = 0  
  
    while low <= high:  
        # for get integer result   
        mid = (high + low) // 2  
  
        # Check if n
        # key is present at mid   
        if lst[mid] < key:  
            low = mid + 1  
  
        # If n is greater, compare to the right of mid   
        elif lst[mid] > key:  
            high = mid - 1  
  
        # If n is smaller, compared to the left of mid  
        else:  
            return mid  
  
            # element was not present in the list, return -1  
    return -1  
  
  
# creating an empty list
lst = []
  
# number of elements as input
n = int(input("Enter number of elements : "))
  
# iterating till the range
for i in range(0, n):
    ele = int(input())
  
    lst.append(ele) # adding the element
      
print(lst)  
key = int(input("Enter the element which you want to Search : "))
# Function call   
result = binary_search(lst, key)  
  
if result != -1:  
    print("Element is present at index", str(result))  
else:  
    print("Element is not present in list")  
