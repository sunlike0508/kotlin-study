# 변수의 선언

* val : 변수를 선언할 때 지정한 값에서 더이상 변경하지 않아야 하는 경우

* var : 변수의 값을 바꿀 수 있어야 하는 경우

```kotlin
var variableName: String = "변수 선언 방법"
```

변수를 선언할때 데이터 타입은 생략 가능하며, 값을 가지고 자료형을 자동으로 지정할 수 있다. (자료형 추론) 

```kotlin
println("print value: : $value");
```

## 데이터 타입

코틀린은 Reference Data Type을 사용한다.

Reference Data Type은 객체(메모리)를 생성하고 데이터를 할당하는 방식을 의미 한다.

다만 참조형으로 생성된 객체는 컴파일 과정에서 기본형으로 대체되어 문제없이 사용할 수 있다.

데이터 타입의 최상위 클래스로는 Any가 있다.

```kotlin
var a: int = 0; // 이렇게 쓰지 말고(어차피 컴파일 단계에서 잡힘)
var a: Int = 0; // 이렇게 쓰라는 말
```

## 숫자형 데이터 타입

* 정수형 데이터 타입

Long(64bits), Int(32), short(16), Byte(8)

기본적으로 Int로 추론되며 숫자 뒤에 L을 붙여주면 Long으로 추론

```kotlin
val a = 0; // int 타입
val b = 0L; // long 타입
```

* 실수형 데이터 타입

Double(64), Float(32)

실수형은 기본적으로 Double 타입으로 추론

숫자형 데이터 타입은 자리수를 구분하기 위해 언더바(_)를 사용할 수 있으며, 값에 영향을 주지 않는다.

* 논리형 데이터 타입

Boolean : true, false

* 문자, 문자열 데이터 타입

Char(16) : 선언할 때는 무조건 문자 값을 사용해야 한다. (c, java 처럼 숫자를 선언X, 컴파일 과정에서 최적화로 인한거 아닐까 추정)

String(문자열)

# 산술연산자


# 조건문과 반복문