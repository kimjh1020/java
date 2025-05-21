function setClock(){
    dateInfo = new Date();
    hour = dateInfo.getHours();
    min = dateInfo.getMinutes();
    sec = dateInfo.getSeconds();

    document.getElementById("time").innerHTML = hour + ":" + min + ":" + sec
}

window.onload = function(){
    setClock();
    setInterval(setClock,1000)
}