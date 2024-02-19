// 객체 정의
var obj = {};

// num 속성을 추가하고 숫자 10을 할당
obj.num = 10;
console.log(obj);

// 객체 정의
var obj = {};

// num 속성을 추가하고 숫자 20을 할당
obj['num'] = 20;
console.log(obj);

// {num : 10 } , {num : 20} 두달 동일하게 키 , 값 저장되어있음



// map 선언
const map = new Map();

// map 값 추가 #1
map.set('key1', 'value1');
map.set('key2', 'value2');

// map 값 추가 #2
map
  .set('key1', 'value1')
  .set('key2', 'value2');

console.log(map); // Map(2) { 'key' => 'value', 'key2' => 'value' }


// map 선언
const map1 = new Map([['key1', 'value1'], ['key1', 'value2']]);
console.log(map1); // Map(1) { 'key1' => 'value2' }
// 중복된 키가 있을 때는 Map객체에 새로운 키로 저장되지 않고, 값을 덮어씁니다.


// map 선언
const map2 = new Map([['key1', 'value1'], ['key2', 'value2']]);

// map 값 삭제
map2.delete('key1')
console.log(map2); // Map(1) { 'key2' => 'value2' }

// map 모든 값 삭제
// map2.clear();
// console.log(map2); //Map(0) {}









// map 선언
const map3 = new Map([['key1', 'value1'], ['key2', 'value2']]);

map3.forEach((val, key) => {
  console.log(val + "," + key);
});

// 결과입니다
// value1,key1
// value2,key2


// key값 가져오기
for (let key of map3.keys()){
    console.log("key : " + key);
}
// 결과입니다
// key : key1
// key : key2


// value 값 가져오기
for (const value of map3.values()) {
    console.log("value : " + value);
}
// 결과입니다
// value : value1
// value : value2


// entries 반복문
for (let[key, value] of map3.entries()) {
    console.log(key + " : " +value);
}
// 결과입니다
// key1 : value1
// key2 : value2






// set 선언
const set = new Set();

// set 값 추가 #1
set.add('javascript');
set.add('vue');
set.add('node');

// set 값 추가 #2
set.add('javascript').add('vue').add('node');

console.log(set); // Set(3) { 'javascript', 'vue', 'node' }

// Set은 중복된 값의 추가를 허용하지 않습니다.


// set 선언
const set1 = new Set(['apple', 'banana', 'orange']);

// set 값 삭제
set1.delete('banana')
console.log(set1); // Set(2) { 'apple', 'orange' }

// set 전체 값 삭제
set1.clear();
console.log(set1); // Set(0) {}





// set 선언
const set2 = new Set(['apple', 'banana', 'orange']);

// set 값 순회
set2.forEach((val, val2, set2) => {
 console.log(val, val2, set2);
});
// 결과입니다.
// apple apple Set(3) { 'apple', 'banana', 'orange' }
// banana banana Set(3) { 'apple', 'banana', 'orange' }
// orange orange Set(3) { 'apple', 'banana', 'orange' }

for (const val of set2) {
 console.log(val);
}
// 결과입니다.
// apple
// banana
// orange


// key 값 가져오기
for (const key of set2.keys()) {
   console.log(key);
}
// 결과입니다
// apple
// banana
// orange


// value 값 가져오기 , set 에서 values() 는 keys()와 같습니다.
for (const value of set2.values()) {
   console.log(value);
}
// 결과입니다
// apple
// banana
// orange


// 추가된 순서대로 반환됩니다.
for (const [key, value] of set2.entries()) {
   console.log("key" + " = " + key);
   console.log("value" + " = " + value);
}
// 결과입니다
// key = apple
// value = apple
// key = banana
// value = banana
// key = orange
// value = orange



// set.has(value): value가 존재하면 true, 존재하지 않으면 false를 반환합니다.
// set.size: Set 객체가 가진 원소의 수를 나타냅니다.







// 인덱스를 직접 접근해서 사용하는 경우
var arr = [];
arr[0] = 100;
arr[1] = 20;
arr[0] = 10;
console.log(arr); // [10, 20]



// 자바스크립트 내장 API를 사용하는 경우
var arr = [];
arr.push(100); // [100]
arr.push(20); // [100, 20]
arr.splice(0, 1, 10); // [10, 20]  // splice(): 배열의 특정 인덱스에 있는 값을 변경 또는 삭제 (배열의 내용이 변경됨)
// 배열에서 제거할 요소의 수입니다. deleteCount를 생략하거나 값이 array.length - start보다 크면 start부터의 모든 요소를 제거합니다. deleteCount가 0 이하라면 어떤 요소도 제거하지 않습니다. 이 때는 최소한 하나의 새로운 요소를 지정해야 합니다.
console.log(arr); // [10, 20]


// pop() (opens new window): 배열의 마지막 인덱스의 값을 꺼냄 (배열의 내용이 변경됨)
arr.pop();
console.log(arr);
arr.push(20);
// shift() (opens new window): 배열의 첫번째 인덱스의 값을 꺼냄 (배열의 내용이 변경됨)
arr.shift();
console.log(arr);


var arr = [10, 20, 30];
arr.forEach(function(value, index) {  // function이 
  console.log('array index: ' + index + ' value : ' + value);
});

// forEach()에 전달되는 함수는 배열의 각 요소에 대해 호출되며, 
// 이때 현재 요소의 값(value)과 인덱스(index), 그리고 배열 자체(array)를 인자로 받을 수 있습니다.
// array index: 0 value : 10
// array index: 1 value : 20
// array index: 2 value : 30







var arr = [10, 20, 30];
var obj = {
  num: 10,
  str: 'hi',
  arr: [],
};
// 배열의 인덱스를 1개씩 접근하여 순차적으로 순회하는 경우
for (var key in arr) {
  console.log(arr[key]);
}

// 객체의 키를 1개씩 접근하여 순차적으로 순회하는 경우
for (var key in obj) {
  console.log(obj[key]);
}

// // 배열 반복문의 콘솔
// 10
// 20
// 30

// // 객체 반복문의 콘솔
// 10
// hi
// []





// var obj = {
//   num: 10,
//   str: 'hi',
//   arr: [],
// }

// // for (var prop of obj) {    오류 발생하는 문법임
// //   console.log(prop, obj[prop]); 
// // }




var arr = [10,20,30]
// 배열을 각각 순회하는 경우
for (var num of arr) {
  console.log(num); 
}
for (var num in arr) {
  console.log(num); 
}

// for in이 배열의 인덱스에 접근하는 반면 for of는 배열의 값 자체에 접근하는 것을 알 수 있습니다







//  논리 연산자를 이용해 변수 초기화 하는 방법
function fetchData(data) {
  var receivedData;
  if (data === undefined) {
    receivedData = localStorage.getItem('item');
  }
}

function fetchData(data) {
  var receivedData;
  receivedData = data || localStorage.getItem('item');
}
// localStorage API의 일부로, 웹 브라우저의 로컬 스토리지에서 키(key)가 'item'인 항목의 값을 가져오는 명령입니다. 
// localStorage는 웹 페이지의 세션 간에 데이터를 저장하기 위한 간단한 키-값 저장 메커니즘을 제공하며, HTTP 요청과는 독립적으로 동작합니다.




// 함수 표현식
var sumNumbers = function(a, b) {
  return a + b;
};

// 함수 선언문
function sumNumbers(a, b) {
  return a + b;
}


// 함수 리팩토링
function sumNumbers(a, b) {
  return a + b;
}

function sumAll() {
  var num = 1000;
  var total = sumNumbers(0, 0) + num;
  return total;
}

function fetchData() {
  var data = {};
  $.get('domain.com/products/1').then(function(response) {
    data = response.data;
    return data;
  });
}



