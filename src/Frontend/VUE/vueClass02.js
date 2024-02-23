// https://joshua1988.github.io/vue-camp/js/prototype.html#%E1%84%91%E1%85%B3%E1%84%85%E1%85%A9%E1%84%90%E1%85%A9%E1%84%90%E1%85%A1%E1%84%8B%E1%85%B5%E1%86%B8-%E1%84%80%E1%85%A2%E1%84%82%E1%85%A7%E1%86%B7-%E1%84%8B%E1%85%B5%E1%84%92%E1%85%A2

// 프로토타입


// var simpleArray = [];
var simpleArray = new Array();

// 생성된 인스턴스인 simpleArray에는 __proto__ 라는 속성이 자동으로 부여
Array.prototype === simpleArray.__proto__; //true



function Person(name) {
  this.name = name;
}

// 모든 함수는 prototype 속성을 자동으로 가지고 있음
Person.prototype.printName = function() {
  console.log(this.name);
};

// ...

var ironMan = new Person("Tony Stark");
ironMan.__proto__.printName(); // undefined

// ...

var ironMan = new Person("Tony Stark");
ironMan.printName(); // Tony Stark

var captainAmerica = new Person("Steve Rogers");
captainAmerica.printName(); // Steve Rogers


captainAmerica.__proto__.printName();
// -> captainAmerica(.__proto__.)printName();
// -> captainAmerica.printName();


// 자바스크립트는 함수에 자동으로 prototype 이라는 객체 타입의 속성을 생성합니다. 
// new 연산자와 함께 함수를 호출하여 함수를 생성자 함수로써 사용할 경우, 생성된 인스턴스에는 숨겨진 속성인 __proto__ 속성이 자동으로 생성





//메서드 오버라이드


function Person(name) {
  this.name = name;
}

Person.prototype.printName = function() {
  console.log(this.name);
};

var ironMan = new Person("Tony Stark");

//printName 메서드 오버라이드
ironMan.printName = function() {
  console.log(`I am ${this.name}`);
};

ironMan.printName(); // I am Tony Stark



// simpleArray 인스턴스에 push 함수와 hasOwnProperty 함수를 정의하지 않았지만, 
// 위와 같이 사용할 수 있는 이유는 자바스크립트 엔진이 메서드를 찾는 방식이 먼저 자신의 속성을 검색하고, 
// 존재하지 않는다면 그다음으로 가까운 대상인 __proto__ 를 검색하는 순서로 진행하기 때문입니다

var simpleArray = new Array(1, 2); //[1, 2]
simpleArray.push(3); //[1, 2, 3]
simpleArray.hasOwnProperty(2); // true
console.dir(simpleArray);



// js에서 new 의 차이 
// new 키워드를 사용하여 객체를 생성하는 방식은 여러 독립적인 객체 인스턴스를 만들 수 있게 해줍니다. 
// 반면, IIFE는 단일 객체를 생성하고, 그 객체의 메서드를 통해서만 private 상태에 접근할 수 있게 해주는 패턴입니다. 
// IIFE는 주로 모듈 패턴에서 싱글톤 객체를 만들 때 사용됩니다.

// new 를 하면 새로운 인스턴스 생성, new 를 하지 않고 즉시 실행 함수 표현식 (Immediately-Invoked Function Expression, IIFE)
//사용하면 싱글톤 처럼 하나만 사용하는것


// 클로져는 함수의 실행이 끝난 뒤에도 함수에 선언된 변수의 값을 접근할 수 있는 자바스크립트의 성질
// 클래스에서 public 함수를 불러서 private 변수를 컨트롤하는 느낌


function addCounter() {
  var counter = 0;

  return function() {
    return counter++;
  };
}
console.log(addCounter());


function addCounter() {
  var counter = 0;

  return function() {
    return counter++;
  };
}

// add 변수가 addCounter()가 반환한 함수를 참조하고 있다
var add = addCounter();
add(); // 0
add(); // 1
add(); // 2




// new 를 하면 새로운 인스턴스 생성, new 를 하지 않고 즉시 실행 함수 표현식 (Immediately-Invoked Function Expression, IIFE)
//사용하면 싱글톤 처럼 하나만 사용하는것

// new 키워드를 사용할 경우:

// new를 사용하여 생성자 함수를 호출하면 JavaScript 엔진은 새로운 객체를 만듭니다.
// 이 객체는 생성자 함수의 프로토타입을 상속받습니다.
// 생성자 함수 내의 this 키워드는 새로 생성된 객체를 가리키게 되며, 이 객체는 생성자 함수가 끝난 후에 반환됩니다.
// 생성자 함수 내부에서 추가된 모든 속성은 이제 새 객체의 속성이 됩니다.
// 클로저를 사용할 경우:

// 클로저는 함수와 그 함수가 선언된 렉시컬 환경의 조합입니다.
// 이 렉시컬 환경은 함수가 생성될 때의 환경을 포함하며, 클로저가 생성될 때 캡처된 지역 변수들을 포함합니다.
// 클로저를 통해 생성된 함수는 이 클로저가 캡처한 변수들을 계속해서 접근하고 수정할 수 있습니다.
// 이 방식은 새 객체를 만들지 않고도 데이터를 캡슐화하고, 상태를 유지할 수 있는 방법을 제공합니다.

// 결론적으로, new 키워드로 생성된 객체와 클로저를 통해 생성된 상태를 유지하는 함수는 모두 독립적인 상태를 가지고 있지만, 
// new를 사용하면 프로토타입 체인을 통해 상속과 객체 지향 프로그래밍 패러다임을 활용할 수 있으며, 
// 클로저는 함수의 상태를 캡슐화하는 함수형 프로그래밍 패러다임에 좀 더 가깝습니다.


// Array.prototype에 정의된 push 함수와 Object.prototype에 정의된 hasOwnProperty 함수를 호출한 것입니다.
// 어떤 데이터의 __proto__ 속성 내부에 다시 __proto__ 속성이 연쇄적으로 이어진 것을 '프로토타입 체인(prototype chain)' 이라 하고, 
// 이 체인을 계속 따라가며 검색하는 것을 '프로토타입 체이닝(prototype chaining)' 이라고 합니다.

// 윗 부분의 prototype은 java에서 java.util.....이런거처럼 api 클래스 상속느낌이다
// new 를 통해 만들면 array, object 등 이용 가능한 것





// new를 사용하지 않으면, 생성자 함수의 prototype 속성에 연결된 프로토타입 체인을 이용한 상속을 사용할 수 없습니다.
//  예를 들어, 생성자 함수 Person의 프로토타입에 메서드를 추가하고 new Person()을 사용하여 객체를 생성하면, 
// 이 객체는 Person.prototype에 정의된 모든 메서드에 접근할 수 있습니다.
function Person(name) {
  this.name = name;
}

Person.prototype.sayHello = function() {
  console.log('Hello, my name is ' + this.name);
};

var person1 = new Person('Alice');
person1.sayHello(); // 'Hello, my name is Alice'가 출력됩니다.

var person2 = Person('Bob'); // `new` 키워드 없음
// person2는 undefined이고, sayHello 메서드는 person2에서 사용할 수 없습니다.






//private 
var fund = (function() {
  var money = 0;

  //  생성자를 특이하게 function() 으로 만들 수 있고, 거기에 return 에 애가 소유하고 있는 메서드를 3개를 가지고 있다.
  return {
    deposit: function(amount) {
      money += amount;
    },
    withdraw: function(amount) {
      money -= amount;
    },
    getMoney: function() {
      return money;
    }
  }
}());

fund.deposit(100); // 100
fund.deposit(100); // 200
fund.getMoney();   // 200
fund.money = 100000; // private 변수로 변경되지 않는다. 
fund.getMoney();   // 200



// 함수형 프로그래밍이란 특정 기능을 구현하기 위해서 함수의 내부 로직은 변경하지 않은 상태로 
// 여러 개의 함수를 조합하여 결과 값을 도출하는 프로그래밍 패턴을 의미
function add(num1, num2) {
  return num1 + num2;
}

function curry(fn, a) {
  return function(b) {   // return function 쪽은 인스턴스 만든애의 함수가 된다.
    return fn(a, b);
  };
}

var add3 = curry(add, 3);
add3(4); // 7
console.dir(add3);


// 결론 class 처럼 prototype에 정의하여 인스턴스 생성 후 메서드를 부르거나, (this 활용가능)
// 위에 처럼 클로저를 활용하여 class 느낌으로 사용가능하다. (this는 전역객체를 가리킴)


