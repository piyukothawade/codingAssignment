// Selecting all buttons and the display
const buttons = document.querySelectorAll(".buttons button");
const display = document.querySelector(".display");
let isNewValue = false; // New flag

// Add event listener for each button
buttons.forEach(button => {
    button.addEventListener("click", function() {
        const value = this.getAttribute("data-value");
        
        switch (value) {
            case "DEL":
                display.value = display.value.slice(0, -1);
                isNewValue = false;
                break;
            case "AC":
                display.value = "";
                isNewValue = false;
                break;
            case "=":
                try {
                    display.value = eval(display.value); // Evaluate the expression
                    isNewValue = true; // Setting the flag to true after a calculation
                } catch (err) {
                    display.value = "Error"; // Display an error message
                    isNewValue = true;
                }
                break;
            default:
                if (isNewValue) {
                    display.value = value;
                    isNewValue = false;
                } else {
                    display.value += value; // Append the button value to the display
                }
        }
    });
});
