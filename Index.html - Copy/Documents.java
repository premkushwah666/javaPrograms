//STUDENTS--------------------------------

Api = 1
 Method Type  = Post; 
Api Name = addStudents	;

 (Request) 
Body = { 
 name : jaya ;
 email : jaya14@gmail.com;
mobile no : 8817252870;
course_interested : JAVA;
address : Indore;
Quilification : BCA;
DOB : 14-02-2006;
enrollment date : 30-05:2023;
status : pending / confirm;
 (Response)
 
 {
    "msg": "success",
    "data": {
        "acknowledged": true,
        "insertedId": "_id"
    }
}




_id : ObjectId(665aeb42c1143ddd834c3eaa);
stud_id : 66598a6080b6d15aa4961173;
course_id : 66599c2b84f96fb8bcee9e04
pay_fees : 50000;
payfees_Date : 1-6-2024;
due_fees : 30000;







Api = 1
 Method Type  = Post; 
Api Name = addStudents	;

 (Request) 
Body = { 
 name : prem ;
 email : prem18@gmail.com;
mobile no : 9516560134;
course_interested : JAVA;
address : Indore;
Quilification : btech;
DOB : 18-12-2003;
enrollment date : 1-06:2023;
status : pending / confirm;
 (Response)
 
 {
    "msg": "success",
    "data": {
        "acknowledged": true,
        "insertedId": "_id"
    }
}


Api = 1
 Method Type  = Post; 
Api Name = addStudents	;

 (Request) 
Body = { 
 name : atul ;
 email : atul10@gmail.com;
mobile no : 8103706629;
course_interested : JAVA;
address : Indore;
Quilification : BA;
DOB : 10-10-2004;
enrollment date : 2-06:2023;
status : pending / confirm;
 (Response)
 
 {
    "msg": "success",
    "data": {
        "acknowledged": true,
        "insertedId": "_id"
    }
}


Api = 1
Method Type  = Post; 
Api Name = addStudents	;

 (Request) 
Body = { 
 name : ranju ;
 email : ranju25@gmail.com;
mobile no : 6264787898;
course_interested : JAVA;
address : Indore;
Quilification : BBA;
DOB : 25-05-2006;
enrollment date : 3-06:2023;
status : pending / confirm;
 (Response)
 
 {
    "msg": "success",
    "data": {
        "acknowledged": true,
        "insertedId": "_id"
    }
}

---------------------------------------------------------------------------------------------------------------------

Api = 2
Method Type  = Get; 
Api Name = getAllStudent;

(Response)
{
    "msg": "success",
    "data": [
        {
            "_id": "66598a6080b6d15aa4961173",
            "name": "jaya",
            "email": "jaya14gmail.com",
            "phone": "8817252870",
            "course_interested": "JAVA",
            "address": "Indore",
            "Quilification": "BCA",
            "DOB": "14-02-2006",
            "enrollment date": "30-05-2023",
            "status": "pending / confirm"
        },
    ]
}

----------------------------------------------------------------------------------------------------------------

Api = 3
Method Type = patch;
Api Name = updateStudent;

(Response)
{
    "msg": "success",
    "data": {
        "acknowledged": true,
        "modifiedCount": 1,
        "upsertedId": null,
        "upsertedCount": 0,
        "matchedCount": 1
    }
}

------------------------------------------------------------------------------------------------------------

Api = 4
Method Type = Delete;
Api Name = deleteStudent;

(Response)
{
    "msg": "success",
    "data": {
        "acknowledged": true,
        "modifiedCount": 1,
        "upsertedId": null,
        "upsertedCount": 0,
        "matchedCount": 1
    }
}

*****************************************************************************************************************


//FEES---------------------



Api = 5
 Method Type  = Post; 
Api Name = addStudents	;

 (Request) 
Body = { 
 name : jaya ;
 email : jaya14@gmail.com;
mobile no : 8817252870;
course_interested : JAVA;
address : Indore;
Quilification : BCA;
DOB : 14-02-2006;
enrollment date : 30-05:2023;
status : pending / confirm;

 (Response) 
 {
    "msg": "success",
    "data": {
        "acknowledged": true,
        "insertedId": "_id"
    }
}





{
    "msg": "success",
    "data": [
        {
            "_id": "665aebbbc1143ddd834c3ead",
            "stud_id": "66598b4780b6d15aa4961176",
            "course_id": "66599e8584f96fb8bcee9e07",
            "pay_fees": 300000,
            "payfees_Date": "1-6-2024",
            "due_fees": 200000
        },
    ]
}




_id : ObjectId(66599c2b84f96fb8bcee9e04);
stud_id : "66598a6080b6d15aa4961173";
course : "JAVA";
duration : "14 month";
fees : "80000";


