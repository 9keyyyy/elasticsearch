# elasticsearch

### ✅ elasticsearch를 이용한 간단한 검색 기능 구현
- docker로 elasticsearch 설치
  ```
  docker pull docker.elastic.co/elasticsearch/elasticsearch:7.10.0
  docker run -d -p 9200:9200 -p 9300:9300 -e "discovery.type=single-node" docker.elastic.co/elasticsearch/elasticsearch:7.10.0
  ```
- spring data elasticsearch 통해 연동
- [reference](https://tecoble.techcourse.co.kr/post/2021-10-19-elasticsearch/)
