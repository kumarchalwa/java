<!DOCTYPE html>
<html>
<head>
    <title>JavaScript Example</title>
</head>
<body>
    <h1>Click the button</h1>
    <button id="myButton">Click Me</button>

    <script>
        // Get a reference to the button element
        var button = document.getElementById("myButton");

        // Add a click event listener to the button
        button.addEventListener("click", function () {
            // Display an alert when the button is clicked
            alert("Button clicked!");
        });
    </script>
</body>
</html>
