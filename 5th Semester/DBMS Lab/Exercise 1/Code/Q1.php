<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Student Biodata</title>
    <link href="https://fonts.googleapis.com/css?family=Merriweather|Montserrat|Sacramento" rel="stylesheet" >

    <style type="text/css">
        body{
            background-color: #055052;
            font-size: 1.5em;
        }
        * {
            box-sizing: border-box;
        }
        h1.biodata{
            text-align: center;
            margin-top: 20px;
            margin-bottom: 20px;
            font-family: 'Sacramento', cursive;
            font-size: 2.5em;
            color: #53B8BB;
            font-weight: bolder;
        }

        h4{
            margin-bottom: 10px;
        }

        .main-div{
            margin-left: 550px;
            line-height: 1.3;
            color: #F3F2C9;
        }

        input {
            width: 80%;
            margin-left: 10px;
        }

        textarea{
            margin-left: 10px;
        }

        select {
            margin-left: 10px;
        }

        .btn{
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
            margin-left: 180px;
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
        <h1 class="biodata">BIODATA</h1>
    </header>

    <main>
        <div class="main-div">
        <form action="Q1-Redirect.php" method="post">
            <table class="form-table">
                <tbody>
                    <tr>
                        <td><label>NAME</label></td>
                        <td>:</td>
                        <td><input type="text" name="name" placeholder="Student Name"></td>
                    </tr>
                        <td><label>Roll Number</label></td>
                        <td>:</td>
                        <td><input type="text" name="rollNo" placeholder="Student Roll No:"></td>
                    <tr>
                        <td><label>Date Of Birth</label></td>
                        <td>:</td>
                        <td><input type="date" name="DOB" placeholder="DOB"></td>
                    </tr>
                    <tr>
                        <td><label>Address</label></td>
                        <td>:</td>
                        <td><textarea name="address" placeholder="Address" rows="4" cols="31"></textarea></td>
                    </tr>
                    <tr>
                        <td><label>Mobile Number</label></td>
                        <td>:</td>
                        <td><input type="text" name="mobileNo" placeholder="Mobile Number"></td>
                    </tr>
                    <tr>
                        <td><label>E-mail ID</label></td>
                        <td>:</td>
                        <td><input type="text" name="email" placeholder="Email Id"></td>
                    </tr>

                    <tr>
                        <td><label><h4>Semester Wise SGPA's</h4></label></td>
                    </tr>

                    <tr>
                        <td><label>Semester 1</label></td>
                        <td>:</td>
                        <td><input type="number" name="s1" placeholder="sgpa"></td>
                    </tr>
                    <tr>
                        <td><label>Semester 2</label></td>
                        <td>:</td>
                        <td><input type="number" name="s2" placeholder="sgpa"></td>
                    </tr>
                    <tr>
                        <td><label>Semester 3</label></td>
                        <td>:</td>
                        <td><input type="number" name="s3" placeholder="sgpa"></td>
                    </tr>
                    <tr>
                        <td><label>Semester 4</label></td>
                        <td>:</td>
                        <td><input type="number" name="s4" placeholder="sgpa"></td>
                    </tr>
                    <tr>
                        <td><label>Semester 5</label></td>
                        <td>:</td>
                        <td><input type="number" name="s5" placeholder="sgpa"></td>
                    </tr>
                    <tr>
                        <td><label>Semester 6</label></td>
                        <td>:</td>
                        <td><input type="number" name="s6" placeholder="sgpa"></td>
                    </tr>
                    <tr>
                        <td><label>Semester 7</label></td>
                        <td>:</td>
                        <td><input type="number" name="s7" placeholder="sgpa"></td>
                    </tr>
                    <tr>
                        <td><label>Semester 8</label></td>
                        <td>:</td>
                        <td><input type="number" name="s8" placeholder="sgpa"></td>
                    </tr>
                    <tr>
                        <td><br></td>
                        <td><br></td>
                        <td><br></td>
                    </tr>
                    <tr>
                        <td><label>CGPA</label></td>
                        <td>:</td>
                        <td> <input type="number" name="cgpa" placeholder="cgpa"></td>
                    </tr>
                    <tr>
                        <td><br></td>
                        <td><br></td>
                        <td><br></td>
                    </tr>
                    <tr>
                        <td><label>Hobbies</label></td>
                        <td>:</td>
                        <td><textarea type="text" name="hobbies" placeholder="Enter Your Hobbies Row-Wise" rows="4" cols="31" style="margin-right: 59px;"></textarea></td>
                    </tr>
                    <tr>
                        <td><label>Hosteller or Day scholar</label></td>
                        <td>:</td>
                        <td>
                            <select name="h_or_d" style="width: 240px;">
                                <option value="Hosteller">Hosteller</option>
                                <option value="Day scholar">Day scholar</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td><label>References</label></td>
                        <td>:</td>
                        <td><textarea type="text" name="ref" placeholder="References" rows="4" cols="31"></textarea></td>
                    </tr>
                </tbody>
            </table>
        </form>

        <br>
        <button name="submit" class="btn">SUBMIT</button>
        </div>
    </main>
</body>
</html>