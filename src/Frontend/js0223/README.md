# JavaScript

- 자바스크립트는 변수에 데이터 값, 함수, 클래스가 = 로 대입된다.
- 따라서 여러개의 값이 저장되어 일 수도 있다, 그냥 자바에서 변수 이름으로 보던 개념을 버리고
- 모든 것을 담는 통이라 생각해야한다. 

- 문서 객체: HTML 태그를 자바스크립트에서 사용할 수 있는 객체로 만든 것


## window.onload = function ()

- on(이벤트 프로퍼티) load(이벤트 이름,타입)  function (이벤트 핸들러,리스너)
- 이벤트 모델 : 문서 객체에 이벤트를 연결하는 방식


### let headers = document.querySelectorAll("h1");
- h1 태그지정

###   document.body.innerHTML = output;
```
window.onload = function () {
        // 변수를 선언합니다.
        let output = "";
        for (let i = 0; i < 10; i++) {
          output += "<h1>Header - " + i + "</h1>";
        }
        // 문서 객체 내부의 글자를 변경합니다.
        // document.body.textContent = output;
        // innerHTML 속성을 사용합니다.
        document.body.innerHTML = output;
      };
```
- body 안에 넣기

### div.style.height = "2px";
```
document.body.innerHTML = output;
        // 문서 객체를 선택합니다.
        let divs = document.querySelectorAll("div");
        for (let i = 0; i < divs.length; i++) {
          // 변수를 선언합니다.
          let div = divs[i];
          // 스타일을 적용합니다.
          div.style.height = "2px";
          div.style.background = "rgb(" + i + "," + i + "," + i + ")";
        }
```
- 스타일 넣기


###  let image = document.getElementById("image");
```
 // 변수를 선언합니다.
        let image = document.getElementById("image");
        // 속성을 변경합니다.
        image.src = "http://via.placeholder.com/300x200";
        image.width = 300;
        image.height = 200;

        let clock = document.getElementById("clock");
        // 1초마다 함수를 실행합니다.
        setInterval(function () {
          let now = new Date();
          clock.innerHTML = now.toString();
        }, 1000);
```
- id 속성에 스타일 넣기


<br>
<br>

```
<button id="button">버튼</button>
  <script>
    document.getElementById("button").onclick = function() {
      this.textContent = this.textContent +'*';
    };
  </script>
  ```

- 버튼 text를 이렇게 추가 진행가능


# jQuery
`<script src="https://code.jquery.com/jquery-3.7.1.js"></script>`

- 이거 있어야 사용가능

### 속성 추출
- let src = $('img').attr('src');

```
① // 속성 값을 입력해 속성 지정

$('img').attr('src', 'http://via.placeholder.com/300x200');

② // 객체를 입력해 속성 지정

$('img').attr({
src: 'http://via.placeholder.com/300x200',
width: 300,
height: 200
});

③ // 함수를 이용해 속성 지정

$('img').attr('src', function (index) {
// 변수를 선언합니다.
var size = (index + 1) * 100;
// 반환합니다.
return 'http://via.placeholder.com/' + size + 'x100';
});
```


### $(selector).method(function (event) { });
- 이벤트 등록


