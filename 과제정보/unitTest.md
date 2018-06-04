 # JUnit을 활용한 Unit test

 JUnit은 단위 테스트 도구로서 Eclipse에 플러그인 형태로 탑재되어 있습니다. 따라서 Eclipse에서 JUnit을 활용하는 방법에 대해서 알아볼 예정입니다.

 <h2>1.Eclipse에 JUnit 설정</h2>

 <h3> Java Project 생성 </h3>

  ![JUnit_create_JavaProject](/assets/JUnit_create_JavaProject.png)
  > 프로젝트 이름은 편의를 예시를 Test로 생성
  이곳은 실행코드와 테스트 고드를 담을 java project 입니다.

  <h3> Project Properites 설정</h3>

  ![JUnit_setting](/assets/JUnit_setting.png)
  > 마우스 우클릭을 한뒤 맨 Properities를 클릭힙니다.

  <h3> JUnit 추가</h3>

  ![JUnit_setting_addLibrary](/assets/JUnit_setting_addLibrary.png)
  >우측 탭들 중 Java BuildPath를 선택한 뒤 Libraries 탭을 선택하고, Add Library를 선택합니다.

  ![JUnit_setting_addLibrary_JUnit](/assets/JUnit_setting_addLibrary_JUnit.png)
  > JUnit을 클릭하고 Next를 클릭

  ![JUnit_setting_addLibrary_JUnit_JUnit5](/assets/JUnit_setting_addLibrary_JUnit_JUnit5.png)
  > JUnit5를 선택하고 Finish를 클릭합니다.

  ![JUnit_setting_apply](/assets/JUnit_setting_apply.png)
  > 다음과 같이 JUnit이 추가된 것을 볼 수 있습니다. 여기서 apply and Close를 클릭하여 설정을 저장하여 줍니다.

 <h3>2. JUnit 사용하기</h3>

 예제를 통하여 JUnit 사용법을 알아보도록 하겠습니다.
 이번에 사용될 예제는 계산기 예제로 이를 통해 JUnit을 사용해 볼 것입니다.

 <h3> 테스트 클래스 생성 및 메소드 정의</h3>

  ![JUnit_new_package](/assets/JUnit_new_package.png)
  >계산기 Class를 답을 Package를 생성합니다.

  ![JUnit_new_Class](/assets/JUnit_new_Class.png)
  > 생성된 패키지 안에 Calculator Class를 생성하고 테스트할 메소드를 정의합니다.

  ![JUnit_define_method](/assets/JUnit_define_method.png)

 <h3> JUnit 테스트케이스 생성 </h3>

 ![JUnit_new_testCase](/assets/JUnit_new_testCase.png)
 ![JUnit_new_testCase_setting](/assets/JUnit_new_testCase_setting.png)
 > 클래스 이름은 내가 테스트 할 클래스의 이름에 Test를 붙여 정하고 Browse버튼을 클릭하여 내가 Test할 Class를 설정해 줍니다.

 ![JUnit_new_testCase_classSelected](/assets/JUnit_new_testCase_classSelected.png)
 > 제대로 선택되면 위와 같은 상태이고 이 상태에서 Finish를 클릭하여 JUnit test case를 생성해 줍니다.

 ![JUnit_testCase](/assets/JUnit_testCase.png)
 > 자동으로 생성된 모습입니다. 우리는 ```@test``` 어토네이션이 있는 부분의 test() 함수에 test케이스를 추가하여  Unit test를 수행하면 됩니다.
 이때, 우리가 사용할 method들은 [이곳](http://junit.sourceforge.net/javadoc/org/junit/Assert.html)을 참고하면 됩니다.
 우리는 간단하게 assertEquals() 함수를 사용하여 unit test를 진행 할 것입니다.

 CalculatorTest클래스의 내용에 아래와 같이 test코드를 추가한 뒤 test를 진행합니다.
   ```java
   package com.calculator.test;

  import static org.junit.jupiter.api.Assertions.*;

  import org.junit.jupiter.api.Test;

  import com.calculator.Calculator;

  class CalculatorTest {

  	@Test
  	void test() {
  		Calculator calculator = new Calculator();
      assertEquals(30, calculator.sum(10,20),"10+20");
  		assertEquals(40, calculator.sum(30,10),"30+10");
  		assertEquals(40, calculator.sum(40,10),"40+10");
  	}

  }
   ```
   ![JUnit_testCase_run](/assets/JUnit_testCase_run.png)
   > test클래스를 Run하고 결과를 확인합니다.

   - 실패할 경우

  ![JUnit_testCase_run_failure](/assets/JUnit_testCase_run_failure.png)

  gi> 빨간색 바와 아래 Failure Trace에 처음으로 테스트한 assertEquals 함수의 세번째 파라미터 값과 내 예상결과값 그리고 실제 결과값이 나오게 됩니다.
  이를 해결하여 성공할 경우엔

   - 성공할 경우
   
   ![JUnit_testCase_run_success](/assets/JUnit_testCase_run_success.png)

   >위와 같은 화면이 출력되며 유닛 테스트가 성공했음을 확인할 수 있습니다.

  -끝 \^o^
