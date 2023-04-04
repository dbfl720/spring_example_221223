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

		<div class="form-group">
			<label for="name"><b>이름</b></label> 
			<div class="d-flex">
			<input type="text" id="name" class="form-control col-3">
			<button type="button" class="btn btn-info" id="nameCheckBtn">중복확인</button>
			</div>
			<small id="nameStatusArea"></small>
		</div>
		
		<button type="button" class="btn btn-success" id="jointBtn">가입하기</button>
	</div>
	
	
<script>
$(document).ready(function() {
		// 중복확인 버튼 클릭
		$("#nameCheckBtn").on('click', function() {
			// #nameStatusArea 하위 태그들을 초기화
			$('#nameStatusArea').empty();
				
				let name = $("#name").val().trim();
				
				//validation
				if (name == "") {
					$("#nameStatusArea").append('<span class="text-danger">이름이 비어있습니다.</span>');      // 태그를 추가할때는 append() 쓰기.
					return;
				}
				
				
				// 이름이 중복됐는지 체크 -> AJAX 통신  // 기본으로 -get 임.. 
				$.ajax({
					// request
					type:"get"
					, url:"/lesson06/ex02/is_duplication"
					, data:{"name":name}
				
				
					// response
					, success:function(data) {
						// {"isDUplication":true}
	
							if (data.isDUplication) {
								$("#nameStatusArea").append('<span class="text-danger">이름이 중복되었습니다.</span>'); 
							}
					}
					, error:function(request, status, error) {
						alert("중복확인에 실패했습니다. 관리자에게 문의해주세요.");
					}
				});
		});
		
		
		// 가입버튼 클릭
		$("#jointBtn").on("click", function() {
			// nameStatusArea 상자 하위 노드들이 있는지 확인  (노트 = 객체 = 태그)
			console.log($("#nameStatusArea").children().length);
			if ($("#nameStatusArea").children().length == 0) {
				alert("서버호출 가능");
			} else {
				alert("서버호출 불가");
			}
			
		});
	
});
</script>
</body>
</html>