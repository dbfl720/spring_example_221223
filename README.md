
# 🌳 에러 코드

Cause: java.sql.SQLException: Column count doesn't match value count at row 1
; bad SQL grammar []; nested exception is java.sql.SQLException: Column count doesn't match value count at row 1] with root cause
java.sql.SQLException: Column count doesn't match value count at row 1 <br><br>
* 🌾 원인 :xml 쿼리에서 createAT, updatedAt 안써서 values와 매칭이 안됬다.

* 🌾 해결 방법 : xml쿼리를 insert 부분과 values 부분 매칭 되게 수정.<br><br>
![스크린샷 2023-03-24 오후 12 27 45](https://user-images.githubusercontent.com/116433637/227427515-1427e089-f03e-4800-80eb-1bb80092e895.png)
![스크린샷 2023-03-24 오후 12 29 45](https://user-images.githubusercontent.com/116433637/227427528-b4257fa0-6970-4e69-8aeb-7b8a6a6d95ac.png) <br><br><br><br><br>

# 🌳 에러 코드
2023-03-24 11:44:03,654 ERROR [org.apache.catalina.core.ContainerBase.[Tomcat].[localhost].[/].[dispatcherServlet]] Servlet.service() for servlet [dispatcherServlet] in context with path [] threw exception [Request processing failed; nested exception is org.apache.ibatis.binding.BindingException: Invalid bound statement (not found): com.example.lesson04.dao.UserMapper.insertUserAsField] with root cause

org.apache.ibatis.binding.BindingException: Invalid bound statement (not found): com.example.lesson04.dao.UserMapper.insertUserAsField <br>

* 🌾 원인 : XML(Mapper) directory 경로 문제      src/main/resources -> mappers -> User.xml     // Mapper명을 뒤에 안 붙임.

* 🌾 해결 방법 : Mapper 명을 뒤에  붙이기.

![스크린샷 2023-03-24 오후 12 13 20](https://user-images.githubusercontent.com/116433637/227428100-0af16bbe-e4ae-4632-b83d-5865e668ad45.png)
![스크린샷 2023-03-24 오후 12 17 00](https://user-images.githubusercontent.com/116433637/227428105-4ebb8660-6427-430c-8619-cba3788a33fc.png)

<br><br><br><br><br>
