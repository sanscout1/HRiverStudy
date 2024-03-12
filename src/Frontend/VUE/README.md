# Vue.js

`https://joshua1988.github.io/vue-camp/textbook.html`

## vue router 설정
사용자가 접속한 주소에 따라 페이지(컴포넌트)가 달라지는 것을 라우팅

- 라우팅이 무엇이고, Vue 에서 라우팅 처리를 위해 사용하는 플러그인
- Vue CLi prefetch 기능을 정확히 이해하고, 컴포넌트 로딩 시점을 설계하는 방법을 익힙니다.


## Vue 특징
- npm add router
- 프로젝트 내부에서 미리 url 주소를 정의하고, 각 주소마다 vue 페이지를 연결해 놓는다.
  사용자가 메뉴를 클릭하거나, 브라우저 주소를 직접 갱신했을 때
  미리 정의된 url 주소로 해당하는 컴포넌트 페이지로 바꾸는 것을 vue routing

// vue ui 라고 터미널에 치면 vue 프로젝트관리 용이
```agsl
// /* eslint-disable */
```

- 이거 작성하면 그 파일 오류 없어짐


## index.ts 의 router 경로 설정 하여 view 화면을 라우팅 설정할 수 있다.

// npm run serve -- --port 3000  
포트번호 지정해서 열수있음


public 패키지 :  정적리소스들을 배치

src/assets : 이미지 폰트 css 등을 관리하는 디렉토리
src/components : 컴포넌트 (페이지) 넣는 곳

app.vue : 최상위 뷰
main.js : 엔드포인트, 가장먼저 실행되는 자바스크립트 파일
babel.config.js : 설정파일
jsconfig.json : 종속성 파일 (외부 라이브러리) 연결
package.json : nodejs 파일 설정들

//////
package.json
private : --> npm 서버 등록관련 세팅


//
//
클래스 바인딩 처리 방법
인라인 스타일 바인딩
리스트 랜더링 (v-for)
랜더링 문법 : v-if, v-show, v-on
computed, watch







