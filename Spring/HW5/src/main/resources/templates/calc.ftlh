<!DOCTYPE html>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
    <h1>Calculator</h1>
    
    <form action="/" method="get">
        <label for="operand1">Operand 1:</label>
        <input type="number" name="operand1" id="operand1" required>

        <label for="operation">Operation:</label>
        <select name="operation" id="operation">
            <option value="+">+</option>
            <option value="-">-</option>
            <option value="*">*</option>
            <option value="/">/</option>
        </select>
        
        <label for="operand2">Operand 2:</label>
        <input type="number" name="operand2" id="operand2" required>

        <input type="submit" value="Calculate">
    </form>
    
    <h2>Result: ${result}</h2>
</body>
</html>