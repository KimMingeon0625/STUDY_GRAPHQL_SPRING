---
description: GraphQL doc
---

# GraphQL Doc

#### GraphQL-KR : [<mark style="color:green;">https://graphql-kr.github.io/learn/</mark>](https://graphql-kr.github.io/learn/)<mark style="color:green;"></mark>

### Release

| _Prerelease_     | [Working Draft](http://spec.graphql.org/draft)      | Thu, Nov 4, 2021  |                                                                                   |
| ---------------- | --------------------------------------------------- | ----------------- | --------------------------------------------------------------------------------- |
| _Latest Release_ | [October 2021](http://spec.graphql.org/October2021) | Tue, Oct 26, 2021 | [Release Notes](https://github.com/graphql/graphql-spec/releases/tag/October2021) |
|                  | [June 2018](http://spec.graphql.org/June2018)       | Sun, Jun 10, 2018 | [Release Notes](https://github.com/graphql/graphql-spec/releases/tag/June2018)    |
|                  | [October 2016](http://spec.graphql.org/October2016) | Mon, Oct 31, 2016 | [Release Notes](https://github.com/graphql/graphql-spec/releases/tag/October2016) |
|                  | [April 2016](http://spec.graphql.org/April2016)     | Thu, Apr 7, 2016  | [Release Notes](https://github.com/graphql/graphql-spec/releases/tag/April2016)   |
|                  | [October 2015](http://spec.graphql.org/October2015) | Thu, Oct 1, 2015  | [Release Notes](https://github.com/graphql/graphql-spec/releases/tag/October2015) |
|                  | [July 2015](http://spec.graphql.org/July2015)       | Thu, Jul 2, 2015  | [Release Notes](https://github.com/graphql/graphql-spec/releases/tag/July2015)    |

Lastest Release : GraphQL Foundation에서 승인한 GraphQL 사양의 첫 번째 릴리스.

([http://spec.graphql.org/](http://spec.graphql.org))


### API Doc

#### GraphiQL : [https://github.com/graphql/graphiql](https://github.com/graphql/graphiql)

#### GraphQL-Playground : [https://github.com/graphql/graphql-playground](https://github.com/graphql/graphql-playground)



### Lib

#### kickstart : [https://github.com/graphql-java-kickstart](https://github.com/graphql-java-kickstart)

> &#x20;GraphQL Java Kickstart라는 github 그룹에서 관리하는 라이브러리인데 설명이나 공식 문서를 보면 graphql-java를 기반으로 여러 유용한 기능들을 제공하는 그룹으로 보인다.
>
> GraphQL Java Tools에 주목했던 이유는 스키마를 만드는 방식 때문이다. GraphQL Java에서 매우 아쉬운 점이 타입을 정의 할 때 builder 패턴처럼 코드로 스키마를 정의 한다. 이런 방식은 아무래도 직관적이지 못하다.
>
> 반면 GraphQL Java Tools는 GraphQL Tools ([https://github.com/ardatan/graphql-tools](https://github.com/ardatan/graphql-tools))에서 영감을 받아 만들어져 좀 더 직관적인 방식으로 스키마를 정의 할 수 있다. 차이가 있다면 GraphQL Tools 에서는 문자열로 스키마를 정의해 설정 하지만 GraphQL Java Tools에서는 graqhql 파일에 스키마를 설정한다.
>
> 출처 : [https://velog.io/@oenomel87/Java%EB%A1%9C-GraphQL](https://velog.io/@oenomel87/Java%EB%A1%9C-GraphQL)



### application.yaml

```
graphql:
  servlet:
    enabled: true
    mapping: /graphql
    corsEnabled: false
    cors:
      allowed-origins: http://localhost:8080
      allowed-methods: GET, HEAD, POST, PATCH
    exception-handlers-enabled: true
    context-setting: PER_REQUEST_WITH_INSTRUMENTATION
    async-mode-enabled: true
  tools:
    schema-location-pattern: "**/*.graphqls"
    introspection-enabled: true
  playground: # Playground on/off 
    enabled: true    
```

*   playground를 사용한 경우 on/off 에 주의. 스키마 노출이 되는 경우, 보안 문제로 이어질 수 있다.

    개발단계가 아닌 운영의 경우 접근을 제한하는 것이 좋아 보인다.

    graphql.playground.ened : true(사용), false(미사용)&#x20;
