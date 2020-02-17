function fun1(){
var s=document.getElementById("txt").value;
var i=0;
var c=0;
var j=s.length-1;
while(i<=j){
	if(s[i]!=s[j]){
		c=1;
		break;
	}
	i++;
	j--;	
}
if(c!=0){
	alert("String is not palindrome");
}
else{
alert("string is palindrome");
}
}
