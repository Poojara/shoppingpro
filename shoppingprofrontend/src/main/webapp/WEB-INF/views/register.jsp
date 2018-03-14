<%@include file="Header.jsp" %>
<body style="background:url('resources/images/register1.jpg')">
<div class="container">
<center><h2>Registration</h2></center>
<form class="form-horizontal" action="adduser" method="post">
  <div class="form-group">
    <label class="control-label col-sm-2" for="name">Name : </label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="name" id="name" placeholder="Enter Name"  required="">
    </div>
  </div>
  <div class="form-group">
    <label class="control-label col-sm-2" for="username">UserName : </label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="username" id="username" placeholder="Enter UserName"  required="">
    </div>
  </div>
  <div class="form-group">
    <label class="control-label col-sm-2" for="name">Password : </label>
    <div class="col-sm-10">
      <input type="password" class="form-control" name="password"  id="password" placeholder="Enter Password" pattern=".{8,}">
    </div>
  </div>
  <div class="form-group">
    <label class="control-label col-sm-2" for="email">Email : </label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="email" name="email"  placeholder="Enter Email"  required="">
    </div>
  </div>
  <div class="form-group">
    <label class="control-label col-sm-2" for="mobile">Mobile : </label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="mobile" id="mobile" placeholder="Enter Mobile" pattern="[6-9]{1}[0-9]{9}" title="please enter a valid number">
    </div>
  </div>
  <div class="form-group">
    <label class="control-label col-sm-2" for="address">Address : </label>
    <div class="col-sm-10">
      <textarea class="form-control" id="address" name="address"  placeholder="Enter Address"  required=""></textarea>
    </div>
  </div>
  <div class="form-group"> 
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-default">Submit</button>
    </div>
  </div>
</form>

</div><%@include file="footer.jsp" %>
