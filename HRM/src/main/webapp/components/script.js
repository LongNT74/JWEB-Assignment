

function ValidateRegister(){
    var name = document.getElementById("name").value;
    var repass = document.getElementById("repass").value;
    var mail = document.getElementById("email").value;
    var pass = document.getElementById("pass").value;
    if(pass.length <= 30 && name.length <= 50 && repass.length <= 30
        && mail.length > 5 &&  pass.length > 8 && name.length > 3 && repass.length > 8 && pass == repass){
        alert("Login Success");
    }else{
        alert("Login fail please check email, password, remember button!!!");
    }

}

function ValidateEditPage(){
    var fname = document.getElementById("fname").value;
    var lname = document.getElementById("lname").value;
    var phone = document.getElementById("phone").value;
    var desc = document.getElementById("desc").value;

    if(fname.length > 3 && fname.length <= 30 
        && lname.length > 3 && lname.length <= 30
        && phone.length >9 && phone.length <= 13
        && desc.length <= 200){
            alert("Add Success");
        }else{
            alert("Login fail please check name, phone, description!!!");
        }
}

function clearFields(){
    document.getElementById('fname').value = '';
    document.getElementById("lname").value = '';
    document.getElementById("phone").value = '';
    document.getElementById("desc").value = '';
}

function ValidateAddPage(){
    var title = document.getElementById("title").value;
    var brief = document.getElementById("brief").value;
    var content = document.getElementById("content").value;

    if(title.length > 10 && title.length <= 200
        && brief.length > 30 && brief.length <= 150
        && content.length > 50 && content.length <= 1000){
            alert("Add Success");
        }else{
            alert("Login fail please check title, brief, content!!!");
        }
}

function clearAddFieds(){
    document.getElementById("title").value = '';
    document.getElementById("brief").value = '';
    document.getElementById("content").value = '';
}

function ValidateForm(){
	let a = document.forms["myForm"]["username"].value;
	if(x.length > 5){
		alert("Username must be less than 50 characters");
		return false;
	} else if(x == ""){
		alert("Name must be filled out");
    	return false;
	}
}

let dropdown = document.getElementsByClassName("dropdown-btn");
let i;

for (i = 0; i < dropdown.length; i++) {
  dropdown[i].addEventListener("click", function() {
    this.classList.toggle("active");
    let dropdownContent = this.nextElementSibling;
    if (dropdownContent.style.display === "block") {
      dropdownContent.style.display = "none";
    } else {
      dropdownContent.style.display = "block";
    }
  });
}

function reset(){
    document.getElementById("fname").value = '';
    document.getElementById("fname").value = '';
    document.getElementById("phone").value = '';
    document.getElementById("date").value = '';
    document.getElementById("account").value = '';
    document.getElementById("email").value = '';
    document.getElementById("password").value = '';
    document.getElementById("address").value = '';
     document.getElementById("remark").value = '';

}