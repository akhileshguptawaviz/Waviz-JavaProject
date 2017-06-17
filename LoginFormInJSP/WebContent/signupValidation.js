/**
 * LoginValidation
 */

function validateForm() {
	
    var a = document.forms["myForm"]["uname"].value;
    var b=document.forms["myForm"]["mail"].value;
    var d=document.forms["myForm"]["mob"].value;
    var e=document.forms["myForm"]["pass"].value;
    var f=document.forms["myForm"]["cpass"].value;
    var g=document.forms["myForm"]["hob"].value;
    var h=document.forms["myForm"]["gender"].value;
    if (a == ""||b==""||c==""||d==""||e==""||f==""||g==""||h=="") {
        alert("Please Fill Proper Field..");
        return false;
    }
}