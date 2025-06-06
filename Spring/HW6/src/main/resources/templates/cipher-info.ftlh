<!DOCTYPE html>
<html>
<head>
    <title>CipherAficionado</title>
</head>
<body>
    <h1>CipherAficionado</h1>
    <h3>More information about cipher</h3>
    <b>Name: </b>${cipher.title}<br>
    <b>Description: </b>${cipher.description}<br>
    <b>Creator: </b>${cipher.creator}<br>
    <b>Year: </b>${cipher.yearCreated}<br>
    <hr>
<form action="/cipher/delete/${cipher.id}" method="post">
    <input type="submit" value="Delete cipher"/>
</form>
</body>
</html>