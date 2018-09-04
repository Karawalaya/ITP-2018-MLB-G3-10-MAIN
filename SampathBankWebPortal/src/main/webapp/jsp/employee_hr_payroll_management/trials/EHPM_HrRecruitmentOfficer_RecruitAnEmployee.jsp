<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <!-- Required meta tags -->
        <meta charset="ISO-8859-1">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="/SampathBankWebPortal/resources/css&js&jquery/bootstrap/css/bootstrap.css">
        <link rel="stylesheet" href="/SampathBankWebPortal/resources/css&js&jquery/customized.css" type="text/css">
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
        <title>HR Recruitment Officer</title>
    </head>

    <body>
        <nav class="navbar fixed-top navbar-expand-md navbar-dark fixed-stuff">
            <div class="navbar-collapse collapse w-100 order-1 order-md-0 dual-collapse2">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="#" title="Go to Employee Homepage">EmpHome</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#" title="Go to Customer Homepage">CustomerHome</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#" title="View Profile">MyProfile</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#" title="View Company Messages">MyInbox</a>
                    </li>
                </ul>
            </div>
            <div class="mx-auto order-0">
                <a class="navbar-brand mx-auto" href="#" title="Go to Employee Homepage">SampathEmpWeb</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target=".dual-collapse2">
                    <span class="navbar-toggler-icon"></span>
                </button>
            </div>
            <div class="navbar-collapse collapse w-100 order-3 dual-collapse2">
                <ul class="navbar-nav ml-auto">
                    <li class="nav-item" title="Sign Up">
                        <a class="nav-link" href="#"><span class="fa fa-user"></span> Sign Up</a>
                    </li>
                    <li class="nav-item" title="Login">
                        <a class="nav-link" href="#"><span class="fa fa-sign-in"></span> Login</a>
                    </li>
                </ul>
            </div>
        </nav>

        <header class="page-header" id="header01">
            <div class="header-mid">
                <a href="#" title="Go to Sampath Web Site">
                    <div class="container-fluid img-div">
                        <img src="/SampathBankWebPortal/resources/images/sampathbanklogo/SampathBankLogo01.png" alt="" class="logo">
                    </div>
                </a>
                <div style=" float: right">
                    <div class="container-fluid img_profile_div">
                        <img src="/SampathBankWebPortal/resources/images/ProfilePlaceholder.png" alt="" class="pro-pic">
                    </div>
                    <div class="container-fluid" style="float: right; clear: both;" >
                        <a href="">Mr. xxx xxx</a>
                    </div>
                </div>

            </div>

            <div class="container-fluid">
                <ul class="nav nav-pills nav-fill nav-justified nav-header">
                    <li class="nav-item dropdown" title="Click to See Your Duties">
                        <a class="nav-link nav-change" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false" style="border-radius: 15px; text-align: center; background-color: #FD4F00">Employee Duties</a>
                        <div class="dropdown-menu nav-dropdown">
                            <a class="dropdown-item" href="#" style="color:white">Recruit an Employee</a>
                            <a class="dropdown-item" href="#" style="color:white">Create Employee Online Account</a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="#" style="color:white">Leave Request Management</a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="#" style="color:white">Update Details of Employees</a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="#" style="color:white">Inactive Employees</a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="#" style="color:white">Salary Management</a>
                        </div>
                    </li>
                    <li class="nav-item dropdown" title="Click to See Leave Related Options">
                        <a class="nav-link nav-change" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false" style="border-radius: 15px; background-color: #FD4F00">Leave Request Inquiry</a>
                        <div class="dropdown-menu nav-dropdown">
                            <a class="dropdown-item" href="#" style="color:white">Apply for Leave</a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="#" style="color:white">Leave History</a>
                            <a class="dropdown-item" href="#" style="color:white">Leave Status</a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="#" style="color:white">Leave Analysis</a>
                            <a class="dropdown-item" href="#" style="color:white">File a Complaint</a>
                        </div>
                    </li>
                    <li class="nav-item dropdown" title="Click to See Salary Related Options">
                        <a class="nav-link nav-change" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false" style="border-radius: 15px; background-color: #FD4F00">Salary Inquiry</a>
                        <div class="dropdown-menu nav-dropdown">
                            <a class="dropdown-item" href="#" style="color:white">Calculate Salary</a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="#" style="color:white">Salary History</a>
                            <a class="dropdown-item" href="#" style="color:white">Next Salary Details</a>
                            <a class="dropdown-item" href="#" style="color:white">Personal Salary Details</a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="#" style="color:white">File a Complaint</a>
                        </div>
                    </li>
                    <li class="nav-item dropdown" title="Click to See Skills Related Options">
                        <a class="nav-link nav-change" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false" style="border-radius: 15px; background-color: #FD4F00">Skills Management</a>
                        <div class="dropdown-menu nav-dropdown">
                            <a class="dropdown-item" href="#" style="color:white">Action</a>
                            <a class="dropdown-item" href="#" style="color:white">Another action</a>
                            <a class="dropdown-item" href="#" style="color:white">Something else here</a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="#" style="color:white">Separated link</a>
                        </div>
                    </li>
                    <li class="nav-item dropdown" title="Click to See Mail Related Options">
                        <a class="nav-link nav-change" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false" style="border-radius: 15px; background-color: #FD4F00">Mailing System</a>
                        <div class="dropdown-menu nav-dropdown">
                            <a class="dropdown-item" href="#" style="color:white">Inbox</a>
                            <a class="dropdown-item" href="#" style="color:white">Outbox</a>
                            <a class="dropdown-item" href="#" style="color:white">New Message</a>
                        </div>
                    </li>
                    <li class="nav-item dropdown" title="Click to See Profile Related Options">
                        <a class="nav-link nav-change" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false" style="border-radius: 15px; background-color: #FD4F00">Profile Related</a>
                        <div class="dropdown-menu nav-dropdown">
                            <a class="dropdown-item" href="#" style="color:white">Profile Details</a>
                            <a class="dropdown-item" href="#" style="color:white">Update Profile</a>
                            <a class="dropdown-item" href="#" style="color:white">Change History</a>
                        </div>
                    </li>
                </ul>
            </div>
        </header>

<!--
    BODY BODY BODY BODY BODY BODY BODY BODY BODY BODY BODY BODY BODY BODY BODY BODY BODY BODY BODY BODY BODY BODY BODY BODY BODY BODY BODY BODY BODY BODY BODY
-->
		<nav aria-label="breadcrumb" class="breadcrumb-stuff">
		  <ol class="breadcrumb">
		    <li class="breadcrumb-item"><a href="#">EmpHome</a></li>
		    <li class="breadcrumb-item"><a href="#">Employee Duties</a></li>
		    <li class="breadcrumb-item active" aria-current="page">Recruit An Employee</li>
		  </ol>
		</nav>

        <div class="container-fluid" style="margin-bottom: 100px; height: 1000px">
            <br><h3>Enter Required Details</h3>
            <div class="container" style="margin-top: 50px">
            
<!-- 
	FORM FORM FORM FORM FORM FORM FORM FORM FORM FORM FORM FORM FORM FORM FORM FORM FORM FORM FORM FORM FORM FORM FORM FORM FORM FORM FORM FORM FORM FORM FORM
 -->
            
                <form action="/SampathBankWebPortal/EmployeeRecruitment" method="post">
                    <div style="float: left; margin-right: 5px;">
                        <div style="width: 550px; float: left; padding: 5px; border-width: 1px; border-style: solid; border-color: #FD4F00; margin-bottom: 5px;">
                            <h5>Basic Details</h5>
                            <div class="form-group row" style="padding: 4px; padding-left: 16px">
                                <label class="col-4 col-form-label" for="EmpForm01BasicDetails02">First Name:</label>
                                <div class="col-8">
                                    <input type="text" class="form-control" id="EmpForm01BasicDetails02" name="empFirstName" >
                                </div>
                            </div>
                            <div class="form-group row" style="padding: 4px; padding-left: 16px">
                                <label class="col-4 col-form-label" for="EmpForm01BasicDetails03">Middle Name:</label>
                                <div class="col-8">
                                    <input type="text" class="form-control" id="EmpForm01BasicDetails03" name="empMiddletName">
                                </div>
                            </div>
                            <div class="form-group row" style="padding: 4px; padding-left: 16px">
                                <label class="col-4 col-form-label" for="EmpForm01BasicDetails04">Last Name:</label>
                                <div class="col-8">
                                    <input type="text" class="form-control" id="EmpForm01BasicDetails04" name="empLastName">
                                </div>
                            </div>
                            <div class="form-group row" style="padding: 4px; padding-left: 16px">
                                <label class="col-4 col-form-label" for="EmpForm01BasicDetails05">Other Names:</label>
                                <div class="col-8">
                                    <input type="text" class="form-control" id="EmpForm01BasicDetails05" name="empOtherNames">
                                </div>
                            </div>
                            <div class="form-group row" style="padding: 4px; padding-left: 16px">
                                <label class="col-4 col-form-label" for="EmpForm01BasicDetails06">Gender:</label>
                                <div class="col-8">
                                    <select class="custom-select mr-sm-2" id="EmpForm01BasicDetails06" name="empGender">
                                        <option value="" disabled selected hidden>Choose...</option>
                                        <option value="male">Male</option>
                                        <option value="female">Female</option>
                                        <option value="error">error</option>
                                    </select>
                                </div>
                            </div>
                        </div>

                        <div style="width: 550px; padding: 5px; padding: 5px; border-width: 1px; border-style: solid; border-color: #FD4F00; clear: both">
                            <h5>Contact Details</h5>
                            <div class="form-group row" style="padding: 4px; padding-left: 16px">
                                <label class="col-4 col-form-label">Street Address:</label>
                                <div class="col-8">
                                    <div class="form-group">
                                        <label for="EmpForm01ContactDetails01">Line 01:</label>
                                        <input type="text" class="form-control" id="EmpForm01ContactDetails01" placeholder="1234 Main St" name="empAddLine01">
                                    </div>
                                    <div class="form-group">
                                        <label for="EmpForm01ContactDetails02">Line 02:</label>
                                        <input type="text" class="form-control" id="EmpForm01ContactDetails02" placeholder="Sub St" name="empAddLine02">
                                    </div>
                                </div>
                            </div>
                            <div class="form-group row" style="padding: 4px; padding-left: 16px">
                                <label class="col-2 col-form-label" for="EmpForm01ContactDetails03">City:</label>
                                <div class="col-4">
                                    <input type="text" class="form-control" id="EmpForm01ContactDetails03" name="empAddCity">
                                </div>
                                <label class="col-2 col-form-label" for="EmpForm01ContactDetails04">Province:</label>
                                <div class="col-4">
                                    <select class="custom-select mr-sm-2" id="EmpForm01ContactDetails04" name="empAddProvince">
                                        <option value="" disabled selected hidden>Choose...</option>
                                        <option value="western">Western</option>
                                        <option value="eastern">Eastern</option>
                                        <option value="central">Central</option>
                                        <option value="sourthern">Sourthern</option>
                                        <option value="northern">Northern</option>
                                        <option value="north western">North Western</option>
                                        <option value="sabaragamuwa">Sabaragamuwa</option>
                                        <option value="north central">North Central</option>
                                        <option value="uva">Uva</option>
                                        <option value="error">error</option>
                                    </select>
                                </div>
                            </div>
                            <div class="form-group row" style="padding: 4px; padding-left: 16px">
                                <label class="col-3 col-form-label" for="EmpForm01ContactDetails05">ZIP Code:</label>
                                <div class="col-4">
                                    <input type="text" class="form-control" id="EmpForm01ContactDetails05" name="empAddZip">
                                </div>
                            </div>
                            <div class="form-group row" style="padding: 4px; padding-left: 16px">
                                <label class="col-4 col-form-label" for="EmpForm01ContactDetails06">Home Contact No:</label>
                                <div class="col-8">
                                    <input type="text" class="form-control" id="EmpForm01ContactDetails06" name="empHomeContact">
                                </div>
                            </div>
                            <div class="form-group row" style="padding: 4px; padding-left: 16px">
                                <label class="col-4 col-form-label" for="EmpForm01ContactDetails07">Mobile:</label>
                                <div class="col-8">
                                    <input type="text" class="form-control" id="EmpForm01ContactDetails07" name="empMobileContact">
                                </div>
                            </div>
                            <div class="form-group row" style="padding: 4px; padding-left: 16px">
                                <label class="col-4 col-form-label" for="EmpForm01ContactDetails08">Personal Email:</label>
                                <div class="col-8">
                                	<input type="text" class="form-control" id="EmpForm01ContactDetails08" name="empPersonalEmail">
                                </div>
                            </div>
                        </div>
                    </div>

                    <div style="float: left;">
                        <div style="width: 550px; padding: 5px; border-width: 1px; border-style: solid; border-color: #FD4F00; margin-bottom: 5px;">
                            <h5>Identification</h5>
                            <div class="form-group row" style="padding: 4px; padding-left: 16px">
                                <label class="col-4 col-form-label" for="EmpForm01Identification01">NIC:</label>
                                <div class="col-8">
                                    <input type="text" class="form-control" id="EmpForm01Identification01" name="empNic">
                                </div>
                            </div>
                            <div class="form-group row" style="padding: 4px; padding-left: 16px">
                                <label class="col-4 col-form-label" for="EmpForm01Identification03">Nationality:</label>
                                <div class="col-8">
                                  <div class="col-8">
                                    <select class="custom-select mr-sm-2" id="EmpForm01Identification03" name="empNationality">
                                        <option value="" disabled selected hidden>Choose...</option>
                                        <option value="sinhalese">Sinhalese</option>
                                        <option value="tamil">Tamil</option>
                                        <option value="muslim">Muslim</option>
                                        <option value="error">error</option>
                                    </select>
                                </div>
                                </div>
                            </div>
                            <div class="form-group row" style="padding: 4px; padding-left: 16px">
                                <label class="col-4 col-form-label" for="EmpForm01Identification04">Date of Birth:</label>
                                <div class="col-8">
                                    <input type="date" class="form-control" id="EmpForm01Identification04" name="empDob">
                                </div>
                            </div>
<!--                             <div class="form-group row" style="padding: 4px; padding-left: 16px; margin: 2px; border-width: 1px; border-style: solid; border-color: #FD4F00">
                                <label class="col-4 col-form-label" for="EmpForm01Identification05">Employee ID:</label>
                                <div class="col-4">
                                <input type="text" class="form-control" id="EmpForm01Identification05" disabled>
                                </div>
                                <div class="col-4">
                                <button class="btn-secondary">Generate ID</button>
                                </div>
                                <div class="col">
                                    <label for="EmpForm01Identification05">Employee ID:</label>
                                </div>
                                <div class="col">
                                    <input type="text" class="form-control" id="EmpForm01Identification05" placeholder="XXXX0000" disabled>
                                </div>
                                <div class="col">
                                    <button class="btn-info">Generate ID</button>
                                </div>
                            </div> -->
                        </div>

                        <div style="width: 550px; padding: 5px; padding: 5px; border-width: 1px; border-style: solid; border-color: #FD4F00; clear: both; margin-bottom: 5px;">
                            <h5>Company Related</h5>
                            <div class="form-group row" style="padding: 4px; padding-left: 16px">
                                <label class="col-4 col-form-label" for="EmpForm01CompanyRelated01">Branch:</label>
                                <div class="col-8">
                                    <select class="custom-select mr-sm-2" id="EmpForm01CompanyRelated01" name="empBranch">
                                        <option value="" disabled selected hidden>Choose...</option>
                                        <option value="maharagama">Maharagama</option>
                                        <option value="malabe">Malabe</option>
                                        <option value="wellawatte">Wellawatte</option>
                                        <option value="kottawa">Kottawa</option>
                                        <option value="homagama">Homagama</option>
                                        <option value="nugegoda">Nugegoda</option>
                                        <option value="kaduwela">Kaduwela</option>
                                        <option value="kadawatha">Kadawatha</option>
                                    </select>
                                </div>
                            </div>
                            <div class="form-group row" style="padding: 4px; padding-left: 16px">
                                <label class="col-4 col-form-label" for="EmpForm01CompanyRelated02">Department:</label>
                                <div class="col-8">
                                    <select class="custom-select mr-sm-2" id="EmpForm01CompanyRelated02" name="empDepartment">
                                        <option value="" disabled selected hidden>Choose...</option>
                                        <option value="finance">Finance</option>
                                        <option value="cardCente">Card Center</option>
                                        <option value="it">IT</option>
                                        <option value="loan">Loan</option>
                                        <option value="lease">Lease</option>
                                    </select>
                                </div>
                            </div>
                            <div class="form-group row" style="padding: 4px; padding-left: 16px">
                                <label class="col-4 col-form-label" for="EmpForm01CompanyRelated03">Designation:</label>
                                <div class="col-8">
                                    <input type="text" class="form-control" id="EmpForm01CompanyRelated03" name="empDesignation">
                                </div>
                            </div>
                            <div class="form-group row" style="padding: 4px; padding-left: 16px">
                                <label class="col-4 col-form-label" for="EmpForm01CompanyRelated04">Role:</label>
                                <div class="col-8">
                                    <select class="custom-select mr-sm-2" id="EmpForm01CompanyRelated04" name="empRole">
                                        <option value="" disabled selected hidden>Choose...</option>
                                        <option value="nrmlIntern">Normal Employee (Intern)</option>
                                        <option value="nrmlJunior">Normal Employee (Junior)</option>
                                        <option value="nrmlSenior">Normal Employee (Senior)</option>
                                        <option value="admin">Administrator</option>
                                        <option value="branchHead">Branch Head</option>
                                        <option value="manager">Manager</option>
                                    </select>
                                </div>
                            </div>
                        </div>

                        <div style="width: 550px; padding: 5px; padding: 5px; clear: both">
                            <div class="form-group row" style="padding: 4px; padding-left: 16px">
                                <label class="col-4"></label>
                                <div class="col-8">
                                    <input type="submit" value="Submit" style="background-color: white; border-radius: 10px; color: black; border-color: #FD4F00; border-width: 2px; border-style: solid; font-size: 20px"/>
                                </div>
                            </div>
                        </div>

                    </div>
                        
                </form>
            </div>
        </div>













        <!-- Footer -->
        <footer class="page-footer font-small blue pt-4 footer-all">
            <div class="container-fluid text-center text-md-left">
                <div class="row">
                    <div class="col-6 mt-md-0 mt-3 footer-all-stuff footer-legal-form-stuff" title="Our Legal Form">
                        <h5 class="text-uppercase">Legal Form</h5>
                        <p style="text-align: justify">A Public Limited Liability Company incorporated in Sri Lanka on 10th March 1986 under the Companies Act No 17 of 1982 and listed in the Colombo Stock Exchange. A licensed Commercial Bank under the Banking Act No 30 of 1988. Re-registered on 28th April 2008 under the Companies Act No 7 of 2007.</p>
                    </div>

                    <hr class="clearfix w-100 d-md-none pb-3">

                    <div class="col mb-md-0 mb-3 footer-all-stuff footer-other-stuff" title="Know About the Company">
                        <h5 class="text-uppercase">Company</h5>

                        <ul class="list-unstyled">
                            <li>
                                <a href="#!" style="color:white">Home</a>
                            </li>
                            <li>
                                <a href="#!" style="color:white">About Us</a>
                            </li>
                            <li>
                                <a href="#!" style="color:white">Contact Us</a>
                            </li>
                            <li>
                                <a href="#!" style="color:white">Privacy Policy</a>
                            </li>
                        </ul>
                    </div>

                    <div class="col mb-md-0 mb-3 footer-all-stuff footer-other-stuff">
                        <h5 class="text-uppercase">Profile Related</h5>

                        <ul class="list-unstyled">
                            <li>
                                <a href="#!" style="color:white">View Profile</a>
                            </li>
                            <li>
                                <a href="#!" style="color:white">Update Profile</a>
                            </li>
                            <li>
                                <a href="#!" style="color:white">Update History</a>
                            </li>
                        </ul>

                    </div>

                    <div class="col mb-md-0 mb-3 footer-all-stuff footer-last-stuff" title="Act as a Customer">
                        <h5 class="text-uppercase">Customer Related</h5>

                        <ul class="list-unstyled">
                            <li>
                                <a href="#!" style="color:white">Transaction</a>
                            </li>
                            <li>
                                <a href="#!" style="color:white">Loan Calculator</a>
                            </li>
                            <li>
                                <a href="#!" style="color:white">Lease Calculator</a>
                            </li>
                            <li>
                                <a href="#!" style="color:white">Complaint</a>
                            </li>
                        </ul>

                    </div>
                </div>

                <!-- Copyright -->
                <div class="footer-copyright text-left py-1 footer_copyright" title="Disclaimer">© All Rights Reserved @2018 |
                    <a href="#" title="Owners/ Group"> ITP-2018-MLB-G3-10.</a> |
                    <a href="#" title="Privacy Policy"> Privacy Policy.</a>
                </div>
                <!-- Copyright -->
            </div>
            <!-- Footer Links -->

        </footer>
        <!-- Footer -->
        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="/SampathBankWebPortal/resources/css&js&jquery/jquery-3.3.1.slim.min.js"></script>
        <script src="/SampathBankWebPortal/resources/css&js&jquery/popper.min.js"></script>
        <script src="/SampathBankWebPortal/resources/css&js&jquery/bootstrap.min.js"></script>
        <script src="/SampathBankWebPortal/resources/css&js&jquery/customized.js"></script>
    </body>
</html>