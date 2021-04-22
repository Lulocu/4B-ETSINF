window.addEventListener("load", hackForm);
window.addEventListener("load", boton);

function hackForm() {
    console.log('Pruebas');
    muestraTabla();

    let elementos = document.getElementsByTagName("input");
    let ocultos = [];
    for (let i = 0; i < elementos.length; i++){
        if (elementos[i].getAttribute('type') == 'password' ||
            elementos[i].getAttribute('type') == 'hidden') {

            elementos[i].setAttribute('type','text');
        }
        elementos[i].removeAttribute('minLength');
        elementos[i].removeAttribute('maxLength');
        elementos[i].removeAttribute('readonly');
        elementos[i].removeAttribute('required');
        elementos[i].removeAttribute('min');
        elementos[i].removeAttribute('max');
    }
    muestraTabla();
}
function muestraTabla() {
    let cuerpo = document.getElementsByTagName('body')[0];
    let tabla = document.createElement("table");
    let listaAtr = ['name','type','value','minLength','maxLength','min','max','readonly','required']
    tabla.setAttribute("border",'2');
    let fila = tabla.insertRow(0);
    for (let i = 0; i < 9; i++){
        let celda = fila.insertCell(i);
        celda.innerText = listaAtr[i];
    }
    let elementos = document.getElementsByTagName("input");
    for (let i = 0; i < elementos.length;i++){
        let campo = elementos.item(i);
        fila  = tabla.insertRow(1);
        for (let j= 0; j < listaAtr.length; j++) {
            celda = fila.insertCell(j)
            if(campo.hasAttribute(listaAtr[j])) {
                let atr = campo.getAttribute(listaAtr[j]);
                if (atr == '') {celda.innerText = 'True'}
                else { celda.innerText = atr }
            } else { celda.innerText = 'unset'; }
        }
    }
    cuerpo.append(tabla);
}
function boton() {

    let button = document.createElement("Boton");
    button.innerHTML = "Pulsame";

    let body = document.getElementsByTagName("body")[0];
    body.appendChild(button);

    button.addEventListener ("click", function() {
        actualizarTabla();

    });
}
function actualizarTabla() {

    let tabla = document.getElementsByTagName("table")[2];
    let elementos = document.getElementsByTagName("input");

    for (let i = 0; i < tabla.rows.length - 1; i++) {
        tabla.rows[i +1].cells[2].innerText = elementos[i].value;
        if (tabla.rows[i +1].cells[2].innerText == '') {tabla.rows[i +1].cells[2].innerText = 'unset'}
    }

}