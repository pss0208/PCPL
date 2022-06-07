# 🏠 Page27 clone Project
 교육용으로 제작한 page27 쇼핑몰 클론코딩 프로젝트<br>
 

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
- gradle

<br/>


## 📦 개발 환경


- Intellij
- github


<br/>


## 📸 서비스 및 기능

<details markdown="1">
<summary>서비스 및 기능</summary>


### 메인 화면
🔍 메인 화면
- 주요 상품들로 carousel 구성하여 일정 시간마다 움직이도록 구현
- 상품 사진 클릭 시 해당 상품의 상세 페이지로 이동<br>
<img src="src/main/resources/static/image/etc/main.PNG" width=500><br>

🔍 세일 판매
- 상품 이름에 'SALE'가 들어가는 상품만 나오도록 설정
<img src="src/main/resources/static/image/etc/sale.PNG" width=500><br><br>

### 회원가입 / 로그인
🔍 회원가입
<br>
<img src="src/main/resources/static/image/etc/signup.PNG" width=500><br>

- ID 중복확인 기능(Ajax)<br>
<img src="src/main/resources/static/image/etc/login_ajax.PNG" width=300><br>
<img src="src/main/resources/static/image/etc/check_id.PNG" width=500><br>

🔍 로그인
- Spring Security 적용<br>
<img src="src/main/resources/static/image/etc/login.PNG" width=400><br><br>

### 관리자 기능
- ID를 'admin'으로 로그인 시 관리자로 넘어가도록 설정<br>
<img src="src/main/resources/static/image/etc/admin_login.PNG" width=500><br>

- 'admin'이 아닌 다른 ID로 로그인 후 관리자 페이지 접근 시 접근 제한<br>
<img src="src/main/resources/static/image/etc/permission_denied.PNG" width=500><br>

🔍 관리자 메인화면
- 누적 방문자 수 및 상품, 주문, 회원 현황 요약 출력<br>
<img src="src/main/resources/static/image/etc/admin_main1.PNG" width=400>
<img src="src/main/resources/static/image/etc/admin_main2.PNG" width=400><br><br>

🔍 상품 등록
- 상품 정보 저장(Querydsl)
- 이미지 파일 업로드(commons-io 라이브러리)<br>
<img src="src/main/resources/static/image/etc/admin_additem.PNG" width=500><br>

🔍 상품 목록
- 동적 검색 기능(Querydsl)<br>
<img src="src/main/resources/static/image/etc/admin_itemlist.PNG" width=500><br>

- 상품 상태 변경(판매, 품절) 및 삭제<br>
<img src="src/main/resources/static/image/etc/admin_change_itemstatus.PNG" width=500><br><br>

🔍 관리자 주문 관리
- 동적 검색 기능(Querydsl)<br>
<img src="src/main/resources/static/image/etc/admin_order.PNG" width=500><br><br>

### 회원 기능
🔍 마이페이지
- 잔여 마일리지 확인, 주문상태 확인
- 주문목록, 정보수정, 마일리지, 배송지 목록 페이지로 이동 가능한 링크 제공<br>
<img src="src/main/resources/static/image/etc/mypage.PNG" width=500><br>

🔍 정보 수정
- 회원 정보 수정 및 회원 탈퇴(Ajax)<br>
<img src="src/main/resources/static/image/etc/member_withdraw_ajax.PNG" width=500><br>
<img src="src/main/resources/static/image/etc/modify_info_member.PNG" width=500><br>

🔍 주문 조회
- 동적 검색 기능(Querydsl), 데이터 조회(Paging)<br>
<img src="src/main/resources/static/image/etc/search_order.PNG" width=500><br>

- 주문 취소 / 교환 / 반품 등 주문한 상품의 상태 변경(Ajax)<br>
<img src="src/main/resources/static/image/etc/order_ajax.PNG" width=500><br><br>

### 장바구니 기능
🔍 장바구니 화면
- 상품 수량 변경 및 삭제 기능(Ajax)<br>
<img src="src/main/resources/static/image/etc/basket_changequantity_ajax.PNG" width=500><br>
<img src="src/main/resources/static/image/etc/basket_delete_ajax.PNG" width=500><br>

- 선택 상품 주문 -> 선택된 상품을 결제 페이지로 이동
- 전체 상품 주문 -> 장바구니에 있는 모든 상품을 결제 페이지로 이동
- 각 상품의 주문 버튼 -> 해당 상품만 결제 페이지로 이동<br>
<img src="src/main/resources/static/image/etc/basket.PNG" width=500><br><br>

### 주문 기능
🔍 주문 화면<br>
<img src="src/main/resources/static/image/etc/order.PNG" width=500><br>

🔍 주소 검색
- daum 우편번호 검색 api 적용<br>
<img src="src/main/resources/static/image/etc/order_address.PNG" width=500><br>

🔍 주문 완료
- 적립 예정 마일리지, 결제 금액 및 배송정보 확인<br>
<img src="src/main/resources/static/image/etc/order_complete.PNG" width=500><br><br>




</details>

## ✔️ 문제 및 해결

<details markdown="1">
<summary>문제 및 해결</summary>

- ### 문제 : 웹 크롤링 코드가 한번씩 돌리도록 구성이 되어있어서 너무 많은 시간이 소요됨
- ### 해결 : for문과 switch-case문을 사용하여 각 카테고리별로 한번에 처리되도록 구성

<img src="src/main/resources/static/image/etc/webcrawling_for.PNG" width=500>
<br><br>

- ### 문제 : 크롤링 시 SQL문에서 에러가 발생함

<img src="src/main/resources/static/image/etc/error.PNG" width=500>
<br>

- ### 원인 : 크롤링해오는 값이 없을 경우 값이 null로 들어가지 않고 뒤에 텍스트까지 같이 크롤링을 해서 저장범위를 넘어감
- ### 해결 : 변수의 값을 null로 초기화하고 if문으로 값이 있는 경우에만 크롤링하도록 처리

<img src="src/main/resources/static/image/etc/solution.PNG" width=500>

</details>