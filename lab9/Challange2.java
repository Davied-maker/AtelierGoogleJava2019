package lab9;

import reactor.core.publisher.Mono;

public class Challange2 {
    private Mono<String> emptyMono(){
        return Mono.empty();
    }
    private Mono<String> fooMono() {
        return Mono.just("Foo");
    }
    public static void main(String[] args) {
        Challange2 ch = new Challange2();
        ch.emptyMono().subscribe(System.out::println);

        ch.fooMono().subscribe(System.out::println);

    }
}
