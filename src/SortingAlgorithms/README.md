Bubble Sort:    
    Time Complexity - O(n^2)       
        Sorting Style:  
        Uses a nested for-loop to repeatedly 
        compare adjacent elements in the array, 
        starting from index 0. On each pass, it 
        swaps elements if they are in
        the wrong order
        (e.g., if the current element is greater 
        than the next in ascending sort). 
        This "bubbling" continues until the
        largest unsorted element moves to its correct 
        position, and the process repeats for the
        remaining unsorted portion.

Insertion Sort:     
    Time Complexity - Worst and Avg O(n^2) - Best Case O(n); only when input is already sorted      
        Sorting Style:      
            Builds a sorted portion of the array from 
            left to right, starting at index 1.
            For each element at index i, it finds the
            correct position in the already sorted 
            left portion (from index 0 to i-1) by 
            shifting larger elements to the right, 
            then inserts the current element into 
            its proper place.

Selection Sort:     
    Time Complexity - O(n^2)        
        Sorting Style:      
Divides the array into a sorted and an unsorted region. Repeatedly selects the smallest (or largest, depending on sorting order) element from the unsorted portion and swaps it with the first unsorted element, expanding the sorted region by one each time.