<%@include file="Header.jsp" %>
<body style="background:url('resources/images/s5.jpg')">

<div class="container">
<centre><h1>LOGIN</h1></centre>
  <form action="${e }perform_login" method="post">
    <div class="form-group">
      <label for="email">Email:</label>
      <input  class="form-control" id="email" placeholder="Enter username" name="username">
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" name="password" class="form-control" id="pwd" placeholder="Enter password">
    </div>
    <div class="checkbox">
      <label><input type="checkbox"> Remember me</label>
    </div>
    <button type="submit" class="btn btn-default">Submit</button>
  </form>
</div>

</body> 
<%@include file="footer.jsp" %>