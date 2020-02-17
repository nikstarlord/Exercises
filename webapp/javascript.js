function fun1(event){
	event.preventDefault();
	var a=document.getElementById("amount").value;
	var r=document.getElementById("rate").value;
	var t=document.getElementById("time").value;
	document.getElementById("si").value=(a*r*t)/100;;

	
}
