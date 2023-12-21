# Book 프로젝트


- 클래스 다이어그램
> https://app.diagrams.net/#G1VdizGRYKHSx9SK0oJkQOv8PazieIXgjc


***

### 1. Book
- ` public void bookPrint ()` book클래스 변수 정보를 출력
- ` public String getBookId()` `bookId` 변수 return

### 2. BookService
- `public ArrayList<Book> getBookCart()` 저장하고 있는 Book ArrayList return
- `public void addBookCart(Book book)`Book ArrayList에 Book data 추가
- `public void printCartList()` 저장하고 있는 Book ArrayList 값 출력

### 3. Person
- `public String getName()`
- `public String getPhone()`

### 4. User
- `public void printCustomerInform()` User 의 이름과 전화번호를 출력
- `public String getId()`

### 5. Admin
- `public String getId()`
- `public String getPassword()`

### 6. AdminService
- `public  void menuAdminLogin(Person person)` 고객의 Admin 계정 로그인 함수
- `private void isAdmin(Admin admin,String adminId ,String adminPW)` 위의 로그인 함수에서 입력받은 id 와 pwd를 admin이 맞는지 비교하는 함수

### 7. OrderService
- `public void printMenu()` 시작 메뉴 화면을 출력
- `public void serviceCustomerPrint()` 고객의 정보를 출력
- `public void servicePrintCartList()` 장바구니에 있는 book 정보를 출력
-  `public void serviceAddBook(ArrayList<Book> bookMall)` 장바구니에 book을 추가
- `private void askAddBook` 위 함수 내에서 장바구니에 책을 추가할지 확인하는 함수

### 8. Order
- `public void run()` 서비스를 실행하는 함수
- `private void inputData()` 서비스 시작 시 이름과 전화번호를 입력 받는 함수
- ` private void fillBookMall()` 서비스 시작 시 서비스에서 보유 하고 있는 책을 추가하는 함수

### 9. Project
- main 파일
