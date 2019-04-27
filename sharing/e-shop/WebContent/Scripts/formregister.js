function validate(frm){
     var USER_ID=frm.USER_ID.value;
     var PASSWORD=frm.PASSWORD.value;
     var REPEAT_PASSWORD=frm.REPEAT_PASSWORD.value;
     var FIRST_NAME=frm.FIRST_NAME.value;
     var LAST_NAME=frm.LAST_NAME.value;
     var AGE=frm.AGE.value;
     var CONTACT_NUMBER=frm.CONTACT_NUMBER.value;
     
     if ( FIRST_NAME== "" || FIRST_NAME == null) {
         window.alert("Please update the mandatory field(s)");
         frm.FIRST_NAME.focus();
         return false;
     }

     if (!FIRST_NAME.match("^([a-zA-Z]+)$")) {
           alert("Invalid First Name");
           frm.FIRST_NAME.focus();
           return false;
     }
     
     if (LAST_NAME == "" || LAST_NAME == null) {
         window.alert("Please update the mandatory field(s)");
         frm.LAST_NAME.focus();
         return false;
     }

     if (!LAST_NAME.match("^([a-zA-Z]+)$")) {
           window.alert("Invalid Last Name");
           frm.LAST_NAME.focus();
           return false;
     }
     
     if (AGE=="" || AGE==null) {
         window.alert("Please update the mandatory field(s)");
         frm.AGE.focus();
         return false;
     }


     if(AGE<18 || AGE>120 ||!AGE.match("^([0-9]+)$"))
     {
          
     window.alert("Invalid Age");
     frm.AGE.focus();
     return false;
     }

     if (!(frm.GENDER[0].checked) && !(frm.GENDER[1].checked)) {
         window.alert("Please Select Gender");
         frm.GENDER[0].focus();
         return false;
    }
     
     if (CONTACT_NUMBER=="" || CONTACT_NUMBER==null ) {
         window.alert("Please update the mandatory field(s)");
         frm.CONTACT_NUMBER.focus();
         return false;
     }


     if(CONTACT_NUMBER.length<10 || CONTACT_NUMBER.length>10 ||!CONTACT_NUMBER.match("[6-9]{1}[0-9]{9}"))
     {
     window.alert("Invalid Contact");
     frm.CONTACT_NUMBER.focus();
     return false;
     } 
     
     
     
   
     if (USER_ID=="" || USER_ID==null) {
         window.alert("Please update the mandatory field(s)");
         frm.USER_ID.focus();
         return false;
     }
     
     if (USER_ID.match("^([a-zA-Z]+)$")) {
         window.alert("Please update the mandatory field(s)");
         frm.USER_ID.focus();
         return false;
     }
     
     if ( PASSWORD== "" || PASSWORD == null) {
         window.alert("Please update the mandatory field(s)");
         frm.PASSWORD.focus();
         return false;
     }

     if (!PASSWORD.match("^(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{6,16}$") || PASSWORD.length<8) {
         window.alert("Password Should Contain Atleast one number, one lowercase, one Uppercase letter,one Special Character and at least eight characters");
         frm.PASSWORD.focus();
         return false;
     }
     

     

    
     
     if ( REPEAT_PASSWORD== "" || REPEAT_PASSWORD == null) {
         window.alert("Please update the mandatory field(s)");
         frm.REPEAT_PASSWORD.focus();
         return false;
     }

     if (!REPEAT_PASSWORD.match("^(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{6,16}$") || REPEAT_PASSWORD.length<8) {
         window.alert("Password Should Contain Atleast one number, one lowercase, one Uppercase letter,one Special Character and at least eight characters");
         frm.REPEAT_PASSWORD.focus();
         return false;
     }
     if (PASSWORD != REPEAT_PASSWORD) {
         window.alert("Password and Repeat Password is not Same");
         rpwd.focus();
         return false;
     }

     return true;
     }    
