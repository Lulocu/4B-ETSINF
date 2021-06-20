window.addEventListener("load", extraeContenido);

function extraeContenido() {
    let conth1 = 1;
    let conth2 =1
    //En nav irá la tabla de contenidos
    //let nav = document.getElementById('toc')
    let nav = document.querySelector('nav,toc')
    console.log('LLegado')
    let nodo = document.getElementsByTagName('article')
    let ul= nodo[0].querySelectorAll('h1,h2')

    for (let i = 0; i < ul.length; i++) {
        let accesos = document.createElement('aux');
        if (ul[i].tagName === 'H1') {
            ul[i].setAttribute('id','h1_' + String(conth1))
            accesos.innerHTML = '<li><a href="#h1_' + String(conth1) + '">' + ul[i].innerText + '</a></li>'
            conth1++;
        } else if (ul[i].tagName === 'H2') {
            ul[i].setAttribute('id','h2_' + String(conth2))
            accesos.innerHTML = '<li><a href="#h2_' + String(conth2) + '">' + ul[i].innerText + '</a></li>'
            conth2++;
        }
        nav.append(accesos)
    }
}
