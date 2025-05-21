// 2025년 5월 13일

// 자바서버 프로그래밍 수업, 프론트엔드 복습중
// 날씨정보 사이트 제작

temp  = document.getElementById('temp');
min = document.getElementById('min');
max = document.getElementById('max');
wind = document.getElementById('wind');
weather = document.getElementById('weather');
city = "seoul"
metric = "metric"
temp.innerText = 513 + "°C"
min.innerText = 100
max.innerText = 1000
wind.innerText = 999
weather.innerText = "매우맑음"

$.ajax({
    type:"GET",
    url: 'https://api.openweathermap.org/data/2.5/weather?'+
    "q="+city + "&units=" +metric + "&appid=7d96bc5108f52b80e2d9075a369b9f35",
}).done(function(response){
   alert("성공")
   console.log(response)
   console.log(response.base)
   console.log(response.main.temp)
   temp.innerText = response.main.temp + "°C"
   min.innerText = response.main.temp_min
   max.innerText = response.main.temp_max
   wind.innerText = response.wind.speed
   weather.innerText = response.weather[0].description
}).fail(function(error){
    alert("!/js/user.js에서 에러발생: " + error.statusText);
    console.log(error)

})

