## Project_mall 리펙토링

- 클래스간 결합도가 너무 높았고, 각각 역할에 따라 클래스를 나누어 주어야했다.
- Scanner 도 한 번만 선언하면 될 것을 클래스마다 생성하는 등 중복되는 메소드도 많았다.
- 각각 Person을 상속받는 User, Admin그리고  Book 클래스를 vo(value Object)로 만들고 더 이상 데이터 변화 없이 getter해서 사용할 수 있도록 만들었다.
- User와 Admin, Book 을 이용해 기능을 수행하는 UserService, BookService, AdminService 클래스를 만들었고 메인문에서 객체를 생성하여 사용하게 만들었다.
- 사용자가 처음 주문시 맞이하는 메뉴기능을 OrderService로 만들었다.

- 기능이 여러개가 들어가는 함수는 기능별로 나누어서 작성했다.

### OrderMain class (메인)
- 메인문 부터 요한 부분은  다른 클래스의 메소드로 만들었다.
- Book의 기능중 하나를 담당하기 때문에 BookService클래스에 넣어줬다. 
- 반복되는 메뉴를 보여주는 While 문은 OrderService로 빼버렸다.
- Scanner 클래스 중복 사용을 하지 않기 위해 메인에서 Scnner 객체를 만들고BookService 클래스 생성할때 매개변수로 보내주었다.

```agsl

public class OrderMain {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String name;      //입력받을 이름
String tel;       //입력받을 전화번호
User user1;

    System.out.print("당신의 이름을 입력하세요 : ");
    name = sc.nextLine();
    System.out.print("연락처를 입력하세요 : ");
    tel = sc.nextLine();

    user1 = new User(name, tel); // 입력받은 name, tel로 user객체 생성

    OrderService orderService = new OrderService(user1, sc);    //생성한 User객체로 OrderService 객체 생성     //Scanner 중복 선언 방지를 위해 객체를 넘겨준다

    System.out.println("******************************\n");
    System.out.println("\tWelcom to Shopping Mall");
    System.out.println("\tWelcom to Book Market");

    orderService.printSelectMenu();

}
}
```

### Book class
- vo (value Object)이다.
- 기본적인 Book 이름, id등 정보를 필드로 가지고있다.
- 생성자와 id, name을 리턴하는 getter가 있다.

```agsl
public class _Book {
private String bookId;
private String bookName;
private int bookPrice;
private String bookAuthor;
private String bookSubName;
private String bookCategory;
private String bookDate;

public _Book(String bookId, String bookName, int bookPrice, String bookAuthor, String bookSubName, String bookCategory, String bookDate) {
this.bookId = bookId;
this.bookName = bookName;
this.bookPrice = bookPrice;
this.bookAuthor = bookAuthor;
this.bookSubName = bookSubName;
this.bookCategory = bookCategory;
this.bookDate = bookDate;
}

public String getBookId() {
return bookId;
}

public String getBookName() {
return bookName;
}

public int getBookPrice() {
return bookPrice;
}

public String getBookAuthor() {
return bookAuthor;
}

public String getBookSubName() {
return bookSubName;
}

public String getBookCategory() {
return bookCategory;
}

public String getBookDate() {
return bookDate;
}
}

```

### Person class
- Admin과 User의 부모이다.
- User나 Admin이던 이름과 전화번호등 공통된 필드와를 getter를 가지기 때문에 Person 필드를 상속받게 해놓았다.
- 기존에 메인문에 관리자 id 와 password를 선언해 주었는데 Person에 처음부터 초기화 해주었다.

```agsl
public class _Person {
private String id = "_Admin"; //관리자 아이디, 비밀번호 고정
private String password = "Admin1234";
private String name;
private String tel;

public _Person(){}

public _Person(String name, String tel){
this.name = name;
this.tel = tel;
}

public _Person(String id, String password, String name, String tel) {
this.id = id;
this.password = password;
this.name = name;
this.tel = tel;
}

public String getName() {
return name;
}

public String getPhone() {
return tel;
}

public String getId() {
return id;
}

public String getPassword() {
return password;
}
}
```
### Admin class
- Admin 클래스는 Person 클래스를 상속받는다.
- 부모 생성자를 사용하기 때문에 super()를 사용했다.


```agsl
public class _Admin extends _Person {

public _Admin(_User user) {
super(user.getName(), user.getPhone(), user.getId(), user.getPassword());
}

}
```

### User class

```agsl
public class _User extends _Person{

public _User(String name, String tel) {
super(name, tel);
}

}
```
### OrderService
- 반복되는 메뉴를들 보고,  선택하는  기능들을 OrderService 에 정리했다.
```agsl
public class OrderService {
Scanner sc;
User user;

public OrderService(User user, Scanner sc) {
this.sc = sc;
this.user = user;  //OrderMain에서 생성한 user객체를 받아온다.
}

public void printMenu() {
System.out.println();
System.out.println("******************************");
System.out.println("1. 고객 정보 확인하기");
System.out.println("2. 장바구니 상품 목록보기");
System.out.println("4. 바구니에 항목 추가하기");
System.out.println("8. 종료");
System.out.println("9. 관리자 로그인");
System.out.println("******************************");
System.out.print("\n메뉴 번호를 선택해주세요 ");
}

public void printSelectMenu() {
UserService userService = new UserService(this.user);       //UserService 객체 생성
BookService bookService = new BookService(this.user, sc);   //BookService 객체 생성
//Scanner 중복 선언 방지를 위해 객체를 넘겨준다

    while (true) {
      printMenu();   //메뉴 목록 출력

      int choiceNum = sc.nextInt();   //메뉴 선택
      sc.nextLine();

      switch (choiceNum) {
        case 1 -> { //유저 정보 출력
          userService.userInfoPrint();
        }
        case 2 -> { //나의 장바구니 목록 출력
          bookService.bookListPrint(bookService.getMyCartBookList());
        }
        case 4 -> { //장바구니에 책 추가
          bookService.cartAddBook();
        }
        case 8 -> { //프로그램 종료
          System.out.println("종료");
          System.exit(0);
        }
        case 9 -> { //관리자 로그인
          AdminService adminService = new AdminService(user);
          adminService.menuAdminLogin();  //관리자 로그인 메뉴
        }
      }
    }
}


}
```
### Book class
- 책 관련 기능을 담당한다.
- 쇼핑몰에 현재 있는 책들을 리스트로 가지고 있다.
- 책 리스트를 차례대로 출력하는 메소드, 나의리장바구니   리스트에책을 추가하는 메소드 등을 가진다.
```agsl
public class BookService {
  private User user;
  private Scanner sc;
  private ArrayList<Book> bookList = new ArrayList<>();         // 현재 쇼핑몰에 책리스트
  private ArrayList<Book> myCartBookList = new ArrayList<>();   // 내가 담은 장바구니 리스트
  Book book1 = new Book("ISBN1234", "쉽게 배우는 JSP 웹 프로그래밍", 27000, "송미영", "단계별로 쇼핑몰을 구현하며 배우는 JSP 웹 프로그래밍", "IT전문서", "2018/10/06");
  Book book2 = new Book("ISBN1235", "안드로이드 프로그래밍", 33000, "우재남", "실습 단계별 명쾌한 멘토링!", "IT전문서", "2022/01/22");
  Book book3 = new Book("ISBN1236", "스크래치", 22000, "고광일", "컴퓨터 사고력 키우는 블록 코딩", "컴퓨터입문", "2019/06/10");


  public BookService(User user, Scanner sc){
    bookList.add(book1);
    bookList.add(book2);
    bookList.add(book3);
    this.user = user;
    this.sc = sc;

  }

  public void bookListPrint (ArrayList<Book> bookList){ // Book 리스트 출력
    if(bookList.isEmpty()){
      System.out.println("장바구니가 비었습니다.");
    }
    for(Book book : bookList){
      System.out.print(book.getBookId()+" | "+book.getBookName()+" | "+book.getBookPrice()+" | "+book.getBookAuthor()+" | "+book.getBookSubName()+" | "+book.getBookCategory()+" | "+book.getBookDate()+"\n");
    }
  }

  public void addListBook(Book book) { // 장바구니에 Book 담기

    this.myCartBookList.add(book);
  }

  public ArrayList<Book> getMyCartBookList() {
    return myCartBookList;
  }

  public void cartAddBook() { // 장바구니에 Book 담기

    String inputId = "";  // 입력받는 책아이디

    boolean bookIs = true;

    System.out.println();

    bookListPrint(bookList); // 책리스트춮력

    while (bookIs) { // false 나올때까지 반복
      System.out.print("\n장바구니에 추가할 도서의 ID를 입력하세요 ");
      inputId = sc.nextLine();

      for (Book book : bookList) {
        if (book.getBookId().equals(inputId)) {
          bookIs = false;
          // 입력받은 book아이디랑 쇼핑몰 책 리스트에 같은이름이 있으면 이 if문에 들어오고 bookIs는 false가 되어서 for문 빠져나옴
        }
      }
      if (bookIs) { // 같은 이름이 없으면 true 니까 if 실행 그리고 while 반복
        System.out.println("목록에 그런 책이없습니다.");
      }
    }
   askAddBook(bookList, inputId);
  }

  public void askAddBook(ArrayList<Book> bookList,String inputId){
    String inputTF;       // 장바구니 추가하겠습니까? Y|N

    System.out.print("장바구니에 추가하시겟습니까? (Y|N) "); //
    inputTF = sc.nextLine();
    if (inputTF.equalsIgnoreCase("Y")) {
      for (Book book : bookList) {
        if (book.getBookId().equals(inputId)) {
          addListBook(book); // Y면 장바구니에 추가
          System.out.println(book.getBookId() + " 도서가 장바구니에 추가되었습니다.");
        }
      }

    } else if (inputTF.equalsIgnoreCase("N")) {
      System.out.println("N입력");
    } else {
      System.out.println("다른 문자 입력,다시 입력 해주세요");
    }
  }

}
```
### AdminService class
- user 객체를 받아 온다.
- Admin 로그인 기능이 있어, 입력받은 아이디와 비밀번호가 같으면 Admin 객체를 생성한 후
- Admin 정보(이름, 연락처,  아이디, 비밀번호) 를 출력한다.
- 함수를 기능당 하나 씩 배치되도록 나눴다.

```agsl
public class AdminService {

    User user;

    public AdminService(User user) { //생성자
        this.user = user;
    }

    public void menuAdminLogin() {   // 관리자 로그인
        System.out.println("관리자 정보를 입력하세요");

        Scanner sc = new Scanner(System.in);
        System.out.println("아이디 :");
        String adminId = sc.next();
        System.out.println("비밀번호 :");
        String adminPW = sc.next();

        isAdmin(user, adminId, adminPW);

    }

    private void isAdmin(User user, String adminId, String adminPW) {
        if (user.getId().equals(adminId) && user.getPassword().equals(adminPW)) {
            // 관리자 아이디가 맞으면 Admin 객체 생성
            Admin admin = new Admin(user);
            // user 받는 이유, admin 의 아이디 비번을 확인하고 객체 생성을 하기 때문에, 유저 객체 들어올수 밖에 없다.
            // (서비스 흐름이 유저 객체가 생성된 상태에서 진행되기 때문이다. --> 전번과 이름이 user 객체에 존재 하고 있어서)

            System.out.println("이름" + admin.getName() + " 연락처 " + admin.getPhone());
            System.out.println("아이디" + admin.getId() + " 비밀번호 " + admin.getPassword());
        } else {
            System.out.println("관리자 정보가 일치하지 않습니다.");
        }
    }
}
```
### UserService class
- user의 정보를 출력한다.

```agsl
public class UserService {

User user;

public UserService(User user) {
this.user = user;
}

public void userInfoPrint() {
System.out.println("고객 정보확인");
System.out.println("이름: "+user.getName());
System.out.println("전화번호: "+user.getPhone()); // 고객 이름, 전화번호 출력
}

}
```