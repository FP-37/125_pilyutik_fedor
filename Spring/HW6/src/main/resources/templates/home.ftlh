<!DOCTYPE html>
<html>
<head>
    <title>CipherAficionado</title>
</head>
<body>
    <h1> Hello, guys!</h1> 
    We have a lot of adherents in cryptology over the world!
    Register on the site if you want to participate in discussions.
    <hr>
    <img src="/images/welcome.jpg" width="300" height="400">
    <h4>List of the most popular ciphers:<h4>

<form action="/" method="get">
    Search by name of cipher: <input type="text" name="title"><br>
    <input type="submit" value="Search"/>
</form>

<#list ciphers as cipher>
        <div>
            <p><b>${cipher.title}</b> ${cipher.creator} | <a href="/cipher/${cipher.id}">More...</a></p>
        </div>
        <#else><h4>List is empty</h4>
</#list>
<hr>
<h3>Add a new cipher</h3>
<form action="/cipher/create" method="post">
        Name: <input type="text" name="title"/><br><br>
        Description: <input type="text" name="description"/><br><br>
        Creator: <input type="text" name="creator"/><br><br>
        Year: <input type= "number" name="yearCreated"/> <br></br>
        <input type="submit" value="Add a new cipher"/>
</form>
</body>
</html>