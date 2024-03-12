
- jpa 설정
spring.jpa.hibernate.ddl-auto=none: 자동 생성 기능을 비활성화합니다.
spring.jpa.hibernate.ddl-auto=update: 데이터베이스 스키마를 Entity 클래스에 맞게 업데이트합니다. (테이블이 없으면 생성)
spring.jpa.hibernate.ddl-auto=create: 매번 애플리케이션 실행 시 데이터베이스 스키마를 생성합니다. (기존 테이블이 있으면 삭제 후 재생성)
spring.jpa.hibernate.ddl-auto=create-drop: 애플리케이션 종료 시 생성된 데이터베이스 스키마를 삭제합니다.


패키지 구조
스프링 부트는 메인 애플리케이션 클래스가 위치한 패키지와 그 하위 패키지에서 컴포넌트를 자동으로 스캔합니다.'



스프링 3가지
ioc/di   aop    psa


- IOC 제어의 역전
프로그램의 제어 흐름을 사용자 코드가 아닌 프레임워크나 라이브러리가 관리하는 것

- 스프링 프레임워크(Spring Framework): 스프링은 Java 개발을 위한 종합적인 프레임워크로,
강력한 IoC 컨테이너를 제공합니다. 스프링에서는 주로 의존성 주입을 통해 IoC를 구현합니다.
인스턴스 생성, 생명 주기 관리, 의존성 해결 등을 개발자가 직접 관리하는 대신 프레임워크가 대신 관리하도록 하는 것
코드의 결합도를 낮추고, 유연성 및 확장성을 높이는 데 도움을 줍니다


- 스프링 컨테이너는 스프링 프레임워크에서 제공하는 IoC 컨테이너로, 애플리케이션 내의 객체(빈)의 생성, 생명 주기, 구성 및 관리를 담당합니다. 애플리케이션을 구성하는 모든 객체를 컨테이너 내에 등록하고, 컨테이너가 이러한 객체 사이의 의존성을 자동으로 연결해줍니다. 스프링 컨테이너는 크게 두 가지 유형으로 나뉩니다:

1. BeanFactory: 가장 단순한 컨테이너로, 빈의 정의와 구성을 관리합니다. 필요 시점에 빈을 생성하고 의존성을 주입하는 지연 로딩 방식을 사용합니다.
2. ApplicationContext: BeanFactory의 하위 인터페이스로, 보다 복잡한 기능을 제공합니다. 메시지 리소스 처리, 이벤트 발행, 애플리케이션 레이어의 특정 기능을 지원하는 등 더 많은 엔터프라이즈 특정 기능을 제공합니다.
- ApplicationContext는 즉시 로딩(eager-loading) 방식을 사용하여, 애플리케이션 시작 시점에 모든 싱글톤 빈을 미리 로드하고 초기화합니다. 이는 애플리케이션의 시작 시간은 늘리지만, 빈을 사용할 때 지연이 없게 합니다.




- 스프링 빈은 스프링 IoC 컨테이너가 관리하는 객체를 의미합니다. 빈은 일반적으로 애플리케이션의 핵심 구성 요소를 나타내며, 스프링 컨테이너에 의해 인스턴스화, 구성, 관리됩니다. 빈의 정의는 보통 XML 파일, 애너테이션, 자바 기반 설정 등을 통해 이루어지며, 스프링 컨테이너는 이 정보를 사용하여 빈의 생성 및 관리를 담당합니다.



-  스캔(Component Scan)은 스프링 프레임워크에서 제공하는 기능으로, 개발자가 직접 빈(Bean)을 XML 파일이나 자바 기반 설정 클래스에 등록하지 않아도, 스프링이 자동으로 클래스 경로(classpath)를 검색하여 스프링 빈으로 등록할 클래스를 찾고, 인스턴스화하며, 스프링 IoC(Inversion of Control) 컨테이너에 빈으로 등록해주는 과정을 말합니다
@Component, @Service, @Repository, @Controller 등 특정 스테레오타입 애너테이션이 붙은 클래스를 찾으면 해당 클래스를 빈으로 자동 등록합니다

@Component: 일반적인 컴포넌트 클래스를 정의할 때 사용합니다. 스프링 컨테이너는 이 애너테이션이 붙은 클래스를 빈으로 등록합니다.
@Repository: 데이터 접근 계층(DAO)의 컴포넌트를 정의할 때 사용합니다. 데이터베이스 예외를 스프링의 데이터 접근 예외로 변환하는 기능을 추가적으로 제공합니다.
@Service: 서비스 계층의 컴포넌트를 정의할 때 사용합니다. 비즈니스 로직을 처리하는 서비스 클래스를 나타냅니다.
@Controller: 웹 요청을 처리하는 컨트롤러의 컴포넌트를 정의할 때 사용합니다. MVC 패턴의 컨트롤러 역할을 합니다.

스프링 부트 애플리케이션을 실행할 때, @SpringBootApplication 애너테이션이 붙은 메인 클래스가 있는 패키지를 기준으로 컴포넌트 스캔이 자동으로 수행됩니다.



- 스프링에서 IOC 구현 방법
의존성 주입(Dependency Injection, DI): 객체의 의존성을 외부에서 주입하는 방식입니다.
생성자 주입, 세터 주입, 인터페이스 주입 등 다양한 방식이 있습니다.

- 자동 연결(Autowiring): 스프링 컨테이너는 빈 사이의 의존성을 자동으로 감지하고 연결해줍니다. 개발자는 @Autowired 애너테이션을 사용하여 의존성 주입을 요청할 수 있으며, 스프링은 실행 시점에 해당 의존성을 만족시키는 빈을 찾아 주입합니다.

1. 생성자 기반 의존성 주입
   생성자를 통해 의존성을 주입받습니다.
   생성자 인자를 통해 필요한 의존성을 명시적으로 선언하므로, 객체가 생성될 때 모든 의존성이 충족되어야 합니다.

```
@Component
public class ExampleService {
private final DependencyClass dependency;

    @Autowired
    public ExampleService(DependencyClass dependency) {
        this.dependency = dependency;
    }
}
```

2. 세터(또는 수정자) 기반 의존성 주입
   세터 메소드를 통해 의존성을 주입받습니다.
   선택적 의존성이나 변경 가능성이 있는 의존성에 적합합니다.
   @Autowired를 세터 메소드에 붙여 의존성 주입을 명시할 수 있습니다.
```
@Component
public class ExampleService {
private DependencyClass dependency;

    @Autowired
    public void setDependency(DependencyClass dependency) {
        this.dependency = dependency;
    }
}
```


3. 필드 기반 의존성 주입
   직접 클래스의 필드에 의존성을 주입합니다.
   코드가 간결하지만, 순환 의존성 문제를 야기할 수 있고, 테스트하기 어려울 수 있습니다.
   @Autowired를 필드에 붙여 의존성 주입을 명시합니다.
```
@Component
public class ExampleService {
@Autowired
private DependencyClass dependency;
}
```




- 스프링 프레임워크의 PSA(Portable Service Abstraction, 이식 가능한 서비스 추상화)

다양한 환경이나 기술 스택에서도 일관된 방식으로 작동할 수 있도록 하는 추상화 계층을 말합니다. 이러한 추상화를 통해 개발자는 구체적인 기술 구현이나 환경에 종속되지 않고, 비즈니스 로직에 집중할 수 있습니다.
이식성과 유연성을 향상시키는 것입니다.
다양한 플랫폼이나 기술 스택에 쉽게 적용하고, 필요에 따라 기술 구성 요소를 변경하거나 업그레이드할 수 있습니다

1. 데이터 접근 추상화
   Spring Data Access/Integration: JDBC, JPA, JMS 등 다양한 데이터 접근 기술에 대한 추상화를 제공합니다. 이를 통해 개발자는 구체적인 데이터 접근 기술에 대해 신경 쓰지 않고, 일관된 API를 사용하여 데이터를 관리할 수 있습니다.

2. 트랜잭션 관리 추상화
   Spring Transaction Management: 프로그래밍적(transaction template) 또는 선언적(@Transactional) 방식을 통해 트랜잭션 관리를 추상화합니다. 이 추상화는 JDBC, JPA, Hibernate 등 다양한 트랜잭션 관리 기술을 지원합니다.

3. 웹 추상화
   Spring Web MVC: 서블릿 API 위에 구축된 모델-뷰-컨트롤러(MVC) 웹 프레임워크입니다. Spring Web MVC는 웹 애플리케이션 개발을 위한 풍부한 기능과 유연성을 제공하며, 다양한 뷰 기술(JSP, Thymeleaf, FreeMarker 등)을 지원합니다.





- 스프링의 AOP(Aspect-Oriented Programming, 관점 지향 프로그래밍)

프로그래밍에서 공통의 관심사(cross-cutting concerns)를 모듈화하는 프로그래밍 패러다임
공통 관심사란 여러 클래스나 메서드에서 공통적으로 사용되는 기능을 말하며, 로깅, 트랜잭션 관리, 보안 검사와 같은 기능
공통 관심사를 비즈니스 로직에서 분리하여 관리할 수 있게 되며, 결과적으로 코드의 재사용성을 높이고, 유지보수를 용이하게 할 수 있습니다.

선언적 트랜잭션 관리: 메서드 실행을 트랜잭션 경계로 사용하는 트랜잭션 관리를 구현할 때
로깅과 모니터링: 메서드 실행 전후에 로그를 자동으로 남기거나 성능을 모니터링할 때
보안 검사: 메서드 실행 전에 사용자 권한을 검사할 때
오류 처리: 공통적인 예외 처리 로직을 구현할 때


```

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    // Pointcut 정의: 모든 Service 클래스의 모든 메서드를 대상으로 함
    @Pointcut("execution(* com.example.service.*.*(..))")
    private void serviceLayer() {}

    // Before Advice: 메서드 실행 전에 로그 출력
    @Before("serviceLayer()")
    public void logBefore(JoinPoint joinPoint) {
        logger.info("Before executing method: {}", joinPoint.getSignature().getName());
    }

    // After Advice: 메서드 실행 후에 로그 출력
    @After("serviceLayer()")
    public void logAfter(JoinPoint joinPoint) {
        logger.info("After executing method: {}", joinPoint.getSignature().getName());
    }
}
```

@Aspect 어노테이션을 사용하여 Aspect 클래스를 생성합니다. 이 클래스 내에는 여러 Advice가 포함될 수 있으며, 여기서는 메서드 실행 전후에 로그를 출력하는 before advice와 after advice를 정의합니다.

@Pointcut 어노테이션을 사용하여 serviceLayer라는 포인트컷을 정의합니다. 이 포인트컷은 com.example.service 패키지 내의 모든 클래스에 대한 모든 메서드 실행을 대상으로 합니다. @Before와 @After 어노테이션은 각각 해당 메서드가 실행되기 전과 후에 로깅을 수행하도록 지정합니다.

이렇게 하면, com.example.service 패키지 내의 모든 서비스 클래스에 대해 메서드가 호출될 때마다 자동으로 로그가 출력됩니다. 이 방식으로, 비즈니스 로직 코드에 직접 로깅 코드를 삽입하지 않고도 로깅 기능을 구현할 수 있습니다. 결과적으로 코드의 재사용성과 유지보수성이 향상되며, 관심사의 분리가 이루어집니다.






