
CREATE TABLE topic(
    id VARCHAR(50) PRIMARY KEY,
    title VARCHAR(200),
    content VARCHAR(500),
    userid VARCHAR(50)
)

INSERT INTO topic VALUES("1","标题1","内容1");
INSERT INTO topic VALUES("2","标题2","内容2");

CREATE TABLE USER(
    id VARCHAR(50) PRIMARY KEY,
    username VARCHAR(50),
    PASSWORD VARCHAR(50),
    nick VARCHAR(50),
   spring_mybatis picture VARCHAR(300)
)

INSERT INTO USER VALUES("1","bbb","bbb","小明",NULL);
