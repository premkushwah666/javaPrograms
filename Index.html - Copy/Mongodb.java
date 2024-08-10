{"name":"Jaya"
"email":"jaya@gmail.com",
"password":"123"},

{"name":"Atul"
"email":"Atul@gmail.com",
"password":"1234"},

{"name":"Ranju"
"email":"Ranju@gmail.com",
"password":"123"},

{"name":"Ankita"
"email":"Ankita@gmail.com",
"password":"123"}



db.fees.find({
	$and:[
	{fees:{$lt:4000}},
	{id:"6645b2a730f347c3e2b9862a"}]
})


db.fees.find({
	$and:[
	{fees:{$gte:5000}},
	{id:"6645b3b6aac020e274307ed0"}]
})


-----------------------------------------------------------------------------------------------------------------

1.  db.fees.find({"fees":{$lt:"5000"}})


2.  db.fees.find({"fees":{$gte:6000}})


3.  db.fees.find({"fees":{$lte:"5000"}})

4.  db.fees.find({"fees":{$gte:"5000"}})


5.  db.fees.find({
    $and:[{fees:{$gte:5000}},
     {id:"6646fc623fda4c569ad8c214"}
     ]
 })


---------------------------------------------------------------------------------------------------------------


db.course.aggregate(
	[
       {     
        $lookup:{
        	from:other_tale_name,
        	localField:current_table_field,
        	foreignField:other_tale_field_name,
        	as:new_field_name
        }
     }
   ]
)


db.fees.aggregate([{
	$lookup:{
		from:"student",
		localField:"id",
		foreignField:"_id",
		as:"Jaya"
	}
}])


_________________________________________________________________________________________

1.   db.students.aggregate([
{$project:{"_id":{"$toString":"$_id"},name:1}},
{
	$lookup:{
		from:"fees",
		localField:"_id",
		foreignField:"stud_id",
		as:"allFees"
	}
   }
])



2.   db.students.aggregate([
{$project:{"_id":{"$toString":"$_id"},name:1}},
{
	$lookup:{
		from:"fees",
		localField:"_id",
		foreignField:"stud_id",
		as:"allFees"
	}
   },
  {$unwind:"$allFees"}
])


3.  db.students.aggregate([
{$project:{"_id":{"$toString":"$_id"},name:1}},
{
	$lookup:{
		from:"fees",
		localField:"_id",
		foreignField:"stud_id",
		as:"allFees"
	}
   },
  {$unwind:"$allFees"},
  {$group:{"_id":"$name",totalPayed:{$sum:"$allFees.pay_fees"}}},
])


4.  db.students.aggregate([
{$project:{"_id":{"$toString":"$_id"},name:1}},
{
	$lookup:{
		from:"fees",
		localField:"_id",
		foreignField:"stud_id",
		as:"allFees"
	}
   },
  {$unwind:"$allFees"},
  {$group:{"_id":"$name",totalPayed:{$sum:"$allFees.pay_fees"}}},
  {$project:{reaminFees:{$subtract:[100000,"$totalPayed"]}}}
])

