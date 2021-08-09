<!-- Tom Saju | B191290CS | DBMS LAB EXERCISE 1 -->
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Student Biodata</title>

	<style type="text/css">
          body {
              background-color: #055052;
              font-size: 1.5em;
          }
          .main-div{
            line-height: 1.3;
            color: #F3F2C9;
            margin-bottom: 30px;
          }

          h3.rollNo{
            text-align: center;
            margin-top: 20px;
            margin-bottom: 40px;
            font-family: 'Sacramento', cursive;
            font-size: 1.5em;
            color: #53B8BB;
            font-weight: bolder;
          }

          input {
          	height: 40px;
            width: 30%;
            margin-left: 10px;
            border-radius: 8px;
            padding: 20px;
          }

          .btn{
            text-align: center;
            background: #11cdd4;
            background-image: -webkit-linear-gradient(top, #11cdd4, #11999e);
            background-image: -moz-linear-gradient(top, #11cdd4, #11999e);
            background-image: -ms-linear-gradient(top, #11cdd4, #11999e);
            background-image: -o-linear-gradient(top, #11cdd4, #11999e);
            background-image: linear-gradient(to bottom, #11cdd4, #11999e);
            -webkit-border-radius: 8;
            -moz-border-radius: 8;
            border-radius: 8px;
            font-family: 'Montserrat', sans-serif;
            color: #ffffff;
            font-size: 20px;
            padding: 5px 20px 5px 20px;
            text-decoration: none;
        }

        .btn:hover{
            background: #30e3cb;
            background-image: -webkit-linear-gradient(top, #30e3cb, #2bc4ad);
            background-image: -moz-linear-gradient(top, #30e3cb, #2bc4ad);
            background-image: -ms-linear-gradient(top, #30e3cb, #2bc4ad);
            background-image: -o-linear-gradient(top, #30e3cb, #2bc4ad);
            background-image: linear-gradient(to bottom, #30e3cb, #2bc4ad);
            text-decoration: none;
        }
	</style>
</head>
<body>
	<header>
		<h3 class="rollNo">Enter ROLL NUMBER of the Student :</h3>
	</header>
	<main>
		<div style="text-align: center;">
			<form action="Q2-redirect.php" method="post">
				<input type="search" name="search" placeholder="Roll Number : ">

				<br><br>

				<button class="btn" type="submit" name="searchBtn">Search Biodata</button>
			</form>
		</div>
	</main>
</body>
</html>