# Spring 에러 모음


-1. 에러 - Column count doesn't match value count at row 

🌾 원인 :xml 쿼리에서 createAT, updatedAt 안써서 values와 매칭이 안됬다.

🌾 해결 방법 : xml쿼리를 insert 부분과 values 부분 매칭 되게 수정.

![스크린샷 2023-03-24 오후 12 27 45](https://user-images.githubusercontent.com/116433637/227419847-9bf479b7-5295-4e0c-9ec2-0030d83df017.png)

![스크린샷 2023-03-24 오후 12 29 45](https://user-images.githubusercontent.com/116433637/227419854-864ffae4-d3db-4a7d-8ce6-efa7312ee342.png)






- 2. 에러 - org.apache.ibatis.binding.BindingException

🌾 원인 : XML(Mapper) directory 경로 문제      src/main/resources -> mappers -> User.xml     // Mapper명을 뒤에 안 붙임.

🌾 해결 방법 : Mapper 명을 뒤에  붙이기.

![스크린샷 2023-03-24 오후 12 13 20](https://user-images.githubusercontent.com/116433637/227419871-4521964e-5d77-48aa-82b5-da6af3a2324e.png)

![스크린샷 2023-03-24 오후 12 17 00](https://user-images.githubusercontent.com/116433637/227419884-1e646be7-e4da-473e-a43c-9a0481769453.png)
