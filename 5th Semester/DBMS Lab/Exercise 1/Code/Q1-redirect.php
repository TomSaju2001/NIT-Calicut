<?php 
// Tom Saju | B191290CS | DBMS LAB EXERCISE 1
$conn = mysqli_connect('localhost', 'root', '', 'exercise1');

if (!$conn) {
	die("Connection ERROR". mysqli_connect_error());
}

if (isset($_POST['submit'])) {
	$name = $_POST['name'];
    $rollNo = $_POST['rollNo'];
    $DOB = $_POST['DOB'];
    $address = $_POST['address'];
    $mobileNo =$_POST['mobileNo'];
    $email = $_POST['email'];
    $s1 = $_POST['s1'];
    $s2 = $_POST['s2'];
    $s3 = $_POST['s3'];
    $s4 = $_POST['s4'];
    $s5 = $_POST['s5'];
    $s6 = $_POST['s6'];
    $s7 = $_POST['s7'];
    $s8 = $_POST['s8'];
    $cgpa = $_POST['cgpa'];
    $hobbies =  $_POST['hobbies'];
    $h_or_d =  $_POST['h_or_d'];
    $ref =  $_POST['ref'];
}


$sql = "INSERT INTO `exercise1` (`name`, `rollNo`, `DOB`, `address`, `mobileNo`, `email`, `s1`, `s2`, `s3`, `s4`, `s5`, `s6`, `s7`, `s8`, `cgpa`, `hobbies`, `h_or_d`, `ref`) VALUES ('$name', '$rollNo', '$DOB', '$address', '$mobileNo', '$email', '$s1', '$s2', '$s3', '$s4', '$s5', '$s6', '$s7', '$s8', '$cgpa', '$hobbies', '$h_or_d', '$ref');";

 if(!(mysqli_query($conn,$sql))){
        echo mysqli_error($conn);
    }

?>

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

          h3.thankYou{
            text-align: center;
            margin-top: 20px;
            margin-bottom: 40px;
            font-family: 'Sacramento', cursive;
            font-size: 1.5em;
            color: #53B8BB;
            font-weight: bolder;
          }

          table{
            margin-left: auto;
            margin-right: auto;
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
        <h3 class="thankYou">Thank You, Your Submission has been recieved.!</h3>
       </header>
       <div class="main-div">
             <table>
              <tbody>
                     <tr>
                        <td><label>NAME</label></td>
                        <td>:</td>
                        <td><?php echo $name; ?></td>
                    </tr>
                    <tr>
                        <td><label>Roll Number</label></td>
                        <td>:</td>
                        <td><?php echo $rollNo; ?></td>
                    <tr>
                        <td><label>Date Of Birth</label></td>
                        <td>:</td>
                        <td><?php $DOB; ?></td>
                    </tr>
                    <tr>
                        <td><label>Address</label></td>
                        <td>:</td>
                        <td><?php echo $address; ?></textarea></td>
                    </tr>
                    <tr>
                        <td><label>Mobile Number</label></td>
                        <td>:</td>
                        <td><?php echo $mobileNo; ?></td>
                    </tr>
                    <tr>
                        <td><label>E-mail ID</label></td>
                        <td>:</td>
                        <td><?php echo $email; ?></td>
                    </tr>

                    <tr>
                        <td><label><h4>Semester Wise SGPA's</h4></label></td>
                    </tr>

                    <tr>
                        <td><label>Semester 1</label></td>
                        <td>:</td>
                        <td><?php echo $s1; ?></td>
                    </tr>
                    <tr>
                        <td><label>Semester 2</label></td>
                        <td>:</td>
                        <td><?php echo $s2; ?></td>
                    </tr>
                    <tr>
                        <td><label>Semester 3</label></td>
                        <td>:</td>
                        <td><?php echo $s3; ?></td>
                    </tr>
                    <tr>
                        <td><label>Semester 4</label></td>
                        <td>:</td>
                        <td><?php echo $s4; ?></td>
                    </tr>
                    <tr>
                        <td><label>Semester 5</label></td>
                        <td>:</td>
                        <td><?php echo $s5; ?></td>
                    </tr>
                    <tr>
                        <td><label>Semester 6</label></td>
                        <td>:</td>
                        <td><?php echo $s6; ?></td>
                    </tr>
                    <tr>
                        <td><label>Semester 7</label></td>
                        <td>:</td>
                        <td><?php echo $s7; ?></td>
                    </tr>
                    <tr>
                        <td><label>Semester 8</label></td>
                        <td>:</td>
                        <td><?php echo $s8; ?></td>
                    </tr>
                    <tr>
                        <td><br></td>
                        <td><br></td>
                        <td><br></td>
                    </tr>
                    <tr>
                        <td><label>CGPA</label></td>
                        <td>:</td>
                        <td><?php echo $cgpa; ?></td>
                    </tr>
                    <tr>
                        <td><br></td>
                        <td><br></td>
                        <td><?php  ?><br></td>
                    </tr>
                    <tr>
                        <td><label>Hobbies</label></td>
                        <td>:</td>
                        <td><?php echo $hobbies; ?></td>
                    </tr>
                    <tr>
                        <td><label>Hosteller or Day scholar</label></td>
                        <td>:</td>
                        <td><?php echo $h_or_d; ?></td>
                    </tr>
                    <tr>
                        <td><label>References</label></td>
                        <td>:</td>
                        <td><?php echo $ref; ?></td>
                    </tr>
              </tbody>
       </table> 
       <div style="text-align: center; margin-top: 50px;">
             <a href="Q1.php" class="btn">Enter Again</a> 
       </div>
       
       </div>
       
</body>
</html>
