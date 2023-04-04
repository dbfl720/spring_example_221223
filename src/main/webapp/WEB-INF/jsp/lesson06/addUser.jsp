<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<%-- AJAX를 사용하려면 jquery  원본 필요  --%>
<script src="https://code.jquery.com/jquery-3.6.4.js" integrity="sha256-a9jBBRygX1Bh5lt8GZjXDzyOB+bWve9EiO7tROUtj/E=" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
</head>
<body>
	<div class="container">
		<h1>회원 정보 추가</h1>
		
		
		<form method="post" action="/lesson06/ex01/add_user">
			<div class="form-group">
				<label for="name"><b>이름</b></label>
				<input type="text" id="name" name="name" class="form-control col-3">
			</div>	
			<div class="form-group">
				<label for="yyyymmdd"><b>생년월일</b></label>
				<input type="text" id="yyyymmdd" name="yyyymmdd" class="form-control col-3">
			</div>
			<div class="form-group">
				<label for="email"><b>이메일</b></label>
				<input type="text" id="email" name="email" class="form-control col-3">
			</div>
			<div class="form-group">
			<b>자기소개</b>
				<textarea for="introduce" class="form-control col-5" id="introduce" name="introduce" rows=6></textarea>
			</div>
			<!-- <input type="submit" class="btn btn-success" value="회원가입"> -->
			<%-- **** AJAX 통신일 때는 반드시 button 타입으로 지정한다. ***  --%>
			 <input type="button" id="addBtn" class="btn btn-success" value="회원가입"> 
		</form>
	</div>
	
<script>
	$(document).ready(function(){
		
		// (1) jquery의 submit 기능 이용하기
		/* /*
		$("form").on("submit", function(e) {      // e: event 약자.  // document - 모든 문서.
			// e.preventDefault();     // sumbit 되는 것을 막는다.
			// alert("서브밋 버튼 클릭");
			
			// validation
			let name = $("#name").val().trim();
			if (!name) {       // name == ""
				alert("이름을 입력하세요.");
				return false;    // ** submit 안함. 
			}
			
			let yyyymmdd = $("#yyyymmdd").val().trim();
			if (!yyyymmdd) {
				alert("생년월일을 입력하세요.");
				return false;    // submit 안함
			}
			
			// 여기까지 도달하면 submit 된다. 
		});
		*/ 
		
		// (2) jquery의 AJAX 통신을 이용하기
		$("#addBtn").on("click", function() {
			//alert("버튼 클릭");
			
			// validation
			let name = $("#name").val().trim();
			if (!name) {       // name == ""
				alert("이름을 입력하세요.");
				return;
			}
			
			let yyyymmdd = $("#yyyymmdd").val().trim();
			if (!yyyymmdd) {
				alert("생년월일을 입력하세요.");
				return;
			}
			
			
			let email = $("input[name=email]").val().trim();
			let introduce = $("#introduce").val();
			console.log(name);
			console.log(yyyymmdd);
			console.log(email);
			console.log(introduce);
			
			
			
			// AJAX: 폼태그와 상관없이 비동기로 별도 요청 (Request)  // 브라우저가 하는 일을 개발자가 다 함.
			$.ajax({
				// request 
				type:"POST"
				, url:"/lesson06/ex01/add_user"     
				, data:{"name":name, "yyyymmdd":yyyymmdd, "email":email, "introduce":introduce}  //request parma 이름(왼쪽) / 변수 (오른쪽) // 변수 없으면 작동 안됨.
				
				
				// response 
				, success:function(data) { // data는 성공이 오는 거임. // data : response에 오는 결과 응답. (변수)  // ** 응답은 항상 string.
					
					if(data == "성공") {      // "성공" 단어가 controller에 있는 "성공"단어와 일치해야 하나???????????????????
						location.href ="/lesson06/ex01/result_view";
					}
					
					// alert(data); 
				}
				, complete:function(data) {  // 무조건  띄어짐. 앞으로 안써도 됨.
					alert("성공이든 실패이든 완료");
				}
				, error:function(request, status, error) {
					alert(request);
					alert(status);
					alert(error);
				}
			});
		});
		
	});

</script>
</body>
</html>