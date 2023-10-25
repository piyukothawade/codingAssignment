function sortDescending(arr) {
    let n = arr.length;
    let swapped;

    do {
        swapped = false;

        for (let i = 0; i < n - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                let temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                swapped = true;
            }
        }
        n--;

    } while (swapped);

    return arr;
}

// Test
var numbers = [34, 2, 56, 12, 89, 27];
console.log(sortDescending(numbers));  