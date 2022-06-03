# 🏠 Page27 clone Project
 교육용으로 제작한 page27 클론코딩 프로젝트<br>
 

## 👋 Part 

- 프론트 : 박준원, 채기웅
- 백엔드 : 박상순, 이현도

## 📁 프로젝트 기능

- 회원가입 & 로그인
- 회원 마이페이지를 통한 정보 수정
- 관리자 페이지를 통한 회원, 상품, 주문 관리
- 주소 등록
- 장바구니
- 상품 주문 및 결제

<br/>

## 📕 기술 스택

#### 📙  프론트 엔드

- html
- CSS
- JavaScript(jQuery, Ajax)
- Thymeleaf



#### 📙 백엔드

- Spring Boot
- Spring Data JPA
- Spring Security
- QueryDsl
- H2

<br/>


## 📦 개발 환경


- Intellij
- github


<br/>


## 📸 서비스 및 기능

<details markdown="1">
<summary>서비스 및 기능</summary>
🔍🔍🔍🔍🔍🔍🔍🔍

- ### 메인 화면
<img src="src/main/resources/static/image/etc/main.PNG" width=500>

- ### 관리자 로그인 시 상단 메뉴
<img src="src/main/webapp/resources/image/login_admin.PNG" width=500>

- ### 회원 로그인 시 상단 메뉴
<img src="src/main/webapp/resources/image/login_member.PNG" width=500>

- ### 회원 마이 페이지
<img src="src/main/webapp/resources/image/mypage.PNG" width=500>

- ### 관리자 페이지
<img src="src/main/webapp/resources/image/adminpage.PNG" width=500>

- ### 자동 완성 기능 
<img src="src/main/webapp/resources/image/autosearch.PNG" width=500>

- ### 장바구니
<img src="src/main/webapp/resources/image/putbasket.PNG" width=500>
<img src="src/main/webapp/resources/image/basketpage.PNG" width=500>

- ### 주문 기능
<img src="src/main/webapp/resources/image/order1.PNG" width=500>
<img src="src/main/webapp/resources/image/order2.PNG" width=500>


</details>

## ✔️ 문제 및 해결

<details markdown="1">
<summary>문제 및 해결</summary>

- ### 문제 : 웹 크롤링 코드가 한번씩 돌리도록 구성이 되어있어서 너무 많은 시간이 소요됨
- ### 해결 : for문과 switch-case문을 사용하여 각 카테고리별로 한번에 처리되도록 구성

<img src="src/main/resources/static/image/etc/webcrawling_for.PNG" width=500>
<br><br>

- ### 문제 : 

<img src="src/main/resources/static/image/etc/error.PNG" width=500>
<br>

- ### 원인 : 크롤링해오는 값이 없을 경우 null로 들어가지 않고 뒤에 텍스트까지 같이 크롤링을 해서 저장범위를 넘어감
- ### 해결 : if문으로 값이 있는 경우에만 크롤링하게 함

<img src="src/main/resources/static/image/etc/solution.PNG" width=500>

</details>