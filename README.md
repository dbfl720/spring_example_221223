# Spring 에러 모음


🌳 에러 코드
 

Whitelabel Error Page

This application has no explicit mapping for /error, so you are seeing this as a fallback.

Fri Mar 24 12:15:41 KST 2023

There was an unexpected error (type=Internal Server Error, status=500).

### Error updating database. Cause: java.sql.SQLException: Column count doesn't match value count at row 1 ### The error may exist in file [/Users/hongyuri/Desktop/메가스터디 IT/Spring/ex/workspace/SpringExample/bin/main/mappers/userMapper.xml] ### The error may involve com.example.lesson04.dao.UserMapper.insertUserAsField-Inline ### The error occurred while setting parameters ### SQL: INSERT INTO `new_user` ( `name` ,`yyyymmdd` ,`email` ,`introduce` ) VALUES ( ? ,? ,? ,? ,NOW() ,NOW() ) ### Cause: java.sql.SQLException: Column count doesn't match value count at row 1 ; bad SQL grammar []; nested exception is java.sql.SQLException: Column count doesn't match value count at row 1

org.springframework.jdbc.BadSqlGrammarException: 

### Error updating database.  Cause: java.sql.SQLException: Column count doesn't match value count at row 1

### The error may exist in file [/Users/hongyuri/Desktop/메가스터디 IT/Spring/ex/workspace/SpringExample/bin/main/mappers/userMapper.xml]

### The error may involve com.example.lesson04.dao.UserMapper.insertUserAsField-Inline

### The error occurred while setting parameters

### SQL: INSERT INTO `new_user`    (     `name`     ,`yyyymmdd`     ,`email`     ,`introduce`    )    VALUES    (     ?     ,?     ,?     ,?     ,NOW()     ,NOW()    )

### Cause: java.sql.SQLException: Column count doesn't match value count at row 1

; bad SQL grammar []; nested exception is java.sql.SQLException: Column count doesn't match value count at row 1

 

 

 

 

<console 창>

2023-03-24 12:15:41,125 ERROR [org.apache.catalina.core.ContainerBase.[Tomcat].[localhost].[/].[dispatcherServlet]] Servlet.service() for servlet [dispatcherServlet] in context with path [] threw exception [Request processing failed; nested exception is org.springframework.jdbc.BadSqlGrammarException:

### Error updating database. Cause: java.sql.SQLException: Column count doesn't match value count at row 1

### The error may exist in file [/Users/hongyuri/Desktop/메가스터디 IT/Spring/ex/workspace/SpringExample/bin/main/mappers/userMapper.xml]

### The error may involve com.example.lesson04.dao.UserMapper.insertUserAsField-Inline

### The error occurred while setting parameters

### SQL: INSERT INTO `new_user` ( `name` ,`yyyymmdd` ,`email` ,`introduce` ) VALUES ( ? ,? ,? ,? ,NOW() ,NOW() )

### Cause: java.sql.SQLException: Column count doesn't match value count at row 1

; bad SQL grammar []; nested exception is java.sql.SQLException: Column count doesn't match value count at row 1] with root cause

java.sql.SQLException: Column count doesn't match value count at row 1

 

 

 

 

🌳 해결 방법
🌾 원인 :xml 쿼리에서 createAT, updatedAt 안써서 values와 매칭이 안됬다.

🌾 해결 방법 : xml쿼리를 insert 부분과 values 부분 매칭 되게 수정.

 

<전>

 

