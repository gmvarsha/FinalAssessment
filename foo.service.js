

var employees=require('./employee.json')

module.exports.getEmployees=async(req,res,next)=>{
    console.log("testing..");
    res.send(employees);
};


module.exports.getEmployeeById=async(req,res,next)=>{
    var id=req.params.id;
    var e=employees.find(x=>x.id==id);
    res.send(e);
}

