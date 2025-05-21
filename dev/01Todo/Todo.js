// 2025년 5월7일 자바서버프로그래밍 수업
// 자바스크립트, HTML 복습
// 할일 관리앱 만들어보기

function addItem(){
    console.log("additem실행됨")

    todo = document.getElementById('item')
    list = document.getElementById('todolist')

    listitem = document.createElement('li')
    listitem.className = 'list-group-item list-group-item-action list-group-item-warning'
    xbtn = document.createElement('button')
    xbtn.innerHTML = '&times'
    xbtn.className = 'close'

    xbtn.onclick = function(e){
        pnode = e.target.parentNode
        list.removeChild(pnode)
    }

    listitem.innerText = todo.value
    list.appendChild(listitem)
    listitem.appendChild(xbtn)

    todo.value= ''
    todo.focus()
}