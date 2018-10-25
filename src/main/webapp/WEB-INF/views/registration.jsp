<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
*, *::before, *::after {
	box-sizing: border-box;
}

body {
	margin: 0;
	padding: 0;
	background: #fffffa;
}

.container {
	display: flex;
	justify-content: center;
	align-items: center;
	width: 100vw;
	height: 100vh;
}

form {
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
	width: 22rem;
	height: 26rem;
	color: #093824;
	background: #FEFFFE;
	box-shadow: 0px 0px 20px #eee;
}

form>h3 {
	font-size: 2rem;
	margin-bottom: 0.8rem;
	margin-top: 0;
}

.form-field-span>button {
	width: 14rem;
	height: 2.8rem;
	font-size: 1.2rem;
	border: none;
	color: #fcfcfc;
	background: #093824;
}

.form-field-span>button:hover {
	color: #093824;
	background: #fcfcfc;
	border: 2px solid #093824;
}

input {
	width: 14rem;
	height: 2.2rem;
	padding-left: 0.4rem;
	font-size: 1rem;
	border: 1px solid #093824;
	background: transparent;
}

input:focus {
	outline: none;
	box-shadow: inset 0 0 2px #27FB6B, inset 0 0 2px #27FB6B;
	border: none;
}

.form-field-span {
	position: relative;
	margin: 0.8rem 0;
}

.form-label {
	position: absolute;
	top: 20%;
	left: 2.5%;
	font-size: 1.1rem;
	transition: all 0.3s ease;
}

.transition-label {
	top: -1.2rem;
	left: 0;
	font-size: 0.8rem;
}
</style>

<script type="text/javascript">
const signupForm = document.getElementById('signup-form');
const formInputs = document.querySelectorAll('.form-input');
const submitBtn = document.getElementById('form-submit-btn');

for(input of formInputs) {
  input.addEventListener('focus', e => {
    e.target.previousElementSibling.classList.add('transition-label')
  })
  input.addEventListener('blur', e => {
    if(!e.target.value) {
      e.target.previousElementSibling.classList.remove('transition-label') 
    }
  })
}

submitBtn.addEventListener('mouseup', e => {
  e.preventDefault;
  e.stopPropagation();
  console.log("preventing submit default")
})

const postCreateUser = (userInput) => {
  console.log("POST")
  // fetch('https://localhost:8080/registerUser.do', {
  //   method: 'post',
  //   body: JSON.stringify(userInput)
  // }).then(function(response) {
  //   return response.json();
  // }).then(function(data) {
  //   console.log('Created User:', data);
  // });
}

const checkInputs = () => {
  submitBtn.disabled = true;
  const formChildren = signupForm.children;
  const values = {};
  for(child of formChildren) {
    if (child.localName !== "h3" && child.children[1]) {
      const value = child.children[1].value
      switch(child.children[1].id) {
        case "first-name":
          values.firstName = value;
          break;
        case "last-name":
          values.lastName = value;
          break;
        case "username":
          values.username = value;
          break;
        case "password":
          values.password = value;
          break;
      }
    }
  }
  const isValid = checkFormValues(values);
  if(isValid) {
    signupForm.submit();
  } else {
    notifyUserInvalidValues();
  }
  return false;
}

const checkFormValues = (values) => {
  let valid;
  console.log("Checking form values")
  for(key in values) {
    const value = values[key]
    switch(key) {
      case 'first-name':
        valid = checkFirstLastName(value)
        break;
      case 'last-name':
        valid = checkFirstLastName(value)
        break;
      case 'username':
        valid = checkUsername(value)
        break;
      case 'password':
        valid = checkPassword(value)
        break;
    }
  }
  if(!valid) {
    console.log("valid is false.")
    return false
  } else {
    console.log("valid is true.")
    return true
  }
}

const checkFirstLastName = (value) => {
  if(!value || value.length < 6) {
    console.log("value is empty")
    return false;
  }
  return true;
}

const checkUsername = (value) => {
  if(!value || value.length < 3) {
    return false;
  }
  return true;
}

const checkPassword = (value) => {
  if(!value || value.length < 8) {
    return false;
  }
  return true;
}

const notifyUserInvalidValues = () => {
  submitBtn.disabled = false;
}
</script>

</head>
<body>

	<div class="container">
		<form id="signup-form" onSubmit="return checkInputs()"
			action="registerUser" method="post">
			<h3>Sign Up</h3>
			<span class="form-field-span"> <label id="first-name-label"
				class="form-label" for="first-name">First Name</label> <input
				id="first-name" class="form-input" type="text" name="firstName" />
			</span> <span class="form-field-span"> <label id="last-name-label"
				class="form-label" for="last-name">Last Name</label> <input
				id="last-name" class="form-input" type="text" name="lastName" />
			</span> <span class="form-field-span"> <label id="username-label"
				class="form-label" for="username">Username</label> <input
				id="username" class="form-input" type="text" name="username" />
			</span> <span class="form-field-span"> <label id="password-label"
				class="form-label" for="password">Password</label> <input
				id="password" class="form-input" type="password" name="password" />
			</span> <span class="form-field-span">
				<button id="form-submit-btn" type="submit">Create User</button>
			</span>
		</form>
	</div>


</body>
</html>