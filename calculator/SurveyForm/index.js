document.getElementById('surveyForm').addEventListener('submit', function(e) {
    e.preventDefault();

    let formData = new FormData(e.target);
    
    let validationPassed = true;
    let output = '';

    for (let [name, value] of formData.entries()) {
        // For the sake of simplicity, just check if the fields have values
        if (!value) {
            validationPassed = false;
            alert(name + " is required.");
            break;
        }
        output += name.charAt(0).toUpperCase() + name.slice(1) + ': ' + value + '\n';
    }

    if (validationPassed) {
        alert(output); // Displaying the values in a popup
        e.target.reset(); // Resetting the form
    }
});
