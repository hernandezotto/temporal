!function(){
    var formulario=document.formularioRegistros
function des(){
  var sel=formulario.getElementById("select");
    if( sel.value=="fecha"){
        divFecha= formulario.getElementsByClassName("fecha");

    divFecha.style.display = 'block';        
        divHora= formulario.getElementsByClassName("hora");
        divHora.style.display = "none";
    }else if(sel.value= "hora"){
        divFecha= formulario.getElementsByClassName("fecha");
        divFecha.style.display = "none";        
        divHora= formulario.getElementsByClassName("hora");
        divHora.style.display = "block";
    }
}
}