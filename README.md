# Mission_kiuk

## 프로젝트 이름

---

익명 의견 교환 웹 페이지

### 프로젝트 개요

---

사용자들이 자기 자신의 정보를 직접 드러낼 필요 없이 의견을 교환할 수 있는 웹 페이지를 만들어보아요!
단, 자신이 누군지를 드러낼 필요는 없지만 작성한 사람이 원한다면 수정 ∙ 삭제는 가능해야합니다.

## 기능 설명

---

### 1. 필수 과제

- 게시판 관련 기능
- 게시글 관련 기능
- 댓글 관련 기능

### 2. 선택 과제

- 해시태그(#) 기능
- 검색 관련 기능
- 게시글 추가 기능

<hr>

# 구동방법
<details>
  <summary> 토글 접기/펼치기</summary>
  <div markdown="1">
    <hr>
    Git clone 후 Intellij 로 mini 폴더를 열어준다<br>
    localhost:8080/board/home -> 기본 페이지
    <hr>
      <ul>
        <li>게시판</li>
        <p>
          게시판
          기본페이지에는 각 게시판들이 존재하며 게시판을 클릭하면 선택한 게시판으로 이동한다.
          전체글 보기를 누르면 모든 글을 볼 수 있다.
        </p>
        <li>게시글 작성</li>
        <p>
          게시글작성
          Home에서의 게시글 작성을 할때에는 게시판이 defalt로 선택되어 있지 않다.
          특정 게시판에서 게시글을 작성시에는 게시판이 현재 작성하는 게시판의 값으로 기본 설정 된다.
          게시글의 내용은 아래의 규칙을 지켜야 한다
          제목 -> 3글자 이상
          내용 -> 5글자 이상
          비밀번호 -> 3글자 이상
        </p>
        <li>해시태그</li>
        <p>
          해시태그
          게시글 작성 시 # 를 붙이면 해시태그가 자동으로 생성된다
          ex) #멋쟁이 #사자 #코드 #백엔드 #프론트엔드 #자바 #Java #Back_End
          #뒤에 인식가능한 글자는 알파벳과 언더바 (_) 와 한글 (ㄱㄱ , ㄴㄴ 와 같은 자음 혹은 모음만 있는 한글은 불가 )이다.
          해시태그를 클릭 시, 동일한 해시태그가 있는 글을 보여준다.
        </p>
        <li>게시글</li>
        <p>
          특정 게시판을 선택해서 들어가면 게시판에 맞는 게시글을 볼 수있다.
          게시글을 누르면 게시글을 내용을 볼 수 있다.
        </p>
        <li>수정,삭제</li>
        <p>
          수정,삭제는 게시글 작성 시 입력했던 패스워드를 입력시 진행할 수 있다.
        </p>
        <li>검색</li>
        <p>
          검색은 제목, 내용을 선택해서 검색할 수 있다.
          특정 게시판에서 검색시에는 그 게시판의 글들만 검색이 되고,
          전체글 보기에서 검색하면 모든 글을 검색할 수 있다.
        </p>
      </ul>
  </div>
</details>

# 후기
<details>
  <summary>토글 접기/펼치기</summary>
    <div markdowm="1">
      처음에는 Controoler, Entity, Repository, Service 가 어떤식으로 만들고 활용하는지 잘 몰랐는데,
      계속 하다보니 점점 더 익숙해지는 것 같다.  
      MVC패턴이 어떤식으로 흘러가는지 이해가 되는 것 같다.  
      Jpa도 마찬가지로 서버에서 데이터를 어떻게 가져오고 보내야 할지 프로젝트를 진행하면서 점점 더 깨달아 가는 것 같다.
    </div>
    <br>
    <br>
    <div markdowm="1">
      힘들었던 부분은 Entity에서 관계를 설정하는 것인데, One to Many, Many to One, Many to Many 등 관계를 어떻게 설정하고,
      어떻게 Mapping을 해줘야 하는지 너무 어려웠다.  
      서칭을 하며 관계를 설정하는것에 성공하였지만, 아직 이해도가 높지 않아서 이 부분에 관하여 더욱 더 학습을 해야할 것 같다.  
      또한 특정 Contolloer에서 Servie를 @Autowired 를 쓰지 않으면 NullPointerException이 나타나는데, 이것에 대한 원인을 잘 모르겠다.  
      마지막에 테스트를 위해 ddl-auto: create ->update 로 수정 후, 깃 업데이트 및 테스트를 진행했을 때, 데이터가 계속 2개 들어가서 고민을하다  
      생각해보니 create 한번 후, drop을 해줘야 한다는 것을 알고, drop후에 다시 깃 업로드를 했음.
    </div>
    <br>
    <br>
    <div markdowm="1">
      아쉬웠던 부분은 아무래도 프론트쪽이다.  
      view 페이지를 먼저 작업을 해두었으면 편했을 것 같지만, 코드를 작성하며 그때 그때 페이지를 만들고 코드를 수정하다보니  
      나중에 view페이지를 꾸미려 해도 어디서부터 손을 대야할지 가늠이 잡히지 않았다.  
      추 후 다시 프로젝트를 진행한다면 View페이지를 어느정도 꾸며놓고 진행해야 백엔드 작업의 가독성도 좋아져서 작업도 수월할 것 같다.  
      또한 일정을 조금 더 빠뜻하게 잡았더라면 File 전송 까지 완성했을것 같은데, 못해서 아쉬움이 남는다.
    </div>
</details>



