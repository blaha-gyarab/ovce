<html>

<head>
    <title>Chceš znát čas brácho?</title>
</head>
<body>
<h2>Chceš znát čas brácho?</h2>
<p>Vyber:</p>
<form method="GET" action="MyServlet">
    <p>
        KOlik more <input type="number" name="pocet" size="20">
    </p>
    <p>

        <select name="loka" id="loka">
            <option value="Europe/Prague">Práža</option>
            <option value="Asia/Kolkata">KOlka</option>
            <option value="Asia/Tokyo">Tókáčko</option>
            <option value="Europe/London">Lond</option>
        </select>
    </p>
    <p>
        <input type="submit" value="Submit" name="B1">
    </p>
</form>
<p>&nbsp;</p>
</body>
</html>
