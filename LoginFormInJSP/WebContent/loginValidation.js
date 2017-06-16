/**
 * LoginValidation
 */

function validateForm() {
    var x = document.forms["myForm"]["uname"].value;
    var y=document.forms["myForm"]["mail"].value;
    var z=document.forms["myForm"]["pass"].value;
    if (x == ""||y==""||z=="") {
        alert("Please Fill Proper Field..");
        return false;
    }
}